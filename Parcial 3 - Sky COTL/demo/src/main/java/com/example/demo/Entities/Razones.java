package com.example.demo.Entities;

public class Razones {
    private int id_r;
    private String razon;
    
    public Razones() {
    }
    public Razones(String razon) {
        this.razon = razon;
    }
    public Razones(int id_r, String razon) {
        this.id_r = id_r;
        this.razon = razon;
    }
    public int getId_r() {
        return id_r;
    }
    public void setId_r(int id_r) {
        this.id_r = id_r;
    }
    public String getRazon() {
        return razon;
    }
    public void setRazon(String razon) {
        this.razon = razon;
    }

}
