/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.tarea4cguerigeri;

import java.util.Random;
import org.apache.commons.lang3.RandomStringUtils;

/**
 *
 * @author guerig
 */

// Toda clase debe definir un método especial denominado constructor para instanciar los objetos de la clase
public class Persona {

    // Atributos de instancia
    /* Los atributos de la clase se deben declarar private y para acceder a ellos hay que usar el método get*/
    private String nombre;
    private int edad;
    private final String nif = generarNIF(); // Constante ya que se especifica en el enunciado
    private char sexo;
    private double peso;
    private double altura;
    
    public Persona(){
        
    }

    // Método constructor que inicializa los atributos de la clase Persona
    public Persona(String nombre, int edad, char sexo, double peso, double altura) {
        if(!sexoFiltrar(sexo)){
            sexo = 'O';
        }
        
        /* Para diferenciar los atributos del objeto y los identificadores
            del método constructor se utiliza la palabra this.
        
            Por ejemplo: this.nombre = nombre
                this.nombre se refiere al atributo del objeto y nombre al parámetro del método
        
        this hace referencia al objeto que ejecuta el método Persona, se puede obviar su uso, pero 
        no es recomendable para evitar ambiguedades o referencias al propio objeto
        */
        this.nombre = nombre; // Los parámetros de los identificadores pueden tener otro nombre diferente
        this.edad = edad;
        this.sexo = sexo;
        this.peso = peso;
        this.altura = altura;
    }
    
    // ---------------------- getters y setters --------------------------
    // Es necesario definir un método get y set para cada uno de sus atributos

    // get es un método de consulta, con el consultamos el dato que tiene almacenado
    public String getNombre() {
        return nombre;
    }

    // set es un método de modificación, con el se modifica el dato del objeto
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public char getSexo() {
        return sexo;
    }

    // Si se modifica el sexo, primero se hace una comprobación para ver si cumple el filtro
    public char setSexo(char sexo) {
        if(!sexoFiltrar(sexo)){ 
            sexo = 'o'; 
        }
        
        return sexo;
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
    
    // Métodos
    // Filtrar sexo, opciones permitadas
    public boolean sexoFiltrar(char sexo){
        return (sexo == 'H' || sexo == 'M' || sexo == 'O' ||
                sexo == 'h' || sexo == 'm' || sexo == 'o'
                );
    }
        
    public String generarNIF(){
        final String LETRAS = "TRWAGMYFPDXBNJZSQVHLCKE";
        
        // Generar numeros
        String numeros = RandomStringUtils.randomNumeric(8);
        
        int numeroInt = Integer.parseInt(numeros);
        
        int numeroLetra = numeroInt % 23;
        
        return (numeros + LETRAS.charAt(numeroLetra));
    }
    
    public boolean esMayorEdad(int edad){
        boolean resultado;
        if(edad >= 18){
            resultado = true;
        }else{
            resultado = false;
        }
        
        return resultado;
    }
    
    public float calculaIMC(){
        return (float)(this.peso / Math.pow(this.altura, 2));
    }
    
    public void indicarMasa(){
        float calculo = calculaIMC();
        
        if(calculo >= 18.5 && calculo <= 24.9){
            System.out.println("Peso normal");
        }else if(calculo >= 25 && calculo <= 29.9){
            System.out.println("Peso superior al normal");
        }else if(calculo < 18.5){
            System.out.println("Peso inferior al normal");
        }else{
            System.out.println("Obesidad");
        }      
        
    }
    
    
    
    @Override
    public String toString(){
        return "Persona{" + "Nombre = " + nombre + ", edad = " + edad + ", NIF = " + nif + ", sexo = " + sexo + ", peso = " + peso + ", altura = " + altura + '}';
    }
    
    
    
    
}
