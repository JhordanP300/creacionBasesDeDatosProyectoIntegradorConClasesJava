package com.example;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "Usuario") // Nombre de la tabla en la DB

public class Usuario {

    @Id // Define la llave primaria
    @GeneratedValue(strategy = GenerationType.IDENTITY) // Auto-incremental

    private Long idUsuario; // Llave primaria
    private int cedula;
    private String PrimerNombre;
    private String SegundoNombre;
    private String PrimerApellido;
    private String SegundoApellido;
    private String celular;

    public Usuario() {} // Constructor vacío obligatorio para Hibernate

    public Usuario(Long idUsuario, int cedula, String primerNombre, String segundoNombre, String primerApellido, String segundoApellido, String celular) {
        this.idUsuario = idUsuario;
        this.cedula = cedula;
        PrimerNombre = primerNombre;
        SegundoNombre = segundoNombre;
        PrimerApellido = primerApellido;
        SegundoApellido = segundoApellido;
        this.celular = celular;
    }

    public Long getIdUsuario() {
        return idUsuario;
    }

    public int getCedula() {
        return cedula;
    }

    public String getPrimerNombre() {
        return PrimerNombre;
    }

    public String getSegundoNombre() {
        return SegundoNombre;
    }

    public String getPrimerApellido() {
        return PrimerApellido;
    }

    public String getSegundoApellido() {
        return SegundoApellido;
    }

    public String getCelular() {
        return celular;
    }

    public void setCedula(int cedula) {
        this.cedula = cedula;
    }

    public void setPrimerNombre(String primerNombre) {
        PrimerNombre = primerNombre;
    }

    public void setSegundoNombre(String segundoNombre) {
        SegundoNombre = segundoNombre;
    }

    public void setPrimerApellido(String primerApellido) {
        PrimerApellido = primerApellido;
    }

    public void setSegundoApellido(String segundoApellido) {
        SegundoApellido = segundoApellido;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }


}
