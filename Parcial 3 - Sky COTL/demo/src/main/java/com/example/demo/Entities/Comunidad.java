package com.example.demo.Entities;

public class Comunidad {
    private int id_comun;
    private String img_fondoComun;
    private String img_secComun;
    private String title_Comun;
    private String descripC;
    
    public Comunidad() {
    }
    public Comunidad(String img_fondoComun, String img_secComun, String title_Comun, String descripC) {
        this.img_fondoComun = img_fondoComun;
        this.img_secComun = img_secComun;
        this.title_Comun = title_Comun;
        this.descripC = descripC;
    }
    public Comunidad(int id_comun, String img_fondoComun, String img_secComun, String title_Comun, String descripC) {
        this.id_comun = id_comun;
        this.img_fondoComun = img_fondoComun;
        this.img_secComun = img_secComun;
        this.title_Comun = title_Comun;
        this.descripC = descripC;
    }
    public int getId_comun() {
        return id_comun;
    }
    public void setId_comun(int id_comun) {
        this.id_comun = id_comun;
    }
    public String getImg_fondoComun() {
        return img_fondoComun;
    }
    public void setImg_fondoComun(String img_fondoComun) {
        this.img_fondoComun = img_fondoComun;
    }
    public String getImg_secComun() {
        return img_secComun;
    }
    public void setImg_secComun(String img_secComun) {
        this.img_secComun = img_secComun;
    }
    public String getTitle_Comun() {
        return title_Comun;
    }
    public void setTitle_Comun(String title_Comun) {
        this.title_Comun = title_Comun;
    }
    public String getDescripC() {
        return descripC;
    }
    public void setDescripC(String descripC) {
        this.descripC = descripC;
    }
}
