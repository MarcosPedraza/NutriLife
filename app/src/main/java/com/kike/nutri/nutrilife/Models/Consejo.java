package com.kike.nutri.nutrilife.Models;

public class Consejo {

    String consejo;
    String url_img;


    public Consejo() {
    }

    public Consejo(String consejo, String url_img) {
        this.consejo = consejo;
        this.url_img = url_img;
    }

    public String getConsejo() {
        return consejo;
    }

    public void setConsejo(String consejo) {
        this.consejo = consejo;
    }

    public String getUrl_img() {
        return url_img;
    }

    public void setUrl_img(String url_img) {
        this.url_img = url_img;
    }
}
