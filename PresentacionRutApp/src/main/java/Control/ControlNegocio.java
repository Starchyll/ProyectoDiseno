/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Control;

import Ex.CompraBoletoException;
import Fachada.ComprarBoleto;
import Interfaz.IComprarBoleto;
import enumm.estadoAsiento;
import itson.rutappdto.AsientoDTO;
import itson.rutappdto.CamionDTO;
import itson.rutappdto.ViajeDTO;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;
import javax.swing.JOptionPane;

/**
 *
 * @author chris
 */
public class ControlNegocio {

    IComprarBoleto comprarBoleto = new ComprarBoleto();

    private static ControlNegocio instancia;

    public ControlNegocio() {
    }

    private List<AsientoDTO> crearListaAsientos() {
        List<AsientoDTO> listaAsientos = new ArrayList<>();
        
        for (long i = 0; i < 24; i++) {
            String numero = String.valueOf(i);
            if (i == 5 ||i == 7 ||i == 20){
                listaAsientos.add(new AsientoDTO(i, estadoAsiento.OCUPADO, numero));
            } else {
                listaAsientos.add(new AsientoDTO(i, estadoAsiento.DISPONIBLE, numero));                
            }
            
        }
        return listaAsientos;
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

    public List<ViajeDTO> obtenerListaViajes(String origen, String Destino, LocalDate fecha) {
        List<ViajeDTO> viajes = new ArrayList<>();
        Long contador = 0L;
        for (int i = 0; i < 8; i++) {
            contador++;
            CamionDTO camion = new CamionDTO(contador, (i+1)+"a", crearListaAsientos());
            viajes.add(new ViajeDTO(300.00, origen, Destino, "3hr 30min", camion, fecha));
        }
        return viajes;
    }

    public List<ViajeDTO> obtenerViajesDisponibles(String origen, String Destino, LocalDate fecha) {
        return null;
    }

    ;
    

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

    public List<AsientoDTO> obtenerAsientos(CamionDTO camion) throws CompraBoletoException {
        return comprarBoleto.mostrarListaAsientos(camion);

    }
}
