package DTOs;

import java.util.List;

/**
 *
 * @author pedro
 */
public class RutaDTO {
    private Long idRuta;
    private List<ParadaDTO> listaParada;
    private String origen;
    private String destino;

    public RutaDTO(Long idRuta, List<ParadaDTO> listaParada, String origen, String destino) {
        this.idRuta = idRuta;
        this.listaParada = listaParada;
        this.origen = origen;
        this.destino = destino;
    }

    public Long getIdRuta() {
        return idRuta;
    }

    public List<ParadaDTO> getListaParada() {
        return listaParada;
    }

    public String getOrigen() {
        return origen;
    }

    public String getDestino() {
        return destino;
    }
    
    
}
