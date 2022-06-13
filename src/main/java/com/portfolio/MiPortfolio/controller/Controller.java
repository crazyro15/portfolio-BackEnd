
package com.portfolio.MiPortfolio.controller;

import com.portfolio.MiPortfolio.model.AcercaDe;
import com.portfolio.MiPortfolio.model.Educacion;
import com.portfolio.MiPortfolio.model.Experiencia;
import com.portfolio.MiPortfolio.service.IAcercaDeService;
import com.portfolio.MiPortfolio.service.IEducacionService;
import com.portfolio.MiPortfolio.service.IExperienciaService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
    
    @Autowired
    private IAcercaDeService acercaServ;
    @Autowired
    private IEducacionService eduServ;
    @Autowired
    private IExperienciaService expServ;
    
//Métodos Acerca De
    
    @PostMapping ("/persona/new")
   public void agregarPersona (@RequestBody AcercaDe pers) {
       acercaServ.agregarPersona(pers);
   }
   
   @GetMapping ("/persona/ver")
   @ResponseBody
   public List<AcercaDe> verPersonas () {
       return acercaServ.verPersonas();
   }
   
   @DeleteMapping ("/persona/delete/{id}")
   public void borrarPersona (@PathVariable Long id) {
       acercaServ.borrarPersona(id);
   }
   
   @PutMapping("/persona/update")
    public void actualizarPersona (@RequestBody AcercaDe pers ){
        acercaServ.actualizarPersona(pers);
    }
    
    //Métodos Educacion
    
    @PostMapping ("/educacion/new")
    public void crearEducacion (@RequestBody Educacion educ) {
        eduServ.crearEducacion(educ);
    }
    
    @GetMapping ("/educacion/ver")
    @ResponseBody
    public List<Educacion> verEducacion() {
        return eduServ.verEducacion();
    }
    
    @DeleteMapping ("/educacion/delete/{id}")
    public void borrarEducacion (@PathVariable Long id) {
        eduServ.borrarEducacion(id);
    }
    
    @PutMapping("/educacion/update")
    public void actualizarEducacion(@RequestBody Educacion educ) {
        eduServ.actualizarEducacion(educ);
    }
    
    //Metodos experiencia
    
    @PostMapping ("/experiencia/new")
    public void crearExperiencia (@RequestBody Experiencia exp) {
        expServ.crearExperiencia(exp);
    }
    
    @GetMapping ("/experiencia/ver")
    @ResponseBody
    public List<Experiencia> verExperiencia() {
        return expServ.verExperiencia();
    }
    
    @DeleteMapping ("/experiencia/delete/{id}")
    public void borrarExperiencia (@PathVariable Long id) {
        expServ.borrarExperiencia(id);
    }
    
    @PutMapping("/experiencia/update")
    public void actualizarExperiencia (@RequestBody Experiencia exp) {
        expServ.actualizarExperiencia(exp);
    }
    
}
