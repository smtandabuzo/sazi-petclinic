package sazi.springframework.petclinic.repositories;

import org.springframework.data.repository.CrudRepository;
import sazi.springframework.petclinic.model.Pet;

public interface PetRepository extends CrudRepository<Pet,Long> {
}
