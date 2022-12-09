package sazi.springframework.petclinic.repositories;

import org.springframework.data.repository.CrudRepository;
import sazi.springframework.petclinic.model.PetType;

public interface PetTypeRepository extends CrudRepository<PetType,Long> {
}
