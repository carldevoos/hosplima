package com.tesis2utp.hosplima.model;

import javax.persistence.*;

@Entity
@Table(
        name = "ubigeo_distrito",
        uniqueConstraints = {
                @UniqueConstraint(columnNames = "ubigeo"),
                @UniqueConstraint(columnNames = "distrito")
        })
public class UbigeoDistrito {
    @Id
    @Column(name = "id_ubigeo")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String ubigeo;
    private String distrito;

    public UbigeoDistrito() {
    }

    public UbigeoDistrito(Long id, String ubigeo, String distrito) {
        this.id = id;
        this.ubigeo = ubigeo;
        this.distrito = distrito;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUbigeo() {
        return ubigeo;
    }

    public void setUbigeo(String ubigeo) {
        this.ubigeo = ubigeo;
    }

    public String getDistrito() {
        return distrito;
    }

    public void setDistrito(String distrito) {
        this.distrito = distrito;
    }
}
