/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package trabajopractico1;

import java.util.Scanner;
/**
 *
 * @author Agustin
 */
public class Punto5 {
    public static void Punto5(){
        Scanner sc = new Scanner(System.in);

        // Pedir los dos números al usuario
        System.out.print("Ingrese el primer número entero: ");
        int num1 = sc.nextInt();

        System.out.print("Ingrese el segundo número entero: ");
        int num2 = sc.nextInt();

        // Operaciones
        int suma = num1 + num2;
        int resta = num1 - num2;
        int multiplicacion = num1 * num2;

        // Para la división verificamos que num2 no sea 0
        int division = num1 / num2; // División entera
        
        // Mostrar resultados
        System.out.println("Suma: " + suma);
        System.out.println("Resta: " + resta);
        System.out.println("Multiplicación: " + multiplicacion);
        System.out.println("División: " + division);

        sc.close();
    }
}
