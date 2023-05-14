package com.proyectoporfolio.porfolio.service;

import com.proyectoporfolio.porfolio.model.UsuarioModel;
import java.util.List;


public interface IUsuarioService {
    
    public List<UsuarioModel> verUsuarioModel();
    public void crearUsuarioModel(UsuarioModel usu);
    public void borrarUsuarioModel(Long id );
    public UsuarioModel buscarUsuarioModel(Long id);
}
