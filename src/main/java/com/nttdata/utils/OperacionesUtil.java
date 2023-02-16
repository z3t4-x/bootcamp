package com.nttdata.utils;

public final class OperacionesUtil{

    Long idTarjeta; 
    Long idCuenta; 
    Double deposito; 
    String opcionOperacion;
  
    public Long getIdTarjeta() {
        return idTarjeta;
    }
    public void setIdTarjeta(Long idTarjeta) {
        this.idTarjeta = idTarjeta;
    }
    public Long getIdCuenta() {
        return idCuenta;
    }
    public void setIdCuenta(Long idCuenta) {
        this.idCuenta = idCuenta;
    }
    public Double getDeposito() {
        return deposito;
    }
    public void setDeposito(Double deposito) {
        this.deposito = deposito;
    }
    public String getOpcionOperacion() {
        return opcionOperacion;
    }
    public void setOpcionOperacion(String opcionOperacion) {
        this.opcionOperacion = opcionOperacion;
    }
    
}
