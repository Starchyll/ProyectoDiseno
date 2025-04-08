package DTOs;

import java.util.List;

/**
 *
 * @author chris
 */
public class CamionDTO {
    private Long idCamion;
    private String matricula;
    private List<AsientoDTO> listaAsiento;

    public CamionDTO(Long idCamion, String matricula, List<AsientoDTO> listaAsiento) {
        this.idCamion = idCamion;
        this.matricula = matricula;
        this.listaAsiento = listaAsiento;
    }

    public Long getIdCamion() {
        return idCamion;
    }

    public String getMatricula() {
        return matricula;
    }

    public List<AsientoDTO> getListaAsiento() {
        return listaAsiento;
    }
    
    
}
