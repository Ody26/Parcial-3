package com.example.demo.Controllers;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


import com.example.demo.Entities.Temporadas;
import com.example.demo.Entities.Usuarios;
import com.example.demo.Entities.Comunidad;
import com.example.demo.Entities.Guia;
import com.example.demo.Entities.Avatares;
import com.example.demo.Entities.Razones;
import com.example.demo.Entities.Eden;
import com.example.demo.Entities.Nav;
import com.example.demo.Entities.Banner;
import com.example.demo.Entities.Recursos_Razones;
import com.example.demo.Services.SkyDB;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class UserController {
    
    @CrossOrigin(origins = "http://127.0.0.1:8081")
    @GetMapping("/usuarios")
    public List<Usuarios> TodosLosUsuarios(){
        return new SkyDB().ObtenerTodosLosUsuarios();
    }
    
    @CrossOrigin(origins = "http://127.0.0.1:8081")
    @GetMapping("/temporadas")
    public ResponseEntity<List<Temporadas>> obtenerTemporadas() {
        List<Temporadas> temporadas = new SkyDB().ObtenerTemporadas();
        return new ResponseEntity<>(temporadas, HttpStatus.OK);
    }
    @CrossOrigin(origins = "http://127.0.0.1:8081")
    @GetMapping("/comunidad")
    public ResponseEntity<List<Comunidad>> SecComunidad(){
        List<Comunidad> comu = new SkyDB().ObtenerComunidad();
        return new ResponseEntity<>(comu, HttpStatus.OK);
    }
    @CrossOrigin(origins = "http://127.0.0.1:8081")
    @GetMapping("/guia")
    public ResponseEntity<List<Guia>> SecGuia(){
        List<Guia> guide = new SkyDB().ObtenerGuia();
        return new ResponseEntity<>(guide, HttpStatus.OK);
    }
    @CrossOrigin(origins = "http://127.0.0.1:8081")
    @GetMapping("/avatar")
    public ResponseEntity<List<Avatares>> SecAvatar(){
        List<Avatares> av = new SkyDB().ObtenerAvatar();
        return new ResponseEntity<>(av, HttpStatus.OK);
    }
    @CrossOrigin(origins = "http://127.0.0.1:8081")
    @GetMapping("/recursos")
    public ResponseEntity<List<Recursos_Razones>> RecursosRaz(){
        List<Recursos_Razones> recursos = new SkyDB().ObtenerRecursosR();
        return new ResponseEntity<>(recursos, HttpStatus.OK);
    }
    @CrossOrigin(origins = "http://127.0.0.1:8081")
    @GetMapping("/razones")
    public ResponseEntity<List<Razones>> razones(){
        List<Razones> r = new SkyDB().ObtenerRazones();
        return new ResponseEntity<>(r, HttpStatus.OK);
    }
    @CrossOrigin(origins = "http://127.0.0.1:8081")
    @GetMapping("/eden")
    public ResponseEntity<List<Eden>> eden(){
        List<Eden> e = new SkyDB().ObtenerEden();
        return new ResponseEntity<>(e, HttpStatus.OK);
    }
    @CrossOrigin(origins = "http://127.0.0.1:8081")
    @GetMapping("/nav")
    public ResponseEntity<List<Nav>> Navegacion(){
        List<Nav> nv = new SkyDB().ObtenerNav();
        return new ResponseEntity<>(nv, HttpStatus.OK);
    }
    @CrossOrigin(origins = "http://127.0.0.1:8081")
    @GetMapping("/banner")
    public ResponseEntity<List<Banner>> Ban(){
        List<Banner> bn = new SkyDB().ObtenerBanner();
        return new ResponseEntity<>(bn, HttpStatus.OK);
    }
    @CrossOrigin(origins = "http://127.0.0.1:8081")
    @PostMapping("/usuarios")
    public int InsertarUsuario(@RequestBody Usuarios user) {
        return new SkyDB().GuardarUsuarios(user);
    }
}
