package itson.consultardisponibilidad.control;

import enumm.estadoAsiento;
import itson.rutappdto.AsientoDTO;
import itson.rutappdto.CamionDTO;
import itson.rutappdto.ViajeDTO;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 *
 * @author Bussoft®
 */
public class ControlConsultarDisponibilidad {

    private static ControlConsultarDisponibilidad instance;

    private ControlConsultarDisponibilidad() {
    }

    /**
     * Método para obtener la instancia del singleton.
     *
     * @return una instancia de tipo Control.
     */
    public static ControlConsultarDisponibilidad getInstancia() {
        if (instance == null) {
            instance = new ControlConsultarDisponibilidad();
        }
        return instance;
    }

    /**
     * Método mockeado para crear asientos para devolverlo.
     *
     * @return
     */
    private List<AsientoDTO> crearListaAsientos() {
        List<AsientoDTO> listaAsientos = new ArrayList<>();
        //Cuando le quitemos el mockeo seria CamionDTO.getListaAsientos();
        for (long i = 0; i < 24; i++) {
            String numero = String.valueOf(i);
            if (i == 5 || i == 7 || i == 20 || i == 21) {
                listaAsientos.add(new AsientoDTO(i, estadoAsiento.OCUPADO, numero));
            } else {
                listaAsientos.add(new AsientoDTO(i, estadoAsiento.DISPONIBLE, numero));
            }

        }
        return listaAsientos;
    }

    
    /**
     * Método que devuelve la lista de asientos de un camión para colorear los asientos.
     * @param camion Camion del cual se desean obtener los asientos.
     * @return lista de asientos del viaje del camión que se seleccionó.
     */
    public List<AsientoDTO> obtenerAsientosDisponibles(CamionDTO camion) {
        //Cuando le quitemos el mockeo seria CamionDTO.getListaAsientos();

        return crearListaAsientos();
    }

    /**
     * Método que devuelve la lista de viajes disponibles segun el origen, el destino y la fecha.
     * @param origen el origen seleccionado por el usuario.
     * @param destino Hacia donde desea ir el usuario.
     * @param fecha La fecha en la que el usuario desea ir 
     * @return la lista de viajes encontrada con la coincidencia.
     */
    public List<ViajeDTO> obtenerViajesDisponibles(String origen, String destino, LocalDate fecha) {
        List<ViajeDTO> viajes = new ArrayList<>();
        Long contador = 0L;
        for (int i = 0; i < 6; i++) {
            contador++;
            CamionDTO camion = new CamionDTO(contador, (i + 1) + "a", crearListaAsientos());
            viajes.add(new ViajeDTO(300.00, "Obregon", "Hermosillo", "3hr 30min", camion, LocalDate.now()));
        }
        return viajes;
    }
    
    /**
     * Método que devuelve la lista de destinos disponibles.
     * @param origen Desde donde se quiere ver los destinos.
     * @return la lista de destinos para un origen.
     */
    public List<String> obtenerDestinos(String origen){
        List<String> destinos = new ArrayList<>(Arrays.asList("Cd. Obregón", "Hermosillo", "Navojoa", "Caborca"));        
        return destinos;
    }

    
}
