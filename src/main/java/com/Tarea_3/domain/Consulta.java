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
@Table(name = "consulta")

public class Consulta implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idConsulta;
    private String correo;
    private String consulta;

    public Consulta() {
    }

    public Consulta(Long idConsulta, String correo, String consulta) {
        this.idConsulta = idConsulta;
        this.correo = correo;
        this.consulta = consulta;
    }

    

}
