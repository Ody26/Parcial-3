package com.example.demo.Entities;

public class Avatares {
    private int id_av;
    private String img_av;
    private String descrip_av;
    private String nombre_av;
    
    public Avatares() {
    }
    public Avatares(String img_av, String descrip_av, String nombre_av) {
        this.img_av = img_av;
        this.descrip_av = descrip_av;
        this.nombre_av = nombre_av;
    }
    public Avatares(int id_av, String img_av, String descrip_av, String nombre_av) {
        this.id_av = id_av;
        this.img_av = img_av;
        this.descrip_av = descrip_av;
        this.nombre_av = nombre_av;
    }
    public int getId_av() {
        return id_av;
    }
    public void setId_av(int id_av) {
        this.id_av = id_av;
    }
    public String getImg_av() {
        return img_av;
    }
    public void setImg_av(String img_av) {
        this.img_av = img_av;
    }
    public String getDescrip_av() {
        return descrip_av;
    }
    public void setDescrip_av(String descrip_av) {
        this.descrip_av = descrip_av;
    }
    public String getNombre_av() {
        return nombre_av;
    }
    public void setNombre_av(String nombre_av) {
        this.nombre_av = nombre_av;
    }
}
