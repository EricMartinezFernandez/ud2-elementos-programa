package com.Billy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
	// write your code here
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        double a = 1;

        System.out.println("                  Valor absoluto");
        System.out.println("          -------------------------------");


         do{
             System.out.print("Escribe un numero: ");
             a = Double.parseDouble(br.readLine());

             double b = a * 2;
             b = a - b;

             System.out.print("El valor absoluto es: ");
             System.out.print(a);
             System.out.print(" y ");
             System.out.print(b);
             System.out.println(" ");

         } while (a != 0);

        System.out.println("          -------------------------------");
        System.out.println("                        Fin");



    }
}
