package com.Billy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int resto;
        System.out.println("                  Maquina de cambios");
        System.out.println("          -------------------------------");

        System.out.print("Introduzca el valor del producto: ");
        double precio = Double.parseDouble(br.readLine());
        precio = precio * 100;

        System.out.print("Introduzca el importe: ");
        double dinero = Double.parseDouble(br.readLine());
        dinero = dinero * 100;
        resto = (int) dinero % 5;

        while (resto != 0 || dinero < precio) {

            if (dinero < precio) {
                System.out.println("Importe insuficiente");

            } else if (resto != 0) {
                System.out.println("El importe no es multiplo de 5");
            }

            System.out.print("Introduzca el importe: ");
            dinero = Double.parseDouble(br.readLine());

            dinero = dinero * 100;
            resto = (int) dinero % 5;

            System.out.print("Resto: ");
            System.out.println(resto);
        }
        int a, b, c, d, e, f;


        dinero = dinero - precio;

        a = (int) dinero / 200;//Un euro
        a = a * 100;
        dinero = dinero - a;
        a = a / 100;

        System.out.print("Dinero: ");
        System.out.println(dinero);

        b = (int) dinero / 100;//Dos euros
        b = b * 100;
        dinero = dinero - b;
        b = b / 100;

        System.out.print("Dinero: ");
        System.out.println(dinero);

        c = (int) dinero / 50;//50 centimos
        c = c * 100;
        dinero = dinero - c;
        c = c / 100;

        System.out.print("Dinero: ");
        System.out.println(dinero);

        d = (int) dinero / 20;//20 centimos
        d = d * 100;
        dinero = dinero - d;
        d = d / 100;

        System.out.print("Dinero: ");
        System.out.println(dinero);

        e = (int) dinero / 10;//10 centimos
        e = e * 100;
        dinero = dinero - e;
        e = e / 100;

        System.out.print("Dinero: ");
        System.out.println(dinero);

        f = (int) dinero / 5;//5 centimos
        f = f * 100;
        dinero = dinero - f;
        f = f / 100;


        System.out.print("Dinero: ");
        System.out.println(dinero);

        System.out.println("Cambio");
        System.out.print("2: ");
        System.out.println(a);

        System.out.print("1: ");
        System.out.println(b);

        System.out.print("0.50: ");
        System.out.println(c);

        System.out.print("0.20: ");
        System.out.println(d);

        System.out.print("0.10: ");
        System.out.println(e);

        System.out.print("0.05: ");
        System.out.println(f);

        double total = a + b + c + d + e + f;

        System.out.print("total: ");
        System.out.println(total);


    }
}
