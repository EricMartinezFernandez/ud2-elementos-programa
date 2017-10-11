package com.Billy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
	// write your code here
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("                    Par o impar");
        System.out.println("          -------------------------------");

        System.out.print("Escribe un numero: ");
        double a = Double.parseDouble(br.readLine());

        double resto = a % 2;

        if (resto == 0){
            System.out.println("PAR");
        }else{
            System.out.println("IMPAR");
        }
    }
}
