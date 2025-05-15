package org.example;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Ejercicio7 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.println();

        System.out.println("Introduce la palabra a buscar:");
        String palabraBuscada = teclado.nextLine();

        int contador = 0;

        try {
            File fichero = new File("src/main/resources/prueba.txt");
            Scanner lector = new Scanner(fichero);

            while (lector.hasNext()) {

                String palabra = lector.next();
                palabra = palabra.replaceAll("\\W", "");

                if (palabra.equalsIgnoreCase(palabraBuscada)) {
                    contador++;
                }
            }

            lector.close();

            System.out.println("La palabra \"" + palabraBuscada + "\" aparece " + contador + " veces en el fichero.");

        } catch (FileNotFoundException e) {
            System.out.println("Algo ha salido mal");
            e.printStackTrace();
        }
    }
}