package com.Billy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int PuntoDePartida=0;

        System.out.println("                100 numeros Pares o Impares");
        System.out.println("             -----------------------------------");

        System.out.println("Par o impar: ");
        String decision = (br.readLine());

        if (decision.equalsIgnoreCase("par")){

            PuntoDePartida = 0;
            for (int a = 0; a < 51 ; a++) {

                System.out.println(PuntoDePartida);
                PuntoDePartida = PuntoDePartida + 2;

            }

        }else if(decision.equalsIgnoreCase("impar")){

            PuntoDePartida = 1;
            for (int a = 0; a < 51 ; a++) {

                System.out.println(PuntoDePartida);
                PuntoDePartida = PuntoDePartida + 2;

            }

        }else{
            System.out.println("No se reconoce el caracter introducido.");
        }


        System.out.println("Fin de la aplicación");





	// write your code here
    }
}
