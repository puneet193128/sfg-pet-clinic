package com.springframework.sfgpetclinic.services;

import com.springframework.sfgpetclinic.model.Pet;

public interface PetService {

    Pet findById(Long id);

    Pet save(Pet pet);

    java.util.Set<Pet> findAll();
}
