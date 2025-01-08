package com.aluracursos.main;

import com.aluracursos.api.ExchangeRateService;
import com.aluracursos.service.ConversorDeMonedas;
import com.google.gson.JsonObject;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try {
            JsonObject divisas = ExchangeRateService.obtenerDivisas();

            ConversorDeMonedas conversor = new ConversorDeMonedas(divisas);

            Scanner teclado = new Scanner(System.in);

            while (true) {
                System.out.println("\n****************************************");
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

                if (opcionDelUsuario < 1 || opcionDelUsuario > 7) {
                    System.out.println("Opción inválida.");
                    continue;
                }

                if (opcionDelUsuario == 7) {
                    System.out.println("Terminando operación...");
                    break;
                }

                System.out.println("Ingresa el monto que deseas convertir:");
                double montoDelUsuario = teclado.nextDouble();

                double resultadoDeConversion = 0;

                switch (opcionDelUsuario) {
                    case 1:
                        resultadoDeConversion = conversor.convertir("USD", "ARS", montoDelUsuario);
                        break;
                    case 2:
                        resultadoDeConversion = conversor.convertir("ARS", "USD", montoDelUsuario);
                        break;
                    case 3:
                        resultadoDeConversion = conversor.convertir("USD", "BRL", montoDelUsuario);
                        break;
                    case 4:
                        resultadoDeConversion = conversor.convertir("BRL", "USD", montoDelUsuario);
                        break;
                    case 5:
                        resultadoDeConversion = conversor.convertir("USD", "COP", montoDelUsuario);
                        break;
                    case 6:
                        resultadoDeConversion = conversor.convertir("COP", "USD", montoDelUsuario);
                        break;
                }

                System.out.printf("El resultado es: %.2f\n", resultadoDeConversion);
            }
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Error al realizar la conversión.");
        }
    }
}

