package com.example;

public class Usuario {

    private String cedula;
    private String PrimerNombre;
    private String SegundoNombre;
    private String PrimerApellido;
    private String SegundoApellido;
    private String celular;

    public Usuario(String cedula, String primerNombre, String segundoNombre, String primerApellido, String segundoApellido, String celular) {
        this.cedula = cedula;
        PrimerNombre = primerNombre;
        SegundoNombre = segundoNombre;
        PrimerApellido = primerApellido;
        SegundoApellido = segundoApellido;
        this.celular = celular;
    }

    public String getCedula() {
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

}
