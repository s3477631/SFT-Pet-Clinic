package ordered.sftpetclinic.petclinic.services;

import ordered.sftpetclinic.petclinic.model.Pet;

import java.util.Set;

public interface PetService {
    Pet findById(Long id);
    Pet save(Pet owner);
    Set<Pet> findAll();
}
