package com.choucair.formacion.definition;

import com.choucair.formacion.steps.ProyectoMaxtimeSteps;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.Steps;

public class ProyectoMaxtimeDefinition {

@Steps

ProyectoMaxtimeSteps proyectoMaxtimeSteps;


    @Given("^ingreso a la pagina de maxtime$")
    public void ingreso_a_la_pagina_de_maxtime(){
        proyectoMaxtimeSteps.ingreso();
    }

    @When("^registro las horas$")
    public void registro_las_horas(){
        proyectoMaxtimeSteps.informacion();
    }

    @Then("^tomo evidencia de esto$")
    public void tomo_evidencia_de_esto(){
    }

}
