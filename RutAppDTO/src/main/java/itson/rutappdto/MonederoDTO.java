package itson.rutappdto;

import java.time.LocalDate;

/**
 *
 * @author pedro
 */
public class MonederoDTO {
    private Double saldo;
    private LocalDate ultimaFechaRecarga;
    private Long idUsuario;

    public MonederoDTO(Double saldo, LocalDate ultimaFechaRecarga, Long idUsuario) {
        this.saldo = saldo;
        this.ultimaFechaRecarga = ultimaFechaRecarga;
        this.idUsuario = idUsuario;
    }

    public Double getSaldo() {
        return saldo;
    }

    public LocalDate getUltimaFechaRecarga() {
        return ultimaFechaRecarga;
    }

    public Long getIdUsuario() {
        return idUsuario;
    }
    
    
    
}
