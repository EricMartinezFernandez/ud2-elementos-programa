package com.Billy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
	// write your code here
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("                Área de un triángulo");
        System.out.println("          -------------------------------");

        System.out.print("Introduzca la altura: ");
        double Altura = Double.parseDouble(br.readLine());

        System.out.print("Introduzca la base: ");
        double Base = Double.parseDouble(br.readLine());

        double Área = (Base / 2) * Altura;

        System.out.println("          -------------------------------");
        System.out.print("                  El resultado es: ");
        System.out.println(Área);


    }
}
