package com.example.demo.Entities;

public class Nav {
    private String logo;
    private String nube;
    private String icono_munu;
    
    public Nav() {
    }
    public Nav(String logo, String nube, String icono_munu) {
        this.logo = logo;
        this.nube = nube;
        this.icono_munu = icono_munu;
    }
    public String getLogo() {
        return logo;
    }
    public void setLogo(String logo) {
        this.logo = logo;
    }
    public String getNube() {
        return nube;
    }
    public void setNube(String nube) {
        this.nube = nube;
    }
    public String getIcono_munu() {
        return icono_munu;
    }
    public void setIcono_munu(String icono_munu) {
        this.icono_munu = icono_munu;
    }
}
