package com.Billy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
	// write your code here
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("                  Inversor de numeros");
        System.out.println("          -------------------------------");

        System.out.print("Introduzca el primer número: ");
        double a = Double.parseDouble(br.readLine());

        System.out.print("Introduzca el segundo número: ");
        double b = Double.parseDouble(br.readLine());

        System.out.print("Introduzca el tercer número: ");
        double c = Double.parseDouble(br.readLine());

        System.out.println("          -------------------------------");
        System.out.print("                  El resultado es: ");
        System.out.print(c);
        System.out.print(", ");
        System.out.print(b);
        System.out.print(", ");
        System.out.print(a);
        System.out.print(".");


    }
}
