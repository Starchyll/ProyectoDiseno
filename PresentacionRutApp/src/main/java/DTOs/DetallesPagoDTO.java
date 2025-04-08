package DTOs;

/**
 *
 * @author pedro
 */
public class DetallesPagoDTO {

    private Long idPago;
    private String metodoPago;
    private Double monto;
    private Integer terminacionTarjeta;
    private BoletoDTO boleto;

    public DetallesPagoDTO(Long idPago, String metodoPago, Double monto, Integer terminacionTarjeta, BoletoDTO boleto) {
        this.idPago = idPago;
        this.metodoPago = metodoPago;
        this.monto = monto;
        this.terminacionTarjeta = terminacionTarjeta;
        this.boleto = boleto;
    }

    public Long getIdPago() {
        return idPago;
    }

    public String getMetodoPago() {
        return metodoPago;
    }

    public Double getMonto() {
        return monto;
    }

    public Integer getTerminacionTarjeta() {
        return terminacionTarjeta;
    }

    public BoletoDTO getBoleto() {
        return boleto;
    }

    
}
