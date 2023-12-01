package com.example.demo.Entities;

public class Banner {
    private String fondo;
    private String logo;
    private String title;
    private String nube;
    
    public Banner() {
    }
    
    public Banner(String fondo, String logo, String title, String nube) {
        this.fondo = fondo;
        this.logo = logo;
        this.title = title;
        this.nube = nube;
    }
    public String getNube() {
        return nube;
    }
    public void setNube(String nube) {
        this.nube = nube;
    }
    public String getFondo() {
        return fondo;
    }
    public void setFondo(String fondo) {
        this.fondo = fondo;
    }
    public String getLogo() {
        return logo;
    }
    public void setLogo(String logo) {
        this.logo = logo;
    }
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    
    
    

}
