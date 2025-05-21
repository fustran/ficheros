package org.example.Serializacion;

import java.io.*;
import java.util.Date;

public class Serializar {

    public static void main(String[] args) {

        Festival noventeros = new Festival("Festival noventero", new Date(2025-8-23), 2000, "Alicante");

        //Serializar con Output
        try {
            ObjectOutputStream objetoSerializado = new ObjectOutputStream(new FileOutputStream("src/main/resources/Serializacion/Festival.ser"));
            objetoSerializado.writeObject(noventeros);
            objetoSerializado.close();

        } catch (IOException e) {
            System.out.println("Algo ha ido mal");
            e.printStackTrace();
        }

        try {
            ObjectInputStream leerObjeto = new ObjectInputStream(new FileInputStream("src/main/resources/Serializacion/Festival.ser"));
            Festival noventerosLeidos = (Festival) leerObjeto.readObject();
            leerObjeto.close();

            System.out.println();
            System.out.println(
                    "Nombre del festival: " + noventerosLeidos.getNombre() +
                    ", Fecha: " + noventerosLeidos.getFecha() +
                    ", Aforo: " + noventerosLeidos.getAforo() +
                    ", Lugar: " + noventerosLeidos.getLugar() + ".");

        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Algo ha ido mal.");
            e.printStackTrace();
        }

    }
}