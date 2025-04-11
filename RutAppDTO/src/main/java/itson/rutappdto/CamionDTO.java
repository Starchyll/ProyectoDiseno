package itson.rutappdto;

import itson.rutappdto.AsientoDTO;
import java.util.List;

/**
 *
 * @author chris
 */
public class CamionDTO {

    private String numeroCamion;
    private List<AsientoDTO> listaAsiento;

    public CamionDTO(String matricula, List<AsientoDTO> listaAsiento) {
        this.numeroCamion = matricula;
        this.listaAsiento = listaAsiento;
    }

    public String getNumeroCamion() {
        return numeroCamion;
    }

    public List<AsientoDTO> getListaAsiento() {
        return listaAsiento;
    }

}
