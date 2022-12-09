package sazi.springframework.petclinic.repositories;

import org.springframework.data.repository.CrudRepository;
import sazi.springframework.petclinic.model.Vet;

public interface VetRepository extends CrudRepository<Vet,Long> {
}
