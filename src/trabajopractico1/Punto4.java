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
public class Punto4 {
    public static void Punto4(){
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese su nombre: ");
        String nombre = sc.nextLine(); 
        
        System.out.print("Ingrese su edad: ");
        int edad = sc.nextInt(); // lee un número entero

        System.out.println("Hola " + nombre + ", tu edad es " + edad + " años.");
    }
}
