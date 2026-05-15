package com.example.repository;

import jakarta.persistence.EntityManager;
import com.example.Usuario;
import com.example.repository.impl.GenericRepositoryImpl;

public class UsuarioRepository extends GenericRepositoryImpl<Usuario, Long> {
    public UsuarioRepository(EntityManager em) { super(em, Usuario.class); }
}

