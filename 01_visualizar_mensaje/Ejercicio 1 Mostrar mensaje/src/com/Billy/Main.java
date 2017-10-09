package com.Billy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
	// write your code here
        System.out.println("Escribe algo: ");

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String mensaje = br.readLine();

        System.out.println("Has escrito: "+mensaje);
    }
}
