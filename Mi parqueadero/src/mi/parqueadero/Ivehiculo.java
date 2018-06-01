/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mi.parqueadero;

/**
 *
 * @author Estudiantes
 */
public interface Ivehiculo {
   
   private String placa;
   private String propietario;
   private float cilindraje;
    
    
    
   public Vehiculo(String placa, String propietario, float cilindraje){ 
    
        this.placa = placa;
        this.propietario = propietario;
        this.cilindraje  = cilindraje ;
    }

 
}
