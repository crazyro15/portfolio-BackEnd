
package com.portfolio.MiPortfolio.repository;

import com.portfolio.MiPortfolio.model.AcercaDe;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AcercaDeRepository extends JpaRepository <AcercaDe, Long> {
    
}
