/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mi.parqueadero;

import javax.swing.JOptionPane;

/**
 *
 * @author Estudiantes
 */
public class MiParqueadero {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
        String placa; 
        System.out.println("favor ingresar placa");
        
        String propietario; 
        System.out.println("favor ingresar nombre");
         
        float cilindraje;
        System.out.println("");
        
        
        

        
      public void buscarVehiculo() {
        String placa = JOptionPane.showInputDialog("Placa del carro:");
        Vehiculo Vehiculo = Parqueadero.buscarVehiculo(placa);
        if (Vehiculo == null) 
        {
            JOptionPane.showMessageDialog(null,"No se encuentra parqueado un carro con esa placa");
        }
        else
        {
             JOptionPane.showMessageDialog(null,"Los datos del carro son:  \n" +
                                    "Placa: "+ Vehiculo.getPlaca() + "\n"+
                                    "Marca: "+ Vehiculo.getMarca());
        }

 

        
        
            
    }
  
    
    
}
    
    

