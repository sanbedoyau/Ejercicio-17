package com.mycompany.ejercicio_17;

import java.util.Scanner;
public class Ejercicio_17 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Ingrese el valor del radio: ");
        float x = input.nextFloat();
        System.out.println("El área del círculo es: " + ((x*x)*Math.PI));
        System.out.println("El diámetro de la circunferencia es: " + (2*x*(Math.PI)));
    }
}
