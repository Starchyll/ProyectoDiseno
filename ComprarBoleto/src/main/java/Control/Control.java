/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Control;

import Ex.CompraBoletoException;
import enumm.estadoAsiento;
import itson.rutappdto.AsientoDTO;
import itson.rutappdto.CamionDTO;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author BusSoft®
 */
public class Control {

    public void obtenerAsientosDisponibles() {
        System.out.println("Obteniendo asientos disponibles...");
    }

    public void obtenerViajesDisponibles() {
        System.out.println("Mostrando viajes disponibles...");
    }

    public void buscarViaje() {
        System.out.println("Buscando viaje según criterios...");
    }

    public List<AsientoDTO> mostrarListaAsientos(CamionDTO camion) throws CompraBoletoException {
        if (camion.getListaAsiento().isEmpty()) {
            return null;
        }
        return camion.getListaAsiento();
    }

    public List<AsientoDTO> mostrarListaAsientos() {
        List<AsientoDTO> listaAsientos = new ArrayList<>();

        listaAsientos.add(new AsientoDTO(1L, estadoAsiento.DISPONIBLE, "A1"));
        listaAsientos.add(new AsientoDTO(2L, estadoAsiento.OCUPADO, "A2"));
        listaAsientos.add(new AsientoDTO(3L, estadoAsiento.DISPONIBLE, "A3"));
        listaAsientos.add(new AsientoDTO(4L, estadoAsiento.DISPONIBLE, "A4"));
        listaAsientos.add(new AsientoDTO(5L, estadoAsiento.DISPONIBLE, "A5"));
        

        return listaAsientos;

    }

    public void mostrarPantallaPago() {
        System.out.println("Mostrando pantalla de pago...");
    }

    public void validarAsiento(int asiento) {
        System.out.println("Validando asiento: " + asiento);
    }

    public void registrarCompra() {
        System.out.println("Compra registrada exitosamente.");
    }
}
