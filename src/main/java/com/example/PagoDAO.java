package com.example;

public interface PagoDAO {

    void registrarPago(Pago pago);

    Pago buscarPago(int idPago);

}
