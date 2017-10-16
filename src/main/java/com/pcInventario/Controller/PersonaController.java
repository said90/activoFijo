/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pcInventario.Controller;

import com.pcInventario.EJB.CargoFacadeLocal;
import com.pcInventario.EJB.EstablecimientoFacadeLocal;
import com.pcInventario.EJB.PersonaFacadeLocal;
import com.pcInventario.Model.Cargo;
import com.pcInventario.Model.Establecimiento;
import com.pcInventario.Model.Persona;
import java.io.Serializable;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.faces.view.ViewScoped;
import javax.inject.Named;

/**
 *
 * @author bfranco
 */

@Named
@ViewScoped
public class PersonaController implements Serializable {
    
    @EJB
    private PersonaFacadeLocal personaEJB;
    @EJB
    private CargoFacadeLocal cargoEJB;
    @EJB
    private EstablecimientoFacadeLocal establecimientoEJB;
    
    private Persona persona;
    private Cargo cargo;
    private Establecimiento establecimiento;
    
    private List<Persona> lstPersona;
    private List<Cargo> lstCargos;
    private List<Establecimiento> lstEstablecimiento;
    
    
    @PostConstruct
    public void init(){
    persona = new Persona();
    cargo = new Cargo();
    establecimiento= new Establecimiento();
    lstPersona= personaEJB.findAll();
    lstCargos= cargoEJB.findAll();
    lstEstablecimiento= establecimientoEJB.findAll();
    }
    
    public void registrarPersona(){
        try {
            personaEJB.create(persona);
        } catch (Exception e) {
        }
    }

    public Persona getPersona() {
        return persona;
    }

    public void setPersona(Persona persona) {
        this.persona = persona;
    }

    public Cargo getCargo() {
        return cargo;
    }

    public void setCargo(Cargo cargo) {
        this.cargo = cargo;
    }

    public Establecimiento getEstablecimiento() {
        return establecimiento;
    }

    public void setEstablecimiento(Establecimiento establecimiento) {
        this.establecimiento = establecimiento;
    }

    public List<Persona> getLstPersona() {
        return lstPersona;
    }

    public void setLstPersona(List<Persona> lstPersona) {
        this.lstPersona = lstPersona;
    }

    public List<Cargo> getLstCargos() {
        return lstCargos;
    }

    public void setLstCargos(List<Cargo> lstCargos) {
        this.lstCargos = lstCargos;
    }

    public List<Establecimiento> getLstEstablecimiento() {
        return lstEstablecimiento;
    }

    public void setLstEstablecimiento(List<Establecimiento> lstEstablecimiento) {
        this.lstEstablecimiento = lstEstablecimiento;
    }
    
    
}
