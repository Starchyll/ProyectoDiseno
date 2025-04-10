package itson.rutappdto;

import java.time.LocalDate;

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
    private LocalDate fecha;

    public ViajeDTO() {
    }

    public ViajeDTO(Long idViaje, Double precio, String origen, String destino, String duracion, Long idCamion, LocalDate fecha) {
        this.idViaje = idViaje;
        this.precio = precio;
        this.origen = origen;
        this.destino = destino;
        this.duracion = duracion;
        this.idCamion = idCamion;
        this.fecha = fecha;
    }

    public Long getIdViaje() {
        return idViaje;
    }

    public void setIdViaje(Long idViaje) {
        this.idViaje = idViaje;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
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

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

}
