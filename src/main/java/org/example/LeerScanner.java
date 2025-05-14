package org.example;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;


//Actividad 6
public class LeerScanner {

    public static void main(String[] args) {

        try {
            File fichero = new File("src/main/resources/prueba.txt");
            Scanner lector = new Scanner(fichero);
            System.out.println();

            while (lector.hasNextLine()){
                String linea = lector.nextLine();

                String[] palabras = linea.split(",");
                System.out.println("Alumno: " + palabras[0] + " con nota:" + palabras[1]);
            }

            lector.close();

        } catch (FileNotFoundException e) {
            System.out.println("Algo ha salido mal");
            e.printStackTrace();
        }
    }
}