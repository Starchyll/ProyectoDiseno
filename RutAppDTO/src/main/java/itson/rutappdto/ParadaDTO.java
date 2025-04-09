package itson.rutappdto;

/**
 *
 * @author pedro
 */
public class ParadaDTO {
    private Long idParada;
    private String nombre;

    public ParadaDTO(Long idParada, String nombre) {
        this.idParada = idParada;
        this.nombre = nombre;
    }

    public Long getIdParada() {
        return idParada;
    }

    public String getNombre() {
        return nombre;
    }
    
    
}
