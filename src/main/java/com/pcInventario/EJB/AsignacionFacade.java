/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pcInventario.EJB;

import com.pcInventario.Model.Asignacion;
import com.pcInventario.Model.Persona;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

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

    @Override
    public List<Asignacion> activosSinAsignar() {

        List<Asignacion> lista;
        Query q = em.createNativeQuery("Select * from Asignacion where estado=0",Asignacion.class);
        lista = q.getResultList();    
        return lista;

    }

    @Override
    public List<Asignacion> activosPorUsuario(Persona persona) {
        List<Asignacion> lista;
        Query q = em.createNativeQuery("Select * from Asignacion where idPersona=?1");
        q.setParameter(1, persona.getIdPersona());
        lista = q.getResultList();    
        return lista;
    }

}
