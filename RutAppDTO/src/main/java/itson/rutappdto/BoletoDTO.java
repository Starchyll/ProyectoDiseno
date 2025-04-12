package itson.rutappdto;

import itson.rutappdto.AsientoDTO;
import java.time.LocalDate;
import java.util.List;

/**
 *
 * @author pedro
 */
public class BoletoDTO {
    private String origen;
    private String destino;
    private String hrSalida;
    private UsuarioDTO usuario;
    private Double precio;
    private String duracion;
    private CamionDTO camion;
    private List<AsientoBoletoDTO> listaAsiento;

    public BoletoDTO() {
    }

    public BoletoDTO(String origen, String destino, String hrSalida, UsuarioDTO usuario, Double precio, String duracion, CamionDTO camion, List<AsientoBoletoDTO> listaAsiento) {
        this.origen = origen;
        this.destino = destino;
        this.hrSalida = hrSalida;
        this.usuario = usuario;
        this.precio = precio;
        this.duracion = duracion;
        this.camion = camion;
        this.listaAsiento = listaAsiento;
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

    public UsuarioDTO getUsuario() {
        return usuario;
    }

    public void setUsuario(UsuarioDTO usuario) {
        this.usuario = usuario;
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

    public CamionDTO getCamion() {
        return camion;
    }

    public void setCamion(CamionDTO camion) {
        this.camion = camion;
    }

    public List<AsientoBoletoDTO> getListaAsiento() {
        return listaAsiento;
    }

    public void setListaAsiento(List<AsientoBoletoDTO> listaAsiento) {
        this.listaAsiento = listaAsiento;
    }

    
    
    
}
