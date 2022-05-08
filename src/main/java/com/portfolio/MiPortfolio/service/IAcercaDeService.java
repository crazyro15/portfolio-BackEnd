package com.portfolio.MiPortfolio.service;

import com.portfolio.MiPortfolio.model.AcercaDe;
import java.util.List;

public interface IAcercaDeService {
    
    public List<AcercaDe> verPersonas ();
    public void agregarPersona (AcercaDe pers);
    public void borrarPersona (Long id);
    public AcercaDe buscarPersona (Long id);
    
    
}
