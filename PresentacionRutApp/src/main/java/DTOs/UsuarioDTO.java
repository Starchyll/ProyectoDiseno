package DTOs;

/**
 *
 * @author pedro
 */
public class UsuarioDTO {
    private Long idUsuario;
    private String nombre;

    public UsuarioDTO(Long idUsuario, String nombre) {
        this.idUsuario = idUsuario;
        this.nombre = nombre;
    }

    public Long getIdUsuario() {
        return idUsuario;
    }

    public String getNombre() {
        return nombre;
    }
    
    
}
