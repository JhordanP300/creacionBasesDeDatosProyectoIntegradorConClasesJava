package com.example.repository;

import jakarta.persistence.EntityManager;
import com.example.Pago;
import com.example.repository.impl.GenericRepositoryImpl;

public class PagoRepository extends GenericRepositoryImpl<Pago, Long> {
    public PagoRepository(EntityManager em) { super(em, Pago.class); }
}
