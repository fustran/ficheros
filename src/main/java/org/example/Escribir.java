package org.example;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Escribir {

    public static void main(String[] args) {


        try {
            BufferedWriter escribir =  new BufferedWriter(new FileWriter("src/main/resources/prueba.txt"));
            escribir.write("David bueno vs David malo");
            escribir.flush();
            escribir.newLine();
            escribir.write("Esto es una linea flusheada");
            escribir.close();
        } catch (IOException e) {
            System.out.println("Algo ha salido mal");
            e.printStackTrace();

        }

        System.out.println();
        System.out.println("Fichero escrito con éxito");

    }
}