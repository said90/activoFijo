/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pcInventario.Controller;

import com.pcInventario.EJB.CargoFacadeLocal;
import com.pcInventario.Model.Cargo;
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
public class CargoController implements Serializable {

    @EJB
    private CargoFacadeLocal cargoEJB;
    private Cargo cargo;

    private List<Cargo> lstCargo;

    @PostConstruct

    public void init() {
        cargo = new Cargo();
        lstCargo = cargoEJB.findAll();
    }

    public void resgistrarCargo() {
        try {
            cargoEJB.create(cargo);
        } catch (Exception e) {
        }

    }

    public Cargo getCargo() {
        return cargo;
    }

    public void setCargo(Cargo cargo) {
        this.cargo = cargo;
    }

    public List<Cargo> getLstCargo() {
        return lstCargo;
    }

    public void setLstCargo(List<Cargo> lstCargo) {
        this.lstCargo = lstCargo;
    }
    
    

}
