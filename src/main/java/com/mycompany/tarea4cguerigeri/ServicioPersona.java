/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tarea4cguerigeri;

import java.util.Scanner;

/**
 *
 * @author erick
 */
public class ServicioPersona {
    private static Scanner teclado = new Scanner(System.in);
    
    public static Persona leerTecladoPersona(){
        
        // Creamos el objeto de tipo Persona
        Persona persona;
        
        // Leer por teclado e instanciar
        System.out.println("Nombre de la persona: ");
        String nombrePersona = teclado.nextLine();
        
        System.out.println("Edad de la persona: ");
        int edadPersona = teclado.nextInt();
        
        System.out.println("Sexo de la persona (H, M y O): ");
        char sexoPersona = teclado.next().charAt(0); // Solo con next da error, hace falta el charAt para especificar que solo se recoge un parámetro
        
        System.out.println("Peso de la persona: ");
        double pesoPersona = teclado.nextDouble();
        
        System.out.println("Altura de la persona: ");
        double alturaPersona = teclado.nextDouble();
        
        teclado.nextLine();
        
        // Inicializamos el objeto
        persona = new Persona(nombrePersona, edadPersona, sexoPersona, pesoPersona, alturaPersona);
        
        // Devolvemos los datos de la Persona
        return persona;
        
        
        
        
        
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}
