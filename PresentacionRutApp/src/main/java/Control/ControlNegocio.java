/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Control;

import Ex.CompraBoletoException;
import Fachada.ComprarBoleto;
import Interfaz.IComprarBoleto;
import control.ControlSeleccionAsiento;
import excepciones.SeleccionAsientoException;
import itson.consultardisponibilidad.Interfaz.IConsultarDisponibilidad;
import itson.consultardisponibilidad.fachada.FachadaConsultarDisponibilidad;
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

    IConsultarDisponibilidad consultarDisponibilidad = new FachadaConsultarDisponibilidad();
    IComprarBoleto comprarBoleto = new ComprarBoleto();

    private static ControlNegocio instancia;

    public ControlNegocio() {
    }

    

    public static ControlNegocio getInstancia() {
        if (instancia == null) {
            instancia = new ControlNegocio();
        }
        return instancia;
    }

    /**
     * Método que se comunica con el subsistmea y regresa la lista de destinos.
     * @param origen De donde se parte.
     * @return 
     */
    public List<String> obtenerDestinosDisponibles(String origen) {
        List<String> destinos = consultarDisponibilidad.consultarDestinos(origen);
        if (destinos.isEmpty()){
            JOptionPane.showMessageDialog(null, 
                    "No hay destinos para este parametro", 
                    "Sin coincidencias", JOptionPane.ERROR_MESSAGE);
            return null;
        }
        return destinos;
    }

    public List<String> obtenerOrigenesDisponibles() {
        return Arrays.asList("Huatabampo", "Los mochis", "Tucson Az.");
    }

    public List<ViajeDTO> obtenerListaViajes(String origen, String Destino, LocalDate fecha) {
        List<ViajeDTO> viajes = consultarDisponibilidad.consultarViajesDisponibles(origen, Destino, fecha);
        if(viajes.isEmpty() ){
            JOptionPane.showMessageDialog(null, 
                    "No se encontraron viajes para estos parametros", 
                    "Sin coincidencias", JOptionPane.ERROR_MESSAGE);
            return null;
        } else {
            return viajes;
        }
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

    public void obtenerMetodoPago() {

    }

    public void obtenerDatos() {

    }

    public void obtenerMonedero() {

    }

    public void cancelarAsientos() {

    }

    public void apartarAsiento(AsientoDTO asiento) throws SeleccionAsientoException {
        if(asiento == null){
            throw new SeleccionAsientoException("Error de asiento");
        }
        ControlSeleccionAsiento.getInstancia().apartarAsiento(asiento);
    }

    public void iniciarContador() {

    }

    public void registrarDetallesBoleto() {

    }

    public List<AsientoDTO> obtenerAsientos(CamionDTO camion) throws CompraBoletoException {
        return comprarBoleto.mostrarListaAsientos(camion);

    }
}
