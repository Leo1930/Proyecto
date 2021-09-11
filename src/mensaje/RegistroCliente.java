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

    public RegistroCliente(){
    }
    
    public RegistroCliente(String nombre, String apellido, int id, int contacto){
        
    this.nombre= nombre;
    this.apellido=apellido;
    this.cedula=id;
    this.telefono=contacto;
    }
    
    
    //si vale esto xd
}
