
package com.portfolio.MiPortfolio.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
public class AcercaDe {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    
    private String presentacion;
    private String nombre;
    private String puesto;
    private String info;
    private String img;
    
    public AcercaDe() {
    }

    public AcercaDe(Long id, String presentacion, String nombre, String puesto, String info, String img) {
        this.id = id;
        this.presentacion = presentacion;
        this.nombre = nombre;
        this.puesto = puesto;
        this.info = info;
        this.img = img;
    }

    
    
    
    
    
}
