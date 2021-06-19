package com.tesis2utp.hosplima.model;

import javax.persistence.*;

@Entity
@Table(name = "upss",
        uniqueConstraints = {@UniqueConstraint(columnNames = "upss")}
)
public class Upss {
    @Id
    @Column(name = "id_upss")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String upss;
    private String nombre;

    public Upss() {
    }

    public Upss(Long id, String upss, String nombre) {
        this.id = id;
        this.upss = upss;
        this.nombre = nombre;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUpss() {
        return upss;
    }

    public void setUpss(String upss) {
        this.upss = upss;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
