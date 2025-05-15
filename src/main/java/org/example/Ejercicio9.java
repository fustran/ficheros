package org.example;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.File;
import java.io.IOException;

public class Ejercicio9 {

    public static void main(String[] args) {

        File archivo = new File("src/main/resources/Lorem.txt");
        File archivoTemp = new File("src/main/resources/temporal.txt");

        try {
            BufferedReader leer = new BufferedReader(new FileReader(archivo));
            BufferedWriter escribir = new BufferedWriter(new FileWriter(archivoTemp));

            String linea;

            while ((linea = leer.readLine()) != null) {

                String[] palabras = linea.split(" ");

                for (int i = 0; i < palabras.length; i++) {

                    if (!palabras[i].isEmpty()) {
                        palabras[i] = palabras[i].substring(0, 1).toUpperCase() + palabras[i].substring(1);
                    }
                }

                escribir.write(String.join(" ", palabras));
                escribir.newLine();
            }

            leer.close();
            escribir.close();

            if (archivo.delete()) {
                archivoTemp.renameTo(archivo);
                System.out.println();
                System.out.println("Archivo modificado correctamente.");
            } else {
                System.out.println("No se ha podido reemplazar el archivo original.");
            }

        } catch (IOException e) {
            System.out.println("Algo ha salido mal.");
        }
    }
}