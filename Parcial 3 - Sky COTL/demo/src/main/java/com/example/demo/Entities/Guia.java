package com.example.demo.Entities;

public class Guia {
    private int id_guia;
    private String img_fondo;
    private String img_guia;
    private String title_guia;
    private String descrip_guia;

    public Guia() {
    }
    public Guia(String img_fondo, String img_guia, String title_guia, String descrip_guia) {
        this.img_fondo = img_fondo;
        this.img_guia = img_guia;
        this.title_guia = title_guia;
        this.descrip_guia = descrip_guia;
    }
    public Guia(int id_guia, String img_fondo, String img_guia, String title_guia, String descrip_guia) {
        this.id_guia = id_guia;
        this.img_fondo = img_fondo;
        this.img_guia = img_guia;
        this.title_guia = title_guia;
        this.descrip_guia = descrip_guia;
    }
    public int getId_guia() {
        return id_guia;
    }
    public void setId_guia(int id_guia) {
        this.id_guia = id_guia;
    }
    public String getImg_fondo() {
        return img_fondo;
    }
    public void setImg_fondo(String img_fondo) {
        this.img_fondo = img_fondo;
    }
    public String getImg_guia() {
        return img_guia;
    }
    public void setImg_guia(String img_guia) {
        this.img_guia = img_guia;
    }
    public String getTitle_guia() {
        return title_guia;
    }
    public void setTitle_guia(String title_guia) {
        this.title_guia = title_guia;
    }
    public String getDescrip_guia() {
        return descrip_guia;
    }
    public void setDescrip_guia(String descrip_guia) {
        this.descrip_guia = descrip_guia;
    }
    
}
