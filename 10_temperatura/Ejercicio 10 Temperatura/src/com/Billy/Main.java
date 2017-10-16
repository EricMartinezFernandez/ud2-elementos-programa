package com.Billy;

import javax.swing.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
	// write your code here
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        double Grados = 0;






        System.out.println("                    TEMPERATURA");
        System.out.println("          -------------------------------");

        System.out.print("Cuantos grados desea convertir: ");
        Grados = Double.parseDouble(br.readLine());


        System.out.println("          -------------------------------");

        System.out.println("Que formato desea convertir:");
        System.out.println("F) Fahrenheit");
        System.out.println("K) Kelvin");
        System.out.print("             Escribe: ");
        char Letra = br.readLine().charAt(0);

        if (Letra == 'f') {
            System.out.println("A elegido Farenheit");
            Grados = Grados * 255.9;
            System.out.print("El resultado de la conversión es: ");
            System.out.println(Grados);
            System.out.println("º");


        } else {

            while (Letra != 'k'){
                System.out.println("La letra introducida no es valida");

                System.out.println("Que formato desea convertir:");
                System.out.println("F) Fahrenheit");
                System.out.println("K) Kelvin");
                System.out.print("             Escribe: ");
                Letra = br.readLine().charAt(0);

            }


            System.out.println("A elegido Kelvin");
            Grados = Grados / 255.9;
            System.out.print("El resultado de la conversión es: ");
            System.out.print(Grados);
            System.out.println("º");
        }









    }
}

