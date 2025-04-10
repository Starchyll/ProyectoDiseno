/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Interfaz;

import Ex.CompraBoletoException;
import itson.rutappdto.AsientoDTO;
import itson.rutappdto.CamionDTO;
import java.util.List;

/**
 *
 * @author multaslokas33
 */
public interface IComprarBoleto {
    void consultarAsientos();
    void mostrarViajesDisponibles();
    void mostrarBusquedaViaje();
    List<AsientoDTO> mostrarListaAsientos(CamionDTO camion) throws CompraBoletoException;
    void mostrarPantallaPago();
    void seleccionarAsiento(int asiento);
    void comprarBoleto();
}
