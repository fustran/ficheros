package org.example;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;
import java.io.Serializable;
import java.util.Date;

@Getter
@AllArgsConstructor
@ToString
public class Festival implements Serializable {

    private String nombre;
    private transient Date fecha;// Transient para poner el valor a NULL
    private transient int aforo; // Transient para poner el valor a 0
    private String lugar;

}