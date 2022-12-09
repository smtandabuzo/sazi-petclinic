package sazi.springframework.petclinic.services.springdatajpa;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;
import sazi.springframework.petclinic.model.Owner;
import sazi.springframework.petclinic.repositories.OwnerRepository;
import sazi.springframework.petclinic.repositories.PetRepository;
import sazi.springframework.petclinic.repositories.PetTypeRepository;
import sazi.springframework.petclinic.services.OwnerService;

import java.util.HashSet;
import java.util.Optional;
import java.util.Set;

@Service
@Profile("Sofdsfsl")
public class OwnerSDJpaService implements OwnerService {
    private final OwnerRepository ownerRepository;
    private final PetRepository petRepository;
    private final PetTypeRepository petTypeRepository;

    public OwnerSDJpaService(OwnerRepository ownerRepository, PetRepository petRepository,
                             PetTypeRepository petTypeRepository) {
        this.ownerRepository = ownerRepository;
        this.petRepository = petRepository;
        this.petTypeRepository = petTypeRepository;
    }

    @Override
    public Set<Owner> findAll() {
        Set<Owner> owners = new HashSet<>();
        ownerRepository.findAll().forEach(owners::add);
        return owners;
    }

    @Override
    public Owner findById(Long aLong) {
        return ownerRepository.findById(aLong).orElse(null);
    }

    @Override
    public Owner save(Owner object) {
        return ownerRepository.save(object);
    }

    @Override
    public void delete(Owner object) {
        ownerRepository.delete(object);
    }

    @Override
    public void deleteById(Long aLong) {
        ownerRepository.deleteById(aLong);
    }

    @Override
    public Owner findByLastName(String lastName) {
        return ownerRepository.findByLastName(lastName);
    }
}
