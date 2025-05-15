package org.example;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Ejercicio6 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.println();

        System.out.println("Introduce la palabra a buscar:");
        String palabraBuscada = teclado.nextLine();

        int contador = 0;

        try {
            BufferedReader lector = new BufferedReader(new FileReader("src/main/resources/Lorem.txt"));
            String linea;

            while ((linea = lector.readLine()) != null) {

                String[] palabras = linea.split("\\W+");

                for (String palabra : palabras) {

                    if (palabra.equalsIgnoreCase(palabraBuscada)) {
                        contador++;
                    }
                }
            }

            lector.close();

            System.out.println();
            System.out.println("La palabra \"" + palabraBuscada + "\" aparece " + contador + " veces en el fichero.");

        } catch (IOException e) {
            System.out.println("Algo ha ido mal");
            e.printStackTrace();
        }
    }
}