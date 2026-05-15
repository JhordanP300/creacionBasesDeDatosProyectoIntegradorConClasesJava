package com.example;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.JoinColumn;

@Entity
@Table(name = "Pago")

public class Pago {

    @Id // Define la llave primaria
    @GeneratedValue(strategy = GenerationType.IDENTITY) // Auto-incremental

    private Long idPago; // Llave primaria
    
    @ManyToOne
    @JoinColumn(name = "idPredio", nullable = false)
    private Predio predio; // Llave foránea a Predio
    private String mes;
    private int año;
    private double valorTarifa;
    private double valorPagado;

    public Pago() {} // Constructor vacío obligatorio para Hibernate

    public Pago(Long idPago, Predio predio, String mes, int año, double valorTarifa, double valorPagado) {
        this.idPago = idPago;
        this.predio = predio;
        this.mes = mes;
        this.año = año;
        this.valorTarifa = valorTarifa;
        this.valorPagado = valorPagado;
    }

    // Getters
    public Long getIdPago() {
        return idPago;
    }

    public Predio getPredio() {
        return predio;
    }

    public String getMes() {
        return mes;
    }

    public int getAño() {
        return año;
    }

    public double getValorTarifa() {
        return valorTarifa;
    }

    public double getValorPagado() {
        return valorPagado;
    }

    // Setters
    public void setIdPago(Long idPago) {
        this.idPago = idPago;
    }

    public void setPredio(Predio predio) {
        this.predio = predio;
    }

    public void setMes(String mes) {
        this.mes = mes;
    }

    public void setAño(int año) {
        this.año = año;
    }

    public void setValorTarifa(double valorTarifa) {
        this.valorTarifa = valorTarifa;
    }

    public void setValorPagado(double valorPagado) {
        this.valorPagado = valorPagado;
    }

    public boolean estaPagado() {
        return valorPagado >= valorTarifa;
    }

    public double getValorRestante() {
        return valorTarifa - valorPagado;
    }

}
