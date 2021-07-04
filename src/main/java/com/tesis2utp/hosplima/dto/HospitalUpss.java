package com.tesis2utp.hosplima.dto;

import com.tesis2utp.hosplima.model.Upss;

import java.util.List;

public class HospitalUpss {
    private Long id;
    private String ipress;
    private String nombre;
    private String ubigeo;
    private String departamento;
    private String provincia;
    private String distrito;
    private String direccion;
    private Double longitud;
    private Double latitud;
    private String horario;
    private String telefono;
    private String telefono_emergencia;
    private String url;
    private String ruc;
    private String razon;
    private String categoria;
    private String clasificacion;
    private String tipo;
    private String diresa;
    private String odsis;
    private String disa;
    private String red;
    private String microred;
    private String institucion;
    private Integer camas;
    private List<Upss> upssList;

    public HospitalUpss() {
    }

    public HospitalUpss(Long id, String ipress, String nombre, String ubigeo, String departamento, String provincia, String distrito, String direccion, Double longitud, Double latitud, String horario, String telefono, String telefono_emergencia, String url, String ruc, String razon, String categoria, String clasificacion, String tipo, String diresa, String odsis, String disa, String red, String microred, String institucion, Integer camas, List<Upss> upss) {
        this.id = id;
        this.ipress = ipress;
        this.nombre = nombre;
        this.ubigeo = ubigeo;
        this.departamento = departamento;
        this.provincia = provincia;
        this.distrito = distrito;
        this.direccion = direccion;
        this.longitud = longitud;
        this.latitud = latitud;
        this.horario = horario;
        this.telefono = telefono;
        this.telefono_emergencia = telefono_emergencia;
        this.url = url;
        this.ruc = ruc;
        this.razon = razon;
        this.categoria = categoria;
        this.clasificacion = clasificacion;
        this.tipo = tipo;
        this.diresa = diresa;
        this.odsis = odsis;
        this.disa = disa;
        this.red = red;
        this.microred = microred;
        this.institucion = institucion;
        this.camas = camas;
        this.upssList = upss;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getIpress() {
        return ipress;
    }

    public void setIpress(String ipress) {
        this.ipress = ipress;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getUbigeo() {
        return ubigeo;
    }

    public void setUbigeo(String ubigeo) {
        this.ubigeo = ubigeo;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public String getProvincia() {
        return provincia;
    }

    public void setProvincia(String provincia) {
        this.provincia = provincia;
    }

    public String getDistrito() {
        return distrito;
    }

    public void setDistrito(String distrito) {
        this.distrito = distrito;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public Double getLongitud() {
        return longitud;
    }

    public void setLongitud(Double longitud) {
        this.longitud = longitud;
    }

    public Double getLatitud() {
        return latitud;
    }

    public void setLatitud(Double latitud) {
        this.latitud = latitud;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getTelefono_emergencia() {
        return telefono_emergencia;
    }

    public void setTelefono_emergencia(String telefono_emergencia) {
        this.telefono_emergencia = telefono_emergencia;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getRuc() {
        return ruc;
    }

    public void setRuc(String ruc) {
        this.ruc = ruc;
    }

    public String getRazon() {
        return razon;
    }

    public void setRazon(String razon) {
        this.razon = razon;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getClasificacion() {
        return clasificacion;
    }

    public void setClasificacion(String clasificacion) {
        this.clasificacion = clasificacion;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getDiresa() {
        return diresa;
    }

    public void setDiresa(String diresa) {
        this.diresa = diresa;
    }

    public String getOdsis() {
        return odsis;
    }

    public void setOdsis(String odsis) {
        this.odsis = odsis;
    }

    public String getDisa() {
        return disa;
    }

    public void setDisa(String disa) {
        this.disa = disa;
    }

    public String getRed() {
        return red;
    }

    public void setRed(String red) {
        this.red = red;
    }

    public String getMicrored() {
        return microred;
    }

    public void setMicrored(String microred) {
        this.microred = microred;
    }

    public String getInstitucion() {
        return institucion;
    }

    public void setInstitucion(String institucion) {
        this.institucion = institucion;
    }

    public Integer getCamas() {
        return camas;
    }

    public void setCamas(Integer camas) {
        this.camas = camas;
    }

    public List<Upss> getUpssList() {
        return upssList;
    }

    public void setUpssList(List<Upss> upssList) {
        this.upssList = upssList;
    }
}
