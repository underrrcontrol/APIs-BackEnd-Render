package com.proyectoporfolio.porfolio.service;

import com.proyectoporfolio.porfolio.model.UsuarioModel;
import com.proyectoporfolio.porfolio.repository.UsuarioRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class UsuarioService implements IUsuarioService{
    
    @Autowired
    public UsuarioRepository usuaRepo;

     @Override
    public List<UsuarioModel> verUsuarioModel() {
        return usuaRepo.findAll();
    }
    
    @Override
    public void crearUsuarioModel(UsuarioModel usu) {
         usuaRepo.save(usu);
    }

    @Override
    public void borrarUsuarioModel(Long id) {
        usuaRepo.deleteById(id);
    }

    @Override
    public UsuarioModel buscarUsuarioModel(Long id) {
         return usuaRepo.findById(id).orElse(null);
    }
    
}
