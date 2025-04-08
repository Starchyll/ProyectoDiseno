/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Control;

import Frames.BuscarViaje;
import Frames.MainMenu;
import Frames.ViajesDisponibles;
import java.util.List;

/**
 *
 * @author chris
 */
public class CordinadorPresentacion {

    private static CordinadorPresentacion instancia;

    private ControlNegocio controlNegocio = ControlNegocio.getInstancia();

    public CordinadorPresentacion() {
    }

    public static CordinadorPresentacion getInstancia() {
        if (instancia == null) {
            instancia = new CordinadorPresentacion();
        }
        return instancia;
    }

    public void abrirPantallaPrincipal() {
        MainMenu forma = new MainMenu();
        forma.setVisible(true);
    }

    public void abrirBusquedaViaje() {
        BuscarViaje forma = new BuscarViaje();
        forma.setVisible(true);
    }

    public void abrirViajesDisponibles() {
        ViajesDisponibles forma = new ViajesDisponibles();
        forma.setVisible(true);
    }

    public List<String> buscarOrigenesDisponibles() {
        return ControlNegocio.getInstancia().obtenerOrigenesDisponibles();
    }

    public List<String> buscarDestinosDisponibles(String origen) {
        return ControlNegocio.getInstancia().obtenerDestinosDisponibles(origen);
    }

}
