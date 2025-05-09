package org.example;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.println("Cuántos ficheros quieres?");
        int numero = teclado.nextInt();

        System.out.println("En qué carpeta los quieres?");
        teclado.nextLine();
        String carpeta = teclado.nextLine();

        File comprobarCarpeta = new File(carpeta);

        if (comprobarCarpeta.exists()){
            for (int i = 1; i <= numero; i++) {
                File fichero2 = new File( carpeta + "/nombre(" + i + ").txt");
                try {
                    fichero2.createNewFile();
                    System.out.println("Fichero " + fichero2.getName() + " creado...");
                } catch (IOException e) {
                    System.out.println("Algo ha ido mal");
                    e.printStackTrace();
                }
            }
        }else {
            System.out.println("ERROR: La ruta no existe...");
        }

    }
}