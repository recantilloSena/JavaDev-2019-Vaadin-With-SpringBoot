/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.javadev.vaadinspring.ui;

import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.notification.Notification;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;

/**
 *
 * @author RICARDO
 */
@Route("step1")
@PageTitle("Hola Mundo SpringBoot - Vaadin")
public class MainView extends VerticalLayout{

    
    public MainView() {
        
        TextField nombre = new TextField("Escribe Tu nombre");
        Button button = new Button("Hola Mundo");
               
        add(nombre,button);
        
        button.addClickListener((t) -> {
            Notification.show("Tu nombre es: " +nombre.getValue() );
        });
        
        
    }
    
    
    
}
