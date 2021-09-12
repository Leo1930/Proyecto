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
public class RegistroCliente {
    
    protected String nombre;
    protected String apellido;
    protected int cedula;
    protected int telefono;
    ArrayList<RegistroVehiculo> vehiculo;

    public RegistroCliente(){
    }
    
    public RegistroCliente(String nombre, String apellido, int id, int contacto){
        
    this.nombre= nombre;
    this.apellido=apellido;
    this.cedula=id;
    this.telefono=contacto;
    vehiculo = new ArrayList<>();
    }
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getCedula() {
        return cedula;
    }

    public void setCedula(int cedula) {
        this.cedula = cedula;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public ArrayList<RegistroVehiculo> getVehiculo() {
        return vehiculo;
    }

    public void setVehiculo(ArrayList<RegistroVehiculo> vehiculo) {
        this.vehiculo = vehiculo;
    }
    
    
    //si vale esto xd
    //vele si esta bn jajaja
}



