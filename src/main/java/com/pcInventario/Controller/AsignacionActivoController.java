/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pcInventario.Controller;

import com.pcInventario.EJB.AsignacionFacadeLocal;
import com.pcInventario.EJB.ItemFacadeLocal;
import com.pcInventario.EJB.PersonaFacadeLocal;
import com.pcInventario.Model.Asignacion;
import com.pcInventario.Model.Item;
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
public class AsignacionActivoController implements Serializable {

    private Persona persona;
    private Asignacion asignacion;
    private Item item;

    @EJB
    private AsignacionFacadeLocal asignacionEJB;
    @EJB
    private PersonaFacadeLocal personaEJB;
    @EJB
    private ItemFacadeLocal itemEJB;

    List<Persona> lstPersona;
    List<Asignacion> lstAsignacion;
    List<Item> lstItem;

    @PostConstruct
    public void init() {
        persona = new Persona();
        asignacion = new Asignacion();
        item = new Item();
        lstPersona = personaEJB.findAll();
        lstItem = itemEJB.findAll();
        lstAsignacion = asignacionEJB.findAll();

    }

    public void registrarAsignacion() {
        try {
            asignacionEJB.create(asignacion);
        } catch (Exception e) {
        }
    }

    public Persona getPersona() {
        return persona;
    }

    public void setPersona(Persona persona) {
        this.persona = persona;
    }

    public Asignacion getAsignacion() {
        return asignacion;
    }

    public void setAsignacion(Asignacion asignacion) {
        this.asignacion = asignacion;
    }

    public Item getItem() {
        return item;
    }

    public void setItem(Item item) {
        this.item = item;
    }

    public List<Persona> getLstPersona() {
        return lstPersona;
    }

    public void setLstPersona(List<Persona> lstPersona) {
        this.lstPersona = lstPersona;
    }

    public List<Asignacion> getLstAsignacion() {
        return lstAsignacion;
    }

    public void setLstAsignacion(List<Asignacion> lstAsignacion) {
        this.lstAsignacion = lstAsignacion;
    }

    public List<Item> getLstItem() {
        return lstItem;
    }

    public void setLstItem(List<Item> lstItem) {
        this.lstItem = lstItem;
    }
    
    
    

}
