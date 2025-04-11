package fachada;

import control.ControlSeleccionAsiento;
import enumm.estadoAsiento;
import interfaz.ISeleccionAsiento;
import itson.rutappdto.AsientoDTO;
import itson.rutappdto.CamionDTO;
import java.util.ArrayList;
import java.util.List;

public class SeleccionAsiento implements ISeleccionAsiento {

    /**
     * Obtiene la lista de asientos asociados al camión proporcionado.
     *
     * @param camion El objeto CamionDTO del cual se desea obtener la lista de
     * asientos.
     * @return Una lista de objetos AsientoDTO correspondientes al camión.
     */
    @Override
    public List<AsientoDTO> obtenerAsientos(CamionDTO camion) {
        return ControlSeleccionAsiento.getInstancia().mostradoListaAsientos(camion);
    }

}
