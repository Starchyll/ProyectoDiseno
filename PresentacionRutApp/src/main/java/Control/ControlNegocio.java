/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Control;

import java.time.LocalDate;
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

    public String[][] obtenerViajesDisponibles(String origen, String destino, LocalDate fecha) {
        if (origen.equals("B") && destino.equals("A")) {
            return new String[][]{
                {"L-123", "Cd. Obregon", "Hermosillo", "3h 30min", "$300", "ABC123"},
                {"L-124", "Cd. Obregon", "Hermosillo", "3h 30min", "$300", "DEF456"},
                {"L-125", "Cd. Obregon", "Hermosillo", "3h 30min", "$300", "GHI789"}
            };
        }

        // Si no hay coincidencias, regresa arreglo vacío
        return new String[0][];
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
