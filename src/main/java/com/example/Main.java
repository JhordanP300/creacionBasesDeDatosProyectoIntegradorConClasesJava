package com.example;

public class Main {
    public static void main(String[] args) {
        
        Usuario usuario1 = new Usuario("70141708","Jorge","Andres","Gomez","Perez","3112457874");
        System.out.println("Cedula: " + usuario1.getCedula());
        System.out.println("Primer Nombre: " + usuario1.getPrimerNombre());
        System.out.println("Segundo Nombre: " + usuario1.getSegundoNombre());
        System.out.println("Primer Apellido: " + usuario1.getPrimerApellido());
        System.out.println("Segundo Apellido: " + usuario1.getSegundoApellido());
        System.out.println("Celular: " + usuario1.getCelular());
    }
}