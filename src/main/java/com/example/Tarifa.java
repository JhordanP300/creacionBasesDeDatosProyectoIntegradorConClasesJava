package com.example;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Enumerated;
import jakarta.persistence.EnumType;

@Entity
@Table(name = "Tarifa") // Nombre de la tabla en la DB

public class Tarifa {

    @Id // Define la llave primaria
    @GeneratedValue(strategy = GenerationType.IDENTITY) // Auto-incremental
    
    private Long idTarifa; // Llave primaria
    
    @Enumerated(EnumType.STRING)
    private TipoPredio tipoPredio;
    private double valor;

    public Tarifa() {
        this.tipoPredio = null;
        this.valor = 0.0;
    } // Constructor vacío obligatorio para Hibernate

    public Tarifa(Long idTarifa, TipoPredio tipoPredio, double valor) {
        this.idTarifa = idTarifa;
        this.tipoPredio = tipoPredio;
        this.valor = valor;
    }

    public Long getIdTarifa() {
        return idTarifa;
    }

    public TipoPredio getTipoPredio() {
        return tipoPredio;
    }

    public double getValor() {
        return valor;
    }

}
