package esprit.tn.ms2foyer.repository;


import esprit.tn.ms2foyer.entity.Foyer;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FoyerRepository extends MongoRepository<Foyer, String> {
}
