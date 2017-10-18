package com.Billy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        // write your code here
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        double suma = 0;

        System.out.println("                 Suma de 10 números");
        System.out.println("          -------------------------------");



        for (int vueltas = 1; vueltas <= 10; vueltas = vueltas + 1){
            System.out.print("Introduzca un numero: ");
           double resultado = Double.parseDouble(br.readLine());
            suma = suma + resultado;
        }

        System.out.print("El resultado de la suma es: ");
        System.out.print(suma);

    }
}
