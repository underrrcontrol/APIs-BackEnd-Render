package com.proyectoporfolio.porfolio.repository;

import com.proyectoporfolio.porfolio.model.UsuarioModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsuarioRepository extends JpaRepository <UsuarioModel, Long>{
    
}
