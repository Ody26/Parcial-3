package com.example.demo.Services;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.example.demo.Entities.Temporadas;
import com.example.demo.Entities.Comunidad;
import com.example.demo.Entities.Usuarios;
import com.example.demo.Entities.Guia;
import com.example.demo.Entities.Razones;
import com.example.demo.Entities.Avatares;
import com.example.demo.Entities.Recursos_Razones;
import com.example.demo.Entities.Eden;
import com.example.demo.Entities.Nav;
import com.example.demo.Entities.Banner;
import com.example.demo.Helpers.Conexion;

public class SkyDB {
    private Connection _cn;
    
    public SkyDB(){
        this._cn = new Conexion().openDB();
    }

    public List<Usuarios> ObtenerTodosLosUsuarios(){
        try {
            Statement stm = _cn.createStatement();
            String query = "Select * from usuarios";
            List<Usuarios> usuarios = new ArrayList<>();
            ResultSet result = stm.executeQuery(query);
    
            while(result.next()){
                Usuarios user = new Usuarios(
                    result.getInt("id_usua"),
                    result.getString("nombre"),
                    result.getString("email"),
                    result.getString("mensaje")
                );
                usuarios.add(user);
            }
            result.close();
            stm.close();
            return usuarios;
        } catch (Exception e) {
        }
        return null;
    }
    public List<Temporadas> ObtenerTemporadas(){
        try {
            Statement stm = _cn.createStatement();
            String query = "Select * from sec_temporadas";
            List<Temporadas> temp = new ArrayList<>();
            ResultSet result = stm.executeQuery(query);
            while (result.next()) {
                Temporadas t = new Temporadas(
                    result.getInt("id_temp"),
                    result.getString("img"),
                    result.getString("titulo")
                );
                temp.add(t);
            }
            result.close();
            stm.close();
            return temp;
        } catch (Exception e) {
        }
        return null;
    }
    public List<Comunidad> ObtenerComunidad(){
        try {
            Statement stm = _cn.createStatement();
            String query = "Select * from sec_comunidad";
            List<Comunidad> comun = new ArrayList<>();
            ResultSet result = stm.executeQuery(query);

            while(result.next()){
                Comunidad c = new Comunidad(
                    result.getInt("id_comun"),
                    result.getString("img_fondo_Comun"),
                    result.getString("img_comunidad"),
                    result.getString("title_comun"),
                    result.getString("descrip_comun")
                );
                comun.add(c);
            }
            result.close();
            stm.close();
            return comun;
        } catch (Exception e) {
        }
        return null;
    }
    public List<Guia> ObtenerGuia(){
        try{
            Statement stm = _cn.createStatement();
            String query = "Select * from sec_guia";
            List<Guia> guia = new ArrayList<>();
            ResultSet result = stm.executeQuery(query);
            while(result.next()){
                Guia g = new Guia(
                    result.getInt("id_guia"),
                    result.getString("img_fondo"),
                    result.getString("img_guia"),
                    result.getString("title_guia"),
                    result.getString("descrip_guia")
                );
                guia.add(g);
            }
            result.close();
            stm.close();
            return guia;
        }catch (Exception e){
        }
        return null;
    }
    public List<Avatares> ObtenerAvatar(){
        try{
            Statement stm = _cn.createStatement();
            String query = "Select * from sec_avatares";
            List<Avatares> avatar = new ArrayList<>();
            ResultSet result = stm.executeQuery(query);
            while(result.next()){
                Avatares a = new Avatares(
                    result.getInt("id_av"),
                    result.getString("img_av"),
                    result.getString("descrip_av"),
                    result.getString("nombre_av")
                );
                avatar.add(a);
            }
            result.close();
            stm.close();
            return avatar;
        }catch (Exception e){
        }
        return null;
    }
    public List<Recursos_Razones> ObtenerRecursosR(){
        try{
            Statement stm = _cn.createStatement();
            String query = "Select * from sec_Recursos_razones";
            List<Recursos_Razones> recursosr = new ArrayList<>();
            ResultSet result = stm.executeQuery(query);
            while(result.next()){
                Recursos_Razones rr = new Recursos_Razones(
                    result.getString("img_nube"),
                    result.getString("img_r1"),
                    result.getString("img_r2"),
                    result.getString("title_r")
                );
                recursosr.add(rr);
            }
            result.close();
            stm.close();
            return recursosr;
        }catch (Exception e){
        }
        return null;
    }

    public List<Razones>ObtenerRazones(){
        try {
            Statement stm = _cn.createStatement();
            String query = "Select * from sec_razones";
            List<Razones> razones = new ArrayList<>();
            ResultSet result = stm.executeQuery(query);

            while (result.next()) {
                Razones r = new Razones(
                    result.getString("razon")
                );
                razones.add(r);
            }
            result.close();
            stm.close();
            return razones;
        } catch (Exception e) {
        }
        return null;
    }
    public List<Eden>ObtenerEden(){
        try {
            Statement stm = _cn.createStatement();
            String query = "Select * from sec_Eden";
            List<Eden> eden = new ArrayList<>();
            ResultSet result = stm.executeQuery(query);

            while (result.next()) {
                Eden d = new Eden(
                    result.getString("title_eden"),
                    result.getString("descrip_eden"),
                    result.getString("img_eden")
                );
                eden.add(d);
            }
            result.close();
            stm.close();
            return eden;
        } catch (Exception e) {
        }
        return null;
    }
    public List<Nav>ObtenerNav(){
        try {
            Statement stm = _cn.createStatement();
            String query = "Select * from nav";
            List<Nav> navi = new ArrayList<>();
            ResultSet result = stm.executeQuery(query);

            while (result.next()) {
                Nav n = new Nav(
                    result.getString("img_logo"),
                    result.getString("img_nubeNav"),
                    result.getString("icon_menu")
                );
                navi.add(n);
            }
            result.close();
            stm.close();
            return navi;
        } catch (Exception e) {
        }
        return null;
    }
    public List<Banner>ObtenerBanner(){
        try {
            Statement stm = _cn.createStatement();
            String query = "Select * from banner";
            List<Banner> bann = new ArrayList<>();
            ResultSet result = stm.executeQuery(query);

            while (result.next()) {
                Banner b = new Banner(
                    result.getString("img_fondo_banner"),
                    result.getString("logo_banner"),
                    result.getString("title_banner"),
                    result.getString("img_nubeBanner")
                );
                bann.add(b);
            }
            result.close();
            stm.close();
            return bann;
        } catch (Exception e) {
        }
        return null;
    }
    public int GuardarUsuarios(Usuarios user) {
    int resultado = 0;
    try {
        Statement stm = _cn.createStatement();
        String query = "insert into Usuarios values('"
            + user.getNombre() + "','"
            + user.getEmail() + "','"
            + user.getMensaje() + "')";

        resultado = stm.executeUpdate(query);
        return resultado;
    } catch (Exception e) {
    }
    return resultado;
    }
}
