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
public class Parqueadero {

    static Vehiculo buscarVehiculo(String placa) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
private Vehiculo[] Vehiculo = new Vehiculo[100];
            
       

 public boolean ingresarVehiculo(Vehiculo vehiculo) 
 {
  for (int i = 0; i < Vehiculo.length; i++) 
  {
   if (Vehiculo[i] == null)
   {
    Vehiculo[i] = vehiculo;
    return true;
   }
  }
  return false;
 }
 

  
 public boolean ingresarVehiculo(Vehiculo vehiculo) 
 {
  for (int i = 0; i < Vehiculo.length; i++) 
  {
   if (Vehiculo[i] == null)
   {
    Vehiculo[i] = vehiculo;
    return true;
   }
  }
  return false;
 }

  
 public boolean retirarVehiculo(String placa)
 {
  for (int i = 0; i < Vehiculo.length; i++) 
  {
   if (Vehiculo[i] != null)
   {
    if (Vehiculo[i].getPlaca().equals(placa))
    {
     Vehiculo[i] = null;
     return true;
    }
   }
  }
  return false;
  
 }
}