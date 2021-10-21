package guru.springframework.sfgpetclinic.services;
/*
 * created by Joseph Yacoub on 21 Oct 2021
 */

import guru.springframework.sfgpetclinic.model.Pet;

import java.util.Set;

public interface PetService {

    Pet findById(Long id);

    Pet save(Pet pet);

    Set<Pet> findAll();
}
