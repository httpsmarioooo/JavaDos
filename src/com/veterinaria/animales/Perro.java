package com.veterinaria.animales;

public class Perro {
    public String nombre;
    private String raza;
    private int edad;
    private double peso;
    private String historialMedico;


    public Perro(){
    }

    public Perro(String nombre, String raza, double peso, int edad, String historialMedico) {
        this.nombre = nombre;
        this.raza = raza;
        this.peso = peso;
        this.edad = edad;
        this.historialMedico = historialMedico;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void setRaza(String raza) {
        this.raza = raza;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setHistorialMedico(String historialMedico) {
        this.historialMedico = historialMedico;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public void mostrarFicha(){
        System.out.println("Ficha de Registro: ");
        System.out.println("Nombre: "+nombre);
        System.out.println("Raza: "+raza);
        System.out.println("Peso: "+peso);
        System.out.println("Edad: "+edad);
        System.out.println("Historial medico: "+historialMedico);
    }
}
