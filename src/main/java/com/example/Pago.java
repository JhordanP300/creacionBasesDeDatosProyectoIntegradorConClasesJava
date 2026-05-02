package com.example;

public class Pago {

    int idPago; // Llave primaria
    private Predio predio; // Llave foránea a Predio
    private String mes;
    private int año;
    private double valorTarifa;
    private double vlorPagado;

    public Pago(int idPago, Predio predio, String mes, int año, double valorTarifa, double vlorPagado) {
        this.idPago = idPago;
        this.predio = predio;
        this.mes = mes;
        this.año = año;
        this.valorTarifa = valorTarifa;
        this.vlorPagado = vlorPagado;
    }

    public boolean estaPagado() {
        double valorPagado = 0;
        return valorPagado >= valorTarifa;
    }

    public double geValorRestante() {
        return valorTarifa - vlorPagado;
    }

}
