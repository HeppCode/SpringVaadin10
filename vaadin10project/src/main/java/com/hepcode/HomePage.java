package com.hepcode;

import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.component.html.Label;
import com.vaadin.flow.router.Route;
import com.vaadin.flow.theme.Theme;
import com.vaadin.flow.theme.lumo.Lumo;

/**
 * Created by bernard-w on 25/3/18.
 *
 * localhost:8080/home
 * */
@Route("home")
@Theme(Lumo.class)
public class HomePage extends Div {

    public HomePage(){
        add(new Label("Homepage"));
    }
}
