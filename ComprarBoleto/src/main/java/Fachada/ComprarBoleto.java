/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Fachada;

import Control.Control;
import Ex.CompraBoletoException;
import Interfaz.IComprarBoleto;
import itson.rutappdto.AsientoDTO;
import itson.rutappdto.CamionDTO;
import java.util.List;

/**
 *
 * @author multaslokas33
 */
public class ComprarBoleto implements IComprarBoleto {

    private Control control;

    public ComprarBoleto() {
        control = new Control();
    }

    @Override
    public void consultarAsientos() {
        control.obtenerAsientosDisponibles();
    }

    @Override
    public void mostrarViajesDisponibles() {
        control.obtenerViajesDisponibles();
    }

    @Override
    public void mostrarBusquedaViaje() {
        control.buscarViaje();
    }

    @Override
    public List<AsientoDTO> mostrarListaAsientos(CamionDTO camion) throws CompraBoletoException {
        return control.mostrarListaAsientos(camion);
    }

    @Override
    public void mostrarPantallaPago() {
        control.mostrarPantallaPago();
    }

    @Override
    public void seleccionarAsiento(int asiento) {
        control.validarAsiento(asiento);
    }

    @Override
    public void comprarBoleto() {
        control.registrarCompra();
    }
}
