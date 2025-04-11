package control;

import enumm.estadoAsiento;
import excepciones.SeleccionAsientoException;
import itson.rutappdto.AsientoDTO;
import itson.rutappdto.CamionDTO;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author pedro
 */
public class ControlSeleccionAsiento {

    private static ControlSeleccionAsiento instance;

    public ControlSeleccionAsiento() {
    }

    /**
     * Método para obtener la instancia del singleton.
     *
     * @return una instancia de tipo Control.
     */
    public static ControlSeleccionAsiento getInstancia() {
        if (instance == null) {
            instance = new ControlSeleccionAsiento();
        }
        return instance;
    }

    /**
     * Lista local de asientos utilizada como ejemplo o datos por defecto.
     */
    List<AsientoDTO> listaAsientos = new ArrayList<>();

    {
        listaAsientos.add(new AsientoDTO(1L, estadoAsiento.DISPONIBLE, "A1"));
        listaAsientos.add(new AsientoDTO(2L, estadoAsiento.OCUPADO, "A2"));
        listaAsientos.add(new AsientoDTO(3L, estadoAsiento.DISPONIBLE, "A3"));
        listaAsientos.add(new AsientoDTO(4L, estadoAsiento.DISPONIBLE, "A4"));
        listaAsientos.add(new AsientoDTO(5L, estadoAsiento.DISPONIBLE, "A5"));
    }



    /**
     * Actualiza el estado del asiento alternando entre DISPONIBLE y OCUPADO.
     *
     * @param asiento El objeto AsientoDTO cuyo estado se desea actualizar.
     */
    public void actualizarEstadoAsiento(AsientoDTO asiento) {
        if (asiento.getEstado() == estadoAsiento.DISPONIBLE) {
            asiento.setEstado(estadoAsiento.OCUPADO);
        } else {
            asiento.setEstado(estadoAsiento.DISPONIBLE);
        }
    }

    /**
     * Obtiene el estado actual de un asiento.
     *
     * @param asiento El objeto AsientoDTO del cual se desea obtener el estado.
     * @return El estado del asiento (DISPONIBLE u OCUPADO).
     * @throws SeleccionAsientoException Si el objeto asiento es null.
     */
    public estadoAsiento obtenerEstadoAsiento(AsientoDTO asiento) throws SeleccionAsientoException {
        if (asiento == null) {
            throw new SeleccionAsientoException("Error al obtener el asiento.");
        }
        return asiento.getEstado();

    }

    /**
     * Cambia el estado del asiento a OCUPADO.
     *
     * @param asiento El objeto AsientoDTO que se desea apartar.
     * @throws SeleccionAsientoException Si el objeto asiento es null.
     */
    public void apartarAsiento(AsientoDTO asiento) throws SeleccionAsientoException {
        if (asiento == null) {
            throw new SeleccionAsientoException("Error al obtener el asiento.");
        }
        asiento.setEstado(estadoAsiento.OCUPADO);
    }

    /**
     * Verifica si un asiento está disponible.
     *
     * @param asiento El objeto AsientoDTO a validar.
     * @return true si el asiento está DISPONIBLE, false en caso contrario.
     * @throws SeleccionAsientoException Si el objeto asiento es null.
     */
    public boolean validarDisponibilidadAsiento(AsientoDTO asiento) throws SeleccionAsientoException {
        if (asiento == null) {
            throw new SeleccionAsientoException("Error al obtener el asiento.");
        }
        return asiento.getEstado() == estadoAsiento.DISPONIBLE;
    }

    public List<AsientoDTO> mostradoListaAsientos(CamionDTO camion) {
        return camion.getListaAsiento();
    }

}
