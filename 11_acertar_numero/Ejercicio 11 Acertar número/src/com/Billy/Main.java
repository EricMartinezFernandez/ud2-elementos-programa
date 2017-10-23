package com.Billy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;

public class Main {

    public static void main(String[] args) throws IOException {
        // write your code here
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        Random r = new Random();// NUEMRO ALEATORIO
        int aleatorio = r.nextInt(100);

        int n = 0, intentos;
        String Numero;


        System.out.println("                  ACIERTA EL NÚMERO");
        System.out.println("          -------------------------------");

        do {
            //Numero aleatorio en pantalla
            System.out.print("Numero aleatorio: ");
            System.out.println(aleatorio);


            System.out.print("Escribe: ");
            Numero = br.readLine();

            if (!Numero.equalsIgnoreCase("FIN")) {

                n = Integer.parseInt(Numero);


                if (n == aleatorio) {

                    System.out.println("Enorabuena, has ganado");


                } else if (n < aleatorio) {
                    System.out.println("Es mayor");
                } else if (n > aleatorio) {
                    System.out.println("Es menor");
                }
            }

        } while (!Numero.equalsIgnoreCase("FIN") && n != aleatorio);

        System.out.println("Fin de la aplicación");
    }
}

