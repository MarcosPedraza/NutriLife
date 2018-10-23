package com.kike.nutri.nutrilife.Models;

public class Ejercicio {

    String nombre_ejercicio;
    String url_video;
    String url_img;

    public Ejercicio() {
    }

    public Ejercicio(String nombre_ejercicio, String url_video, String url_img) {
        this.nombre_ejercicio = nombre_ejercicio;
        this.url_video = url_video;
        this.url_img = url_img;
    }


    public String getNombre_ejercicio() {
        return nombre_ejercicio;
    }

    public void setNombre_ejercicio(String nombre_ejercicio) {
        this.nombre_ejercicio = nombre_ejercicio;
    }

    public String getUrl_video() {
        return url_video;
    }

    public void setUrl_video(String url_video) {
        this.url_video = url_video;
    }

    public String getUrl_img() {
        return url_img;
    }

    public void setUrl_img(String url_img) {
        this.url_img = url_img;
    }
}
