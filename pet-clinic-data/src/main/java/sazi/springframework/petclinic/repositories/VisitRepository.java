package sazi.springframework.petclinic.repositories;

import org.springframework.data.repository.CrudRepository;
import sazi.springframework.petclinic.model.Visit;

public interface VisitRepository extends CrudRepository<Visit,Long> {
}
