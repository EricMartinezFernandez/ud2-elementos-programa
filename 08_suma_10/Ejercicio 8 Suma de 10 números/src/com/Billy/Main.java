package com.Billy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        // write your code here
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int vueltas = 0;
        double suma = 0;

        System.out.println("                 Suma de 10 números");
        System.out.println("          -------------------------------");

        while (vueltas < 10) {
            System.out.print("Introduzca un numero: ");
            double a = Double.parseDouble(br.readLine());
            suma = suma + a;
            vueltas++;
        }
        System.out.print("El resultado de la suma es: ");
        System.out.print(suma);

    }
}
