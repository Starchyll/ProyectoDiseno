/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Control;

import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;

/**
 *
 * @author chris
 */
public class ControlNegocio {

    private static ControlNegocio instancia;

    public ControlNegocio() {
    }

    public static ControlNegocio getInstancia() {
        if (instancia == null) {
            instancia = new ControlNegocio();
        }
        return instancia;
    }

    public List<String> obtenerDestinosDisponibles(String origen) {
        switch (origen) {
            case "Ciudad A":
                return Arrays.asList("Ciudad B", "Ciudad C");
            case "Ciudad B":
                return Arrays.asList("Ciudad A");
            case "Ciudad C":
                return Arrays.asList("Ciudad A", "Ciudad B");
            default:
                return new ArrayList<>();
        }
    }
    
    public List<String> obtenerOrigenesDisponibles() {
        return Arrays.asList("Ciudad A", "Ciudad B", "Ciudad C");
    }
    
    public void obtenerViajesDisponibles() {

    }

    public void comprarBoleto() {

    }

    public void obtenerCamioneesDisponibles() {

    }

    public void obtenerBoleto() {

    }

    public void obtenerDatosCompra() {

    }

    public void validarFecha() {

    }

    public void validarPago() {

    }

    public void obtenerFechaDisponible() {

    }

//    public void obtenerDestinosDisponibles() {
//
//    }


    public void obtenerMetodoPago() {

    }

    public void obtenerDatos() {

    }

    public void obtenerMonedero() {

    }

    public void cancelarAsientos() {

    }

    public void apartarAsiento() {

    }

    public void iniciarContador() {

    }

    public void registrarDetallesBoleto() {

    }
}
