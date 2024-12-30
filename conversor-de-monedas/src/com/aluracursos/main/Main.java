package com.aluracursos.main;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("****************************************");
        System.out.println("Bienvenido al Conversor de Monedas.");

        System.out.println("\nSelecciona una opción válida:");
        System.out.println("1) Dólar ---> Peso argentino");
        System.out.println("2) Peso argentino ---> Dólar");
        System.out.println("3) Dólar ---> Real brasileño");
        System.out.println("4) Real brasileño ---> Dólar");
        System.out.println("5) Dólar ---> Peso colombiano");
        System.out.println("6) Peso colombiano ---> Dólar");
        System.out.println("7) Salir");

        System.out.println("\n****************************************\n");
        int opcionDelUsuario = teclado.nextInt();

        System.out.println("Ingresa el valor que deseas convertir:");
        double montoDelUsuario = teclado.nextDouble();
    }
}
