package com.kike.nutri.nutrilife.Models;

public class DiaReceta {

    String dia_cod;
    String nombre_dia;
    int img_resource;

    public DiaReceta() {
    }

    public DiaReceta(String dia_cod, String nombre_dia,int resource_id) {
        this.dia_cod = dia_cod;
        this.nombre_dia = nombre_dia;
        this.img_resource = resource_id;
    }

    public String getDia_cod() {
        return dia_cod;
    }

    public void setDia_cod(String dia_cod) {
        this.dia_cod = dia_cod;
    }

    public String getNombre_dia() {
        return nombre_dia;
    }

    public void setNombre_dia(String nombre_dia) {
        this.nombre_dia = nombre_dia;
    }

    public int getImg_resource() {
        return img_resource;
    }

    public void setImg_resource(int img_resource) {
        this.img_resource = img_resource;
    }
}
