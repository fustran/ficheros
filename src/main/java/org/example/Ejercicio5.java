package org.example;

import java.io.File;

public class Ejercicio5 {

    public static void main(String[] args) {

        File carpetas = new File("src/main/resources");

        filtrar(carpetas);
        filtrar(carpetas, ".pdf");
    }

    public static void filtrar(File carpeta){

        String []contenidoCarpeta = carpeta.list();

        if (contenidoCarpeta != null && contenidoCarpeta.length > 0){

            for (String contenido : contenidoCarpeta){

                if (contenido.endsWith(".txt")){
                    System.out.println(contenido);
                }
            }

        }else {
            System.out.println("La carpeta está vacía");
        }
    }

    public static void filtrar(File carpeta, String text) {

        String []contenidoCarpeta = carpeta.list();
        boolean existe = false;

        if (contenidoCarpeta != null && contenidoCarpeta.length > 0){

            for (String contenido : contenidoCarpeta){

                if (contenido.endsWith(text)){
                    existe = true;
                    System.out.println(contenido);
                }
            }

            if (!existe) {
                System.out.println("El formato " + text + " no existe.");
            }

        }else {
            System.out.println("La carpeta está vacía");
        }
    }
}