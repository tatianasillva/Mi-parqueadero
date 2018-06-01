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
public class Vehiculo implements Ivehiculo {

   

    
    private String placa;
    private String marca;
    private float cilindraje;
    
     public Vehiculo(String placa, String marca, float cilindraje) 
    {
        this.placa = placa;
        this.marca = marca;
        this.cilindraje = cilindraje;
    }
     
    public String getPlaca() 
    {
        return placa;
    }
    /**
     * Método para consultar la marca
     * @return  la marca del carro
     */
    public String getMarca() 
    {
        return marca;
    }

    
       public float getCilindraje() 
    {
        return cilindraje;
    }
}

