package esprit.tn.ms2foyer.service;




import esprit.tn.ms2foyer.entity.Foyer;

import java.util.List;
import java.util.Optional;

public interface IFoyerService {
    Foyer addFoyer(Foyer foyer);
    List<Foyer> getAllFoyers();
    Optional<Foyer> getFoyerById(String id);
}
