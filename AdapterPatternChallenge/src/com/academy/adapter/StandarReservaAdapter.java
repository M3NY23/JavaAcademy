package com.academy.adapter;

import java.util.Date;

public class StandarReservaAdapter extends ReservaCV{
    private ReservaCV miSistema;

    public StandarReservaAdapter(ReservaCV sistema) {
        this.setMiSistema(sistema);
    }

    public ReservaCV getMiSistema() {
        return miSistema;
    }

    public void setMiSistema(ReservaCV miSistema) {
        this.miSistema = miSistema;
    }

    public String getInfo(String idHotel) {
        return idHotel;
    }

    public String crearReserva(Date fecha, int dias, String idHotel, String cliente) {
        return "Reserva creada";
    }

    public String datoReserva(String codigo) {
        return "datoReserva";
    }
}
