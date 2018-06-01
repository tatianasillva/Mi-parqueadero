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
    
    vehiculo miVehiculo= new Vehiculo();
    
private Vehiculo[] Vehiculo = new Vehiculo[100];
            
        
   public boolean parquearVehiculo(Vehiculo Vehiculo) 
 {
  for (int i = 0; i < Vehiculo.length; i++) 
  {
   if (Vehiculo[i] == null)
   {
    Vehiculo[i] = Vehiculo;
    return true;
   }
  }
  return false;
  
  
  
  public  Vehiculo buscarVehiculo(String placa)
 {
  for (int i = 0; i <  Vehiculo.length; i++) 
  {
   if ( Vehiculo[i] != null)
   {
    if (vehiculo[i].getPlaca().equals(placa))
    {
     return Vehiculo[i];
    }
   }
  }
  return null;
 }

} 



public void buscarVehiculo() {
        String placa = JOptionPane.showInputDialog("Placa del carro:");
        Carro carro = parquea.buscarCarro(placa);
        if (carro == null) 
        {
            JOptionPane.showMessageDialog(null,"No se encuentra parqueado un carro con esa placa");
        }
        else
        {
             JOptionPane.showMessageDialog(null,"Los datos del carro son:  \n" +
                                    "Placa: "+ carro.getPlaca() + "\n"+
                                    "Marca: "+ carro.getMarca());
        }
  
 }
  
   
   
   
            
ic void menu() {
        
        int opcion=-1;
        do {
            // Menú con las opciones disponibles
            String valorSeleccionado = 
            JOptionPane.showInputDialog(" ---- MENU PARQUEADERO ---  \n" +
                        "1.Parquear un carro    \n" +
                        "2.Buscar un carro  \n" +
                        "3.Sacar un carro   \n" +
                        "0.Terminar     \n\n" +
                        "Opción seleccionada: ");
            try 
            {
                opcion = Integer.parseInt(valorSeleccionado);
                switch (opcion){
                    // Opcion 1: Parquear un carro
                    case 1: parquearVehiculo();
                            break;
                    
                    // Opcion 2: Buscar un carro y mostrar sus datos 
                    case 2: buscarVehiculo();
                            break;
                    
                    // Opcion 3: Sacar un carro del parqueadero
                    case 3: sacarVehiculo();
                            break;
    
                    case 0: break;
                    
                    default: JOptionPane.showMessageDialog(null,"Opción no disponible");    
                }
            }
            catch (NumberFormatException errorIngreso)
            {
                JOptionPane.showMessageDialog(null,"Dato ingresado incorrecto. Debe ser numérico");   
            }
        }
        while (opcion != 0);
        JOptionPane.showMessageDialog(null," - Terminación exitosa -");

    }

}  //Fin de la clase ControlParqueadero


