/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Control;

import itson.rutappdto.ViajeDTO;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;
import javax.swing.JOptionPane;

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

    public List<ViajeDTO> obtenerListaViajes() {
        List<ViajeDTO> viajes = new ArrayList<>();
        ViajeDTO viaje1 = new ViajeDTO(1L, 300.0, "Cd. Obregón", "Hermosillo", "3h 30min", 1L);
        ViajeDTO viaje2 = new ViajeDTO(2L, 300.0, "Cd. Obregón", "Hermosillo", "3h 30min", 2L);
        ViajeDTO viaje3 = new ViajeDTO(3L, 300.0, "Hermosillo", "Navojoa", "3h 30min", 1L);

        viajes.add(viaje1);
        viajes.add(viaje2);
        viajes.add(viaje3);
        return viajes;

    }

    public String[][] obtenerViajesDisponibles(String origen, String destino, LocalDate fecha) {
//        IConsultarDisponibilidad consultar = new ConsultarDisponibilid();
//
//        try {
//            listaaObtenida = consultar.getViajesDisponibles(origen, destino, fecha
//        } catch (Exception e) {
//        }
//        if (listaaObtenida) {
//             == null
//        }
//        ){
//            JOptionPane
//        }
//        return listaObtenida;
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
