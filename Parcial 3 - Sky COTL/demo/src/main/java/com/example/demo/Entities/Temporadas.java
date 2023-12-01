package com.example.demo.Entities;

public class Temporadas {
    private int id_t;
    private String img_t;
    private String titulo;
    
    public Temporadas() {
    }

    public Temporadas(int id_t, String img_t, String titulo) {
        this.id_t = id_t;
        this.img_t = img_t;
        this.titulo = titulo;
    }

    public Temporadas(String img_t, String titulo) {
        this.img_t = img_t;
        this.titulo = titulo;
    }

    public int getId_t() {
        return id_t;
    }

    public void setId_t(int id_t) {
        this.id_t = id_t;
    }

    public String getImg_t() {
        return img_t;
    }

    public void setImg_t(String img_t) {
        this.img_t = img_t;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

}
