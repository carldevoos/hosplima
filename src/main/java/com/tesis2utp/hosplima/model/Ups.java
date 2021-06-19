package com.tesis2utp.hosplima.model;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "ups",
        uniqueConstraints = {@UniqueConstraint(columnNames = "ups")}
)
public class Ups implements Serializable {

    @Id
    @Column(name = "id_ups")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String ups;
    private String nombre;

    public Ups() {
    }

    public Ups(Long id, String ups, String nombre) {
        this.id = id;
        this.ups = ups;
        this.nombre = nombre;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUps() {
        return ups;
    }

    public void setUps(String ups) {
        this.ups = ups;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
