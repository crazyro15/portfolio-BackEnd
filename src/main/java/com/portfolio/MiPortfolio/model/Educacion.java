package com.portfolio.MiPortfolio.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
public class Educacion {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String lugar;
    private String titulo;
    private String img;
    private String comienzo;
    private String fin;
    
    public Educacion(){
    }
    
    public Educacion(Long id, String lugar, String titulo, String img, String comienzo, String fin) {
        this.id = id;
        this.lugar = lugar;
        this.titulo = titulo;
        this.img = img;
        this.comienzo = comienzo;
        this.fin = fin;
    }
    
}


