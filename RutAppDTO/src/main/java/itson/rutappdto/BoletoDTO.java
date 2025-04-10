package itson.rutappdto;

import itson.rutappdto.AsientoDTO;
import java.time.LocalDate;
import java.util.List;

/**
 *
 * @author pedro
 */
public class BoletoDTO {
    private Long idBoleto;
    private String origen;
    private String destino;
    private String hrSalida;
    private Long idUsuario;
    private Double precio;
    private String duracion;
    private Long idCamion;
    private List<AsientoDTO> listaAsiento;

    public BoletoDTO(Long idBoleto, String origen, String destino, String hrSalida, Long idUsuario, Double precio, String duracion, Long idCamion, List<AsientoDTO> listaAsiento) {
        this.idBoleto = idBoleto;
        this.origen = origen;
        this.destino = destino;
        this.hrSalida = hrSalida;
        this.idUsuario = idUsuario;
        this.precio = precio;
        this.duracion = duracion;
        this.idCamion = idCamion;
        this.listaAsiento = listaAsiento;
    }

    public Long getIdBoleto() {
        return idBoleto;
    }

    public void setIdBoleto(Long idBoleto) {
        this.idBoleto = idBoleto;
    }

    public String getOrigen() {
        return origen;
    }

    public void setOrigen(String origen) {
        this.origen = origen;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public String getHrSalida() {
        return hrSalida;
    }

    public void setHrSalida(String hrSalida) {
        this.hrSalida = hrSalida;
    }

    public Long getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(Long idUsuario) {
        this.idUsuario = idUsuario;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    public String getDuracion() {
        return duracion;
    }

    public void setDuracion(String duracion) {
        this.duracion = duracion;
    }

    public Long getIdCamion() {
        return idCamion;
    }

    public void setIdCamion(Long idCamion) {
        this.idCamion = idCamion;
    }

    public List<AsientoDTO> getListaAsiento() {
        return listaAsiento;
    }

    public void setListaAsiento(List<AsientoDTO> listaAsiento) {
        this.listaAsiento = listaAsiento;
    }

    
    
}
