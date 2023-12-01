package com.example.demo.Entities;

public class Eden {
    private String title_eden;
    private String descrip_eden;
    private String img_eden;
    
    public Eden() {
    }
    public Eden(String title_eden, String descrip_eden, String img_eden) {
        this.title_eden = title_eden;
        this.descrip_eden = descrip_eden;
        this.img_eden = img_eden;
    }
    public String getTitle_eden() {
        return title_eden;
    }
    public void setTitle_eden(String title_eden) {
        this.title_eden = title_eden;
    }
    public String getDescrip_eden() {
        return descrip_eden;
    }
    public void setDescrip_eden(String descrip_eden) {
        this.descrip_eden = descrip_eden;
    }
    public String getImg_eden() {
        return img_eden;
    }
    public void setImg_eden(String img_eden) {
        this.img_eden = img_eden;
    }
}
