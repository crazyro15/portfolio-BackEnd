package com.portfolio.MiPortfolio.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
public class Experiencia {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String puesto;
    private String empresa;
    private String img;
    private String modo;
    private String comienzo;
    private String fin;
    
    public Experiencia(){
    }

    public Experiencia(Long id, String puesto, String empresa, String img, String modo, String comienzo, String fin) {
        this.id = id;
        this.puesto = puesto;
        this.empresa = empresa;
        this.img = img;
        this.modo = modo;
        this.comienzo = comienzo;
        this.fin = fin;
    }
    
    
    
}
