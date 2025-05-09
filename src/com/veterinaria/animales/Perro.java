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

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getHistorialMedico() {
        return historialMedico;
    }

    public void setHistorialMedico(String historialMedico) {
        this.historialMedico = historialMedico;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public void mostrarFicha(){
        System.out.println("Ficha de Registro");
        System.out.println("Nombre: "+nombre);
        System.out.println("Raza: "+raza);
        System.out.println("Peso: "+peso);
        System.out.println("Edad: "+edad);
        System.out.println("Historial medico: "+historialMedico);
    }
}
