package com.veterinaria.recepcion;

import com.veterinaria.animales.Perro;

import java.util.ArrayList;
import java.util.Scanner;

public class Registro {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Perro> listaPerros = new ArrayList<>();
        int salida = 0;
        do {
            Perro perro = new Perro();
            System.out.println("---- MENU VETERINARIA ---- \n" +
                    "1. Crear perro \n " +
                    "2. Mostrar perros \n" +
                    "0. Salir" );
            int opcion = scanner.nextInt();

            switch (opcion){
                case 0:
                    salida =1;
                    break;
                case 1:
                    System.out.println("Ingrese nombre");
                    perro.setNombre(scanner.nextLine());
                    scanner.nextLine();
                    System.out.println("Ingrese raza");
                    perro.setRaza(scanner.nextLine());
                    System.out.println("Ingrese la edad");
                    perro.setEdad(scanner.nextInt());
                    scanner.nextLine();
                    System.out.println("Ingrese el peso");
                    perro.setPeso(scanner.nextDouble());
                    scanner.nextLine();
                    System.out.println("Ingrese el historial medico");
                    perro.setHistorialMedico(scanner.nextLine());
                    listaPerros.add(perro);
                    break;
                case 2:
                    System.out.println("\nLista de perros registrados:");
                    for (Perro p : listaPerros) {
                        p.mostrarFicha();
                    }
                    break;
                default:
                    System.out.println("Error: Opcion no valida");
            }
        }while (salida == 0);
    }
}


