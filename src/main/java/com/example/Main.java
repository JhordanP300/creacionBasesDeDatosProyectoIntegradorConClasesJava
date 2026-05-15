package com.example;

import java.util.List;

import com.example.repository.UsuarioRepository;
import com.example.util.JpaUtil;

import jakarta.persistence.EntityManager;

public class Main {
    public static void main(String[] args) {

        // 1. Obtener el gestor de entidades
        EntityManager em = JpaUtil.getEntityManager();

        try {
            System.out.println("--- Ejemplo Hibernate Simplificado ---");

            // 2. Crear y persistir un Usuario (Requiere Transacción)
            Usuario user = new Usuario();
            user.setCedula(123456789);
            user.setPrimerNombre("Juan");
            user.setSegundoNombre("Perez");
            user.setPrimerApellido("Gomez");
            user.setSegundoApellido("Perez");
            user.setCelular("3112457874");

            em.getTransaction().begin();
            em.persist(user); // Hibernate prepara el INSERT
            em.getTransaction().commit(); // Se ejecuta el SQL físicamente
            System.out.println("Usuario guardado: " + user.getCedula());

            // 3. Listar Usuarios usando JPQL
            System.out.println("\n--- Lista de Usuarios ---");
            List<Usuario> users = em.createQuery("SELECT u FROM Usuario u", Usuario.class).getResultList();
            users.forEach(u -> System.out.println("ID: " + u.getCedula() + " | Name: " + u.getPrimerNombre()));

        } catch (Exception e) {
            // Si algo falla, deshacemos los cambios para evitar datos corruptos
            if (em.getTransaction().isActive()) em.getTransaction().rollback();
            e.printStackTrace();
        } finally {
            // 4. Cerrar recursos siempre
            em.close();
            JpaUtil.close();
        }


        em = JpaUtil.getEntityManager();
        UsuarioRepository usuarioRepository = new UsuarioRepository(em);

        try {
            System.out.println("--- Ejecutando enfoque Repository ---");
            Usuario user = new Usuario();
            user.setPrimerNombre("JavaPro_" + System.currentTimeMillis());
            usuarioRepository.save(user);
            
            usuarioRepository.findAll().forEach(u -> System.out.println(u.getPrimerNombre()));
        } finally {
            em.close();
            JpaUtil.close();
        }




    }
}