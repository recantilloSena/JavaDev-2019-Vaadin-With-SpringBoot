/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.javadev.vaadinspring.ui;

import com.javadev.vaadinspring.Repository.PersonasRepository;
import com.javadev.vaadinspring.modelo.Personas;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.grid.Grid;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;
import org.springframework.beans.factory.annotation.Autowired;

/**
 *
 * @author RICARDO
 */
@Route("step2")
@PageTitle("SpringBoot BackEnd")
public class ViewTwo extends VerticalLayout{

    
    private final Grid<Personas> grid;
    
    @Autowired
    public ViewTwo(PersonasRepository personaService) {
        this.grid = new Grid<>(Personas.class);
        
        
        Button boton = new Button("Cargar desde SpringBoot");
               
        add(boton,grid);
        
        boton.addClickListener((t) -> {
            grid.setItems(personaService.findAll());
        });
        
        
    }
    
    
    
}
