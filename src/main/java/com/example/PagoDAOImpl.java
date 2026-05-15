package com.example;

import java.util.ArrayList;

public class PagoDAOImpl implements PagoDAO {

    private final ArrayList<Pago> pagos = new ArrayList<>();

    @Override

    public void registrarPago(Pago pago) {
        pagos.add(pago);

    }

    @Override
    public Pago buscarPago(int idPago) {
        for (Pago pago : pagos) {
            if (pago.getIdPago() == idPago) {
                return pago;
            }
        }
        return null; // No se encontró el pago
    }

}
