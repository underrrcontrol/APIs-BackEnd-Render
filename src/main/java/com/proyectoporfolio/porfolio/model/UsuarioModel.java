package com.proyectoporfolio.porfolio.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity

@Table(name="usuario")
public class UsuarioModel {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(unique = true, nullable = false)
    private Long id;
    private String email;
    private String nombre;
    
    public UsuarioModel(){
        
    }
    
    public UsuarioModel(Long id, String email, String nombre){
        this.id=id;
        this.email=email;
        this.nombre=nombre;
    }
    
}
