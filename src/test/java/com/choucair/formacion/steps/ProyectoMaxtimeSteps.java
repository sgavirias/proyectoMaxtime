package com.choucair.formacion.steps;

import com.choucair.formacion.pageobjects.ProyectoMaxtimePage;

public class ProyectoMaxtimeSteps {

    ProyectoMaxtimePage proyectoMaxtimePage;

    public void ingreso() {
        proyectoMaxtimePage.open();
        proyectoMaxtimePage.login();
    }

    public void informacion() {

        proyectoMaxtimePage.informacion();

    }
}
