package com.Billy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Introduzca el numero: ");
        int Numero = Integer.parseInt(br.readLine());
        int Resultado=0, Vueltas=0;
        Vueltas = Numero;


        for (int i = 0; i < Vueltas ; i++) {

            Resultado =  Resultado + Numero;

        }
        System.out.print("El resultado de la operación: ");
        System.out.println(Resultado);

    }
}
