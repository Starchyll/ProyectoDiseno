package DTOs;

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
    private LocalDate hrSalida;
    private AsientoDTO asiento;
    private Long idUsuario;
    private Double precio;
    private Integer duracion;
    private Long idCamion;
    private String nombreAsiento;
    private List<AsientoDTO> listaAsiento;

    public BoletoDTO(Long idBoleto, String origen, String destino, LocalDate hrSalida, AsientoDTO asiento, Long idUsuario, Double precio, Integer duracion, Long idCamion, String nombreAsiento, List<AsientoDTO> listaAsiento) {
        this.idBoleto = idBoleto;
        this.origen = origen;
        this.destino = destino;
        this.hrSalida = hrSalida;
        this.asiento = asiento;
        this.idUsuario = idUsuario;
        this.precio = precio;
        this.duracion = duracion;
        this.idCamion = idCamion;
        this.nombreAsiento = nombreAsiento;
        this.listaAsiento = listaAsiento;
    }

    public Long getIdBoleto() {
        return idBoleto;
    }

    public String getOrigen() {
        return origen;
    }

    public String getDestino() {
        return destino;
    }

    public LocalDate getHrSalida() {
        return hrSalida;
    }

    public AsientoDTO getAsiento() {
        return asiento;
    }

    public Long getIdUsuario() {
        return idUsuario;
    }

    public Double getPrecio() {
        return precio;
    }

    public Integer getDuracion() {
        return duracion;
    }

    public Long getIdCamion() {
        return idCamion;
    }

    public String getNombreAsiento() {
        return nombreAsiento;
    }

    public List<AsientoDTO> getListaAsiento() {
        return listaAsiento;
    }

    
    
}
