package com.Billy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        // write your code here

        System.out.println("                Calculadora de Sumas");
        System.out.println("          -------------------------------");


        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Introduca el primer valor:");
        double a = Double.parseDouble(br.readLine());

        System.out.print("Introduca el segundo valor:");
        double b = Double.parseDouble(br.readLine());

        double c = a * b;


        System.out.println("          -------------------------------");
        System.out.print("El resultado de la Multiplicación es: ");
        System.out.print(c);
    }
}
