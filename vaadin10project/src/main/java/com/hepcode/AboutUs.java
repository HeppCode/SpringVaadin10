package com.hepcode;

import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.component.html.Label;
import com.vaadin.flow.router.Route;
import com.vaadin.flow.theme.Theme;
import com.vaadin.flow.theme.lumo.Lumo;

/**
 * Created by bernard-w on 25/3/18.
 */
@Route("about")
@Theme(Lumo.class)
public class AboutUs extends Div{

    public AboutUs(){
        add(new Label("About us"));
    }
}
