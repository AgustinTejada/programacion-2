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
public class Punto8 {
    public static void Punto8(){
        Scanner sc = new Scanner(System.in);

        // Pedir los dos números al usuario
        System.out.print("Ingrese el primer número entero: ");
        double num1 = sc.nextDouble();

        System.out.print("Ingrese el segundo número entero: ");
        double num2 = sc.nextDouble();

        // Operacion
        double division = num1 / num2;
        
        // Mostrar resultados
        System.out.println("División: " + division);

        sc.close();
    }
}
