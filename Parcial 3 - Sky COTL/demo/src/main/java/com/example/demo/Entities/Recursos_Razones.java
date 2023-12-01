package com.example.demo.Entities;

public class Recursos_Razones {
    private String img_nube;
    private String img_r1;
    private String img_r2;
    private String title_r;
    
    public Recursos_Razones() {
    }
    public Recursos_Razones(String img_nube, String img_r1, String img_r2, String title_r) {
        this.img_nube = img_nube;
        this.img_r1 = img_r1;
        this.img_r2 = img_r2;
        this.title_r = title_r;
    }
    public String getImg_nube() {
        return img_nube;
    }
    public void setImg_nube(String img_nube) {
        this.img_nube = img_nube;
    }
    public String getImg_r1() {
        return img_r1;
    }
    public void setImg_r1(String img_r1) {
        this.img_r1 = img_r1;
    }
    public String getImg_r2() {
        return img_r2;
    }
    public void setImg_r2(String img_r2) {
        this.img_r2 = img_r2;
    }
    public String getTitle_r() {
        return title_r;
    }
    public void setTitle_r(String title_r) {
        this.title_r = title_r;
    }

}
