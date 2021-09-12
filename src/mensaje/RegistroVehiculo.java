/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mensaje;

/**
 *
 * @author andre
 */
public class RegistroVehiculo {
    
   protected String tipovehiculo;
    private String marca;
    private String modelo;
    private String placa;
    private int aniofabricacion;
    ArrayList<RegistroCliente> cliente;
    
   public RegistroVehiculo(){
   }
   public RegistroVehiculo(String tipovehiculo,String marca,String modelo,String placa
                            ,int aniofabricacion){
       this.tipovehiculo=tipovehiculo;
       this.marca=marca;
       this.modelo=modelo;
       this.placa=placa;
       this.aniofabricacion=aniofabricacion;
       cliente=new ArrayList<>();
   }

    public String getTipovehiculo() {
        return tipovehiculo;
    }

    public void setTipovehiculo(String tipovehiculo) {
        this.tipovehiculo = tipovehiculo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public int getAniofabricacion() {
        return aniofabricacion;
    }

    public void setAniofabricacion(int aniofabricacion) {
        this.aniofabricacion = aniofabricacion;
    }

    public ArrayList<RegistroCliente> getCliente() {
        return cliente;
    }

    public void setCliente(ArrayList<RegistroCliente> cliente) {
        this.cliente = cliente;
    }
    //este tambien vele si sirve jaja
    
}
