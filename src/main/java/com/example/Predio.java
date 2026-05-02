package com.example;

public class Predio {

    private final int codigoPredio;
    private final TipoPredio tipoPredio;
    private final Usuario propietario; // Llave foránea a Usuario

    public Predio(int codigoPredio, TipoPredio tipoPredio, Usuario propietario) {
        this.codigoPredio = codigoPredio;
        this.tipoPredio = tipoPredio;
        this.propietario = propietario;
    }

    public TipoPredio getTipoPredio() {
        return tipoPredio;
    }

    public int getCodigoPredio() {
        return codigoPredio;
    }

    public Usuario getPropietario() {
        return propietario;
    }

}
