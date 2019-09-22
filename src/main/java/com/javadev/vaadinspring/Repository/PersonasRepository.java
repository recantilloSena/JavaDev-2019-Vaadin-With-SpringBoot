/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.javadev.vaadinspring.Repository;

import com.javadev.vaadinspring.modelo.Personas;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author RICARDO
 */
public interface PersonasRepository extends JpaRepository<Personas, Integer>{
    
}
