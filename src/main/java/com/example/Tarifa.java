package com.example;

public class Tarifa {

    private final TipoPredio tipoPredio;
    private final double valor;

    public Tarifa(TipoPredio tipoPredio, double valor) {
        this.tipoPredio = tipoPredio;
        this.valor = valor;
    }

    public TipoPredio getTipoPredio() {
        return tipoPredio;
    }

    public double getValor() {
        return valor;
    }

}
