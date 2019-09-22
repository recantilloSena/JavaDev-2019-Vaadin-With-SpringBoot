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
import java.util.Collection;
import org.springframework.beans.factory.annotation.Autowired;
import org.vaadin.crudui.crud.CrudListener;
import org.vaadin.crudui.crud.impl.GridCrud;

/**
 *
 * @author RICARDO
 */
@Route("step3")
@PageTitle("CrudUI - Directory")
public class ViewThree extends VerticalLayout {

    private final GridCrud<Personas> gridcrud;

    @Autowired
    public ViewThree(PersonasRepository personaService) {
        this.gridcrud = new GridCrud<>(Personas.class);

        gridcrud.getCrudFormFactory().setUseBeanValidation(true);
        gridcrud.setCrudListener(new CrudListener<Personas>() {
            @Override
            public Collection<Personas> findAll() {
                return personaService.findAll();
            }

            @Override
            public Personas add(Personas personas) {
                return personaService.save(personas);
            }

            @Override
            public Personas update(Personas personas) {
                return personaService.save(personas);
            }

            @Override
            public void delete(Personas personas) {
                personaService.deleteById(personas.getIdPersonas());
            }
        });
        gridcrud.setHeight("30em");
        

        add(gridcrud);

    }

}
