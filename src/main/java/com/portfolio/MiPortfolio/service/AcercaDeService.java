
package com.portfolio.MiPortfolio.service;

import com.portfolio.MiPortfolio.model.AcercaDe;
import com.portfolio.MiPortfolio.repository.AcercaDeRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AcercaDeService implements IAcercaDeService {
    
    @Autowired
    public AcercaDeRepository acercaRepo;

    @Override
    public List<AcercaDe> verPersonas() {
        return acercaRepo.findAll();
    }

    @Override
    public void agregarPersona(AcercaDe pers) {
        acercaRepo.save(pers);
    }

    @Override
    public void borrarPersona(Long id) {
        acercaRepo.deleteById(id);
    }

    @Override
    public AcercaDe buscarPersona(Long id) {
        return acercaRepo.findById(id).orElse(null);
    }
    
}
