/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examen2_nombreapellido;

import java.util.ArrayList;

/**
 *• Nombre
• Velocidad (en milisegundos)
• Edad
• Cantidad de carreras ganadas
• Año en que inició a competir
• Año en que se retirará.
* 
 * @author joser
 * Tortuga1 , 500 , 10 , [3-{2020>2030}]
 * 
 * Nombre de la tortuga, velocidad, edad,[carreras ganadas-{año de inicio>año de retiro}]
 * 
 */
public class Tortuga {
    String nombre, velocidad, edad, carrerasGanadas, anioInicio, anioFinal;

    public Tortuga(String nombre, String velocidad, String edad, String carrerasGanadas, String anioInicio, String anioFinal) {
        this.nombre = nombre;
        this.velocidad = velocidad;
        this.edad = edad;
        this.carrerasGanadas = carrerasGanadas;
        this.anioInicio = anioInicio;
        this.anioFinal = anioFinal;
    }

    public Tortuga(String datos) {
        String[] arreglo1 = datos.split(",");
        this.nombre = arreglo1[0];
        this.velocidad = arreglo1[1];
        this.edad = arreglo1[2];
        
        
      //  [carreras ganadas-{año de inicio>año de retiro}]
        String[] arreglo2 = arreglo1[3].split("-");  // [carrerasganadas   {año de inicio>año de retiro}]
        this.carrerasGanadas = arreglo2[0].substring(1);
        
        String[] arreglo3 = arreglo2[1].split(">");    //{año de inicio       año de retiro}]
        this.anioFinal = arreglo3[1].substring(0, 3);
        this.anioInicio = arreglo3[0].substring(1);
        
        
        
    }
    
    

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(String velocidad) {
        this.velocidad = velocidad;
    }

    public String getEdad() {
        return edad;
    }

    public void setEdad(String edad) {
        this.edad = edad;
    }

    public String getCarrerasGanadas() {
        return carrerasGanadas;
    }

    public void setCarrerasGanadas(String carrerasGanadas) {
        this.carrerasGanadas = carrerasGanadas;
    }

    public String getAnioInicio() {
        return anioInicio;
    }

    public void setAnioInicio(String anioInicio) {
        this.anioInicio = anioInicio;
    }

    public String getAnioFinal() {
        return anioFinal;
    }

    public void setAnioFinal(String anioFinal) {
        this.anioFinal = anioFinal;
    }

    @Override
    public String toString() {
        return "Tortuga{" + "nombre=" + nombre + ", velocidad=" + velocidad + ", edad=" + edad + ", carrerasGanadas=" + carrerasGanadas + ", anioInicio=" + anioInicio + ", anioFinal=" + anioFinal + '}';
    }
    
    
    
}
