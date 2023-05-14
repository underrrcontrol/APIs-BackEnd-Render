package com.proyectoporfolio.porfolio.controller;

import com.proyectoporfolio.porfolio.model.UsuarioModel;
import com.proyectoporfolio.porfolio.service.IUsuarioService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
    
    @Autowired
    private IUsuarioService usuaServ;
    
    @PostMapping("/new/usuario")
    public void agregarUsuarioModel(UsuarioModel usua){
        usuaServ.crearUsuarioModel(usua);
    }
    
    @GetMapping("/ver/usuario")
    @ResponseBody
    public List<UsuarioModel> verUsuarioModel(){
        return usuaServ.verUsuarioModel();
    }
    
    @DeleteMapping("/delete/{id}")
    public void borrarUsuarioModel(@PathVariable Long id){
        usuaServ.borrarUsuarioModel(id);
    }
    
}
