package com.Billy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
	// write your code here
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int vueltas = 0;
        double SumaTotal = 0;

        System.out.println("                 Suma de N numeros");
        System.out.println("          -------------------------------");

        System.out.print("Introduzca la cantidad de numeros que desea sumar: ");
        int VueltasUsuario = Integer.parseInt(br.readLine());

        for (vueltas = 0; VueltasUsuario >  vueltas; vueltas++) {

            System.out.print("Introduzaca un numero: ");
            double a = Double.parseDouble(br.readLine());
            SumaTotal = SumaTotal + a;

        }

        
        System.out.println("          -------------------------------");
        System.out.print("El resultado de la suma es: ");
        System.out.print(SumaTotal);

    }
}
