
package com.portfolio.MiPortfolio.controller;

import com.portfolio.MiPortfolio.model.AcercaDe;
import com.portfolio.MiPortfolio.service.IAcercaDeService;
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
    private IAcercaDeService acercaServ;
    
    @PostMapping ("/new/persona")
   public void agregarPersona (@RequestBody AcercaDe pers) {
       acercaServ.agregarPersona(pers);
   }
   
   @GetMapping ("/ver/personas")
   @ResponseBody
   public List<AcercaDe> verPersonas () {
       return acercaServ.verPersonas();
   }
   
   @DeleteMapping ("/delete/{id}")
   public void borrarPersona (@PathVariable Long id) {
       acercaServ.borrarPersona(id);
   }
   
   
   
}
