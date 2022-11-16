/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.tarea4cguerigeri;

/**
 *
 * @author guerig
 */
public class Persona {

    // Atributos de instancia
    private String nombre;
    private int edad;
    private String nif;
    private String sexo;
    private double peso;
    private double altura;

    // Método constructor que inicializa los atributos de la clase Persona
    public Persona(String nombre, int edad, String nif, String sexo, double peso, double altura) {
        
        /* Para diferenciar los atributos del objeto y los identificadores
            del método constructor se utiliza la palabra this.
        
            Por ejemplo: this.nombre = nombre
                this.nombre se refiere al atributo del objeto y nombre al parámetro del método
        */
        this.nombre = nombre; // Los parámetros de los identificadores pueden tener otro nombre diferente
        this.edad = edad;
        this.nif = nif;
        this.sexo = sexo;
        this.peso = peso;
        this.altura = altura;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getNif() {
        return nif;
    }

    public void setNif(String nif) {
        this.nif = nif;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
    
    
    
    
    
    
}
