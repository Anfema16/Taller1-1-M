/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.operacion;

/**
 *
 * @author Estudiante
 */
import java.util.Scanner;

public class CalculadoraTextual {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double accumulator = 0.0;

        while (true) {
            System.out.println("Calculadora");
            System.out.println("Ingrese la opcion que desea: ");
            System.out.println("1. Suma");
            System.out.println("2. Resta");
            System.out.println("3. Multiplicación");
            System.out.println("4. División");
            System.out.println("5. Salir");
            System.out.print("Elija una opción: ");
            int choice = scanner.nextInt();

            if (choice == 5) {
                System.out.println("Saliendo de la calculadora.");
                break;
            }

            double operand;
            System.out.print("Ingrese el valor: ");
            operand = scanner.nextDouble();

            switch (choice) {
                case 1:
                    accumulator += operand;
                    break;
                case 2:
                    accumulator -= operand;
                    break;
                case 3:
                    accumulator *= operand;
                    break;
                case 4:
                    if (operand != 0) {
                        accumulator /= operand;
                    } else {
                        System.out.println("Error: Zero.");
                    }
                    break;
                default:
                    System.out.println("Opción no válida.");
                    break;
            }

            System.out.println("Resultado actual: " + accumulator);
        }

        scanner.close();
    }
}