package esprit.tn.ms2foyer.controller;




import esprit.tn.ms2foyer.entity.Foyer;
import esprit.tn.ms2foyer.service.IFoyerService;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@AllArgsConstructor
@RequestMapping("/api/foyers")
public class FoyerController {

    private IFoyerService foyerService;

    // Constructor injection or field injection (if preferred as in your example)
    @PostMapping("/addFoyer")
    public Foyer addFoyer(@RequestBody Foyer foyer) {
        return foyerService.addFoyer(foyer);
    }



    @GetMapping("/getFoyerById/{idFoyer}")
    public Optional<Foyer> retrieveFoyer(@PathVariable String idFoyer) {
        return foyerService.getFoyerById(idFoyer);
    }

    @GetMapping("/getFoyers")
    public List<Foyer> retrieveAllFoyers() {
        return foyerService.getAllFoyers();
    }

}
