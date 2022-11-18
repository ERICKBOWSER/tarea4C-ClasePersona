/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tarea4cguerigeri;

/**
 *
 * @author erick
 */
public class Prueba {

    // El main no devuelve un valor de retorno
    public static void main(String[] args) {
        
        // La instanciación de un objeto se realiza ejecutando el método constructor de la clase
        // Los valores almacenados de un objeto representan su estado
        Persona eduardo = new Persona("Eduardo", 22, 'M', 75.7, 1.80);
        System.out.println(eduardo);
        
        Persona persona1 = new Persona(); // Si no se crea el public Persona() da error
        
        // Creamos un objeto persona leyendo los datos por teclado
        Persona josh = ServicioPersona.leerTecladoPersona();
        System.out.println(josh);
        
        
    }
























    
}
