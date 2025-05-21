package org.example.Serializacion;

import java.io.*;

public class Binarios {

    public static void main(String[] args) {

        //DataOutputStream --> Escribe
        //FileOutputStream -- Lee

        // Data Output
        try {
            DataOutputStream fichero_binario = new DataOutputStream(new FileOutputStream("src/main/resources/Serializacion/ficherito.bin"));
            fichero_binario.writeBoolean(true);
            fichero_binario.writeDouble(3.500);
            fichero_binario.writeInt(10);
            fichero_binario.writeUTF("Nostalgia 90s");
            fichero_binario.close();

        } catch (IOException e) {
            System.out.println("Algo ha ido mal");
            e.printStackTrace();
        }

        // Data Input
        try {
            DataInputStream leer = new DataInputStream(new FileInputStream("C:\\Users\\ifusi\\IdeaProjects\\ficheros\\src\\main\\resources\\Serializacion\\ficherito.bin"));
            boolean booleano = leer.readBoolean();
            double doble = leer.readDouble();
            int entero = leer.readInt();
            String cadena = leer.readUTF();
            leer.close();

            System.out.println(booleano + " - " + doble + " - " + entero + " - " + cadena + ".");

        } catch (IOException e) {
            System.out.println("Algo ha ido mal");
            e.printStackTrace();
        }

        //File Input
        try {
            FileInputStream leerACiegas = new FileInputStream("src/main/resources/Serializacion/ficherito.bin");
            int bytes;

            while((bytes = leerACiegas.read()) != -1){
                System.out.print((char) bytes);
            }

        } catch (IOException e) {
            System.out.println("Algo ha ido mal");
            e.printStackTrace();
        }


    }
}