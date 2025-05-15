package org.example;

import java.io.*;
import java.util.Scanner;

public class Ejercicio10 {

    public static void main(String[] args) {

        File archivo1 = new File("src/main/resources/archivo1.txt");
        File archivo2 = new File("src/main/resources/archivo2.txt");
        File archivoSalida = new File("src/main/resources/archivoMixto.txt");

        try {
            Scanner lector1 = new Scanner(archivo1);
            Scanner lector2 = new Scanner(archivo2);

            BufferedWriter escribir = new BufferedWriter(new FileWriter(archivoSalida));

            while (lector1.hasNext() || lector2.hasNext()) {

                if (lector1.hasNext()) {
                    escribir.write(lector1.next());
                    escribir.write(" ");
                }
                if (lector2.hasNext()) {
                    escribir.write(lector2.next());
                    escribir.write(" ");
                }
            }

            lector1.close();
            lector2.close();
            escribir.close();

            System.out.println();
            System.out.println("Archivos combinados correctamente.");

        } catch (IOException e) {
            System.out.println("Algo ha salido mal.");
        }
    }
}