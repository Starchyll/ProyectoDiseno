/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package itson.rutappdto;

/**
 *
 * @author mmax2
 */
public class AsientoBoletoDTO {
    public AsientoDTO asiento;
    
    public BoletoDTO boleto;
    
    public String nombreAsiento;
    
    public Double precioUnitario;

    public AsientoBoletoDTO() {
    }

    public AsientoBoletoDTO(AsientoDTO asiento, BoletoDTO boleto, String nombreAsiento, Double precioUnitario) {
        this.asiento = asiento;
        this.boleto = boleto;
        this.nombreAsiento = nombreAsiento;
        this.precioUnitario = precioUnitario;
    }

    public AsientoDTO getAsiento() {
        return asiento;
    }

    public void setAsiento(AsientoDTO asiento) {
        this.asiento = asiento;
    }

    public BoletoDTO getBoleto() {
        return boleto;
    }

    public void setBoleto(BoletoDTO boleto) {
        this.boleto = boleto;
    }

    public String getNombreAsiento() {
        return nombreAsiento;
    }

    public void setNombreAsiento(String nombreAsiento) {
        this.nombreAsiento = nombreAsiento;
    }

    public Double getPrecioUnitario() {
        return precioUnitario;
    }

    public void setPrecioUnitario(Double precioUnitario) {
        this.precioUnitario = precioUnitario;
    }
    
    
    
    
}
