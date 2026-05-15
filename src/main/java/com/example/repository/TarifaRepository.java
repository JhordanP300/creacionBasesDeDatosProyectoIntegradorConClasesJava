package com.example.repository;

import com.example.Tarifa;
import com.example.repository.impl.GenericRepositoryImpl;

import jakarta.persistence.EntityManager;

public class TarifaRepository extends GenericRepositoryImpl<Tarifa, Long> {
    public TarifaRepository(EntityManager em) { super(em, Tarifa.class); }
}
