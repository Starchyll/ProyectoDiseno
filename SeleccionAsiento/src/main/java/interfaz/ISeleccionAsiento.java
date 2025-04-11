package interfaz;

import itson.rutappdto.AsientoDTO;
import itson.rutappdto.CamionDTO;
import java.util.List;

/**
 * Metodo de interfaz que obtiene la lista de asientos disponibles para un camión dado.
 *
 */
public interface ISeleccionAsiento {

    List<AsientoDTO> obtenerAsientos(CamionDTO camion);
}
