package com.springframework.sfgpetclinic.services;

import com.springframework.sfgpetclinic.model.Vet;

public interface VetService {

    Vet findById(Long id);

    Vet save(Vet vet);

    java.util.Set<Vet> findAll();
}
