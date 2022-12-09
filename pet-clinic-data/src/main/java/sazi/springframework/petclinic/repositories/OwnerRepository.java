package sazi.springframework.petclinic.repositories;

import org.springframework.data.repository.CrudRepository;
import sazi.springframework.petclinic.model.Owner;

public interface OwnerRepository extends CrudRepository<Owner,Long> {
}
