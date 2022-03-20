package com.Tarea_3.domain;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "juego")

public class Juego implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idJuego;
    private String nombre;
    private double precio;
    private String disponible;

    public Juego() {
    }

    public Juego(Long idJuego, String nombre, double precio, String disponible) {
        this.idJuego = idJuego;
        this.nombre = nombre;
        this.precio = precio;
        this.disponible = disponible;
    }
    
    
    
}
