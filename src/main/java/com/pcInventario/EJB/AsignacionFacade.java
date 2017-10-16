/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pcInventario.EJB;

import com.pcInventario.Model.Asignacion;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author bfranco
 */
@Stateless
public class AsignacionFacade extends AbstractFacade<Asignacion> implements AsignacionFacadeLocal {

    @PersistenceContext(unitName = "com.pcInventario_PCInventario_war_1.0PU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public AsignacionFacade() {
        super(Asignacion.class);
    }
    
}