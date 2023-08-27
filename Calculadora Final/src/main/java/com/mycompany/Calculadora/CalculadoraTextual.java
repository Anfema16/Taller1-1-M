/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.Calculadora;

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
            System.out.println("Calculadora AFMO's");
            System.out.println("");
            System.out.println("1. Suma (+) ");
            System.out.println("2. Resta (-) ");
            System.out.println("3. Multiplicación (*) ");
            System.out.println("4. División (/) ");
            System.out.println("5. Seno (SinƟ) ");
            System.out.println("6. Coseno (CosƟ) ");
            System.out.println("7. Tangente (TanƟ) ");
            System.out.println("8. Raíz enésima (√) ");
            System.out.println("9. Potencia enésima (^) ");
            System.out.println("10. Porcentaje del IVA (%Iva) ");
            System.out.println("11. Salir (X) ");
            System.out.println("Ingrese la opcion que necesite: ");
            int choice = scanner.nextInt();
            if (choice == 11) {
                System.out.println("Hasta Pronto :)");
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
                case 5:
                    accumulator = Math.sin(operand);
                    break;
                case 6:
                    accumulator = Math.cos(operand);
                    break;
                case 7:
                    accumulator = Math.tan(operand);
                    break;
                case 8:
                    if (operand >= 0) {
                        System.out.print("Ingrese el índice de la raíz: ");
                        int rootIndex = scanner.nextInt();
                        accumulator = Math.pow(operand, 1.0 / rootIndex);
                    } else {
                        System.out.println("Error: Numero Negativo.");
                    }
                    break;
                case 9:
                    System.out.print("Ingrese la potencia: ");
                    double exponent = scanner.nextDouble();
                    accumulator = Math.pow(operand, exponent);
                    break;
                case 10:
                     System.out.print("Ingrese el porcentaje de IVA: ");
                    double ivaPercentage = scanner.nextDouble();
                    accumulator = operand * (1 + ivaPercentage / 100);
                    break;
                default:
                    System.out.println("Opción no válida.");
                    break;
            }
            System.out.println("*******************");
            System.out.println("Resultado actual: ");
            System.out.println(accumulator);
            System.out.println("*******************");
        }
        scanner.close();
    }
}