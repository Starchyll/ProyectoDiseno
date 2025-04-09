package itson.rutappdto;

/**
 *
 * @author pedro
 */
public class AsientoDTO {
    private Long idAsiento;
    private String estado;
    private String numero;

    public AsientoDTO(Long idAsiento, String estado, String numero) {
        this.idAsiento = idAsiento;
        this.estado = estado;
        this.numero = numero;
    }

    public Long getIdAsiento() {
        return idAsiento;
    }

    public String getEstado() {
        return estado;
    }

    public String getNumero() {
        return numero;
    }
    
    
}
