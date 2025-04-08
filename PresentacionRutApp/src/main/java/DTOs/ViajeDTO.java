package DTOs;

/**
 *
 * @author pedro
 */
public class ViajeDTO {

    private Long idViaje;
    private Double precio;
    private String origen;
    private String destino;
    private String duracion;
    private Long idCamion;

    public ViajeDTO(Long idViaje, Double precio, String origen, String destino, String duracion, Long idCamion) {
        this.idViaje = idViaje;
        this.precio = precio;
        this.origen = origen;
        this.destino = destino;
        this.duracion = duracion;
        this.idCamion = idCamion;
    }

    public Long getIdViaje() {
        return idViaje;
    }

    public Double getPrecio() {
        return precio;
    }

    public String getOrigen() {
        return origen;
    }

    public String getDestino() {
        return destino;
    }

    public String getDuracion() {
        return duracion;
    }

    public Long getIdCamion() {
        return idCamion;
    }
    
    

}
