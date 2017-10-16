/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pcInventario.Controller;

import com.pcInventario.EJB.EstablecimientoFacadeLocal;
import com.pcInventario.Model.Establecimiento;
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
public class EstablecimientoController implements Serializable{
    
    @EJB
    private EstablecimientoFacadeLocal establecimientoEJB;
    private Establecimiento establecimiento;
    private List<Establecimiento> lstEstablecimientos;
    
    @PostConstruct
    public void init(){
    establecimiento= new Establecimiento();
    lstEstablecimientos= establecimientoEJB.findAll();
    }
    
    public void registrarEstablecimiento(){
        try {
            establecimientoEJB.create(establecimiento);
        } catch (Exception e) {
        }
    }

    public Establecimiento getEstablecimiento() {
        return establecimiento;
    }

    public void setEstablecimiento(Establecimiento establecimiento) {
        this.establecimiento = establecimiento;
    }

    public List<Establecimiento> getLstEstablecimientos() {
        return lstEstablecimientos;
    }

    public void setLstEstablecimientos(List<Establecimiento> lstEstablecimientos) {
        this.lstEstablecimientos = lstEstablecimientos;
    }
    
    
}
