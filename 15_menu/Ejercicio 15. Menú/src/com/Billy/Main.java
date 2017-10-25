package com.Billy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        double a=0, b=0, c=0;
        int fin = 0;

        do {


            System.out.println("------");
            System.out.println("a) Suma.");
            System.out.println("b) Resta.");
            System.out.println("c) Multiplicación.");
            System.out.println("d) division.");
            System.out.println("e) Resto.");
            System.out.println("f) Terminar");
            System.out.println("------");
            System.out.println("Elija la operación que desea realizar: ");
            char Decision = br.readLine().charAt(0);




            switch (Decision) {
                case 'a':
                    System.out.println("------");
                    System.out.println("SUMA");
                    System.out.println("------");
                    System.out.print("Introduzca el primero valor: ");
                    a = Double.parseDouble(br.readLine());
                    System.out.println("");
                    System.out.print("Introduzca el segundo valor: ");
                    b = Double.parseDouble(br.readLine());
                    System.out.println("------");

                    c = a + b;
                    System.out.print("El resultado de la suma es: ");
                    System.out.println(c);
                    break;

                case 'b':
                    System.out.println("------");
                    System.out.println("RESTA");
                    System.out.println("------");
                    System.out.print("Introduzca el primero valor: ");
                    a = Double.parseDouble(br.readLine());
                    System.out.println("");
                    System.out.print("Introduzca el segundo valor: ");
                    b = Double.parseDouble(br.readLine());
                    System.out.println("------");

                    c = a - b;
                    System.out.print("El resultado de la resta es: ");
                    System.out.println(c);
                    break;

                case 'c':
                    System.out.println("------");
                    System.out.println("MULTIPLICACIÖN");
                    System.out.println("------");
                    System.out.print("Introduzca el primero valor: ");
                    a = Double.parseDouble(br.readLine());
                    System.out.println("");
                    System.out.print("Introduzca el segundo valor: ");
                    b = Double.parseDouble(br.readLine());
                    System.out.println("------");

                    c = a * b;
                    System.out.print("El resultado de la multiplicación es: ");
                    System.out.println(c);
                    break;

                case 'd':
                    System.out.println("------");
                    System.out.println("DIVISIÓN");
                    System.out.println("------");
                    System.out.print("Introduzca el primero valor: ");
                    a = Double.parseDouble(br.readLine());
                    System.out.println("");
                    System.out.print("Introduzca el segundo valor: ");
                    b = Double.parseDouble(br.readLine());
                    System.out.println("------");

                    c = a / b;
                    System.out.print("El resultado de la división es: ");
                    System.out.println(c);
                    break;

                case 'e':
                    System.out.println("------");
                    System.out.println("RESTO");
                    System.out.println("------");
                    System.out.print("Introduzca el primero valor: ");
                    a = Double.parseDouble(br.readLine());
                    System.out.println("");
                    System.out.print("Introduzca el segundo valor: ");
                    b = Double.parseDouble(br.readLine());
                    System.out.println("------");

                    c = a % b;
                    System.out.print("El resultado del resto es: ");
                    System.out.println(c);
                    break;

                case 'f':

                    fin = 1;
                    break;

                default:
                    System.out.println("Carácter inválido");
                    break;
            }

        }while(fin != 1);

        System.out.println("Fin de la aplicación.");


    }
}
