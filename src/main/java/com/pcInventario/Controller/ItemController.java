/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pcInventario.Controller;

import com.pcInventario.EJB.ItemFacadeLocal;
import com.pcInventario.Model.Item;
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
public class ItemController implements Serializable {

    private Item item;
    @EJB
    private ItemFacadeLocal itemEJB;
    private List<Item> lstItem;

    @PostConstruct
    public void init() {
        item = new Item();
        lstItem = itemEJB.findAll();
    }

    public void registrarItem() {
        try {
            itemEJB.create(item);
        } catch (Exception e) {
        }
    }

    public Item getItem() {
        return item;
    }

    public void setItem(Item item) {
        this.item = item;
    }

    public List<Item> getLstItem() {
        return lstItem;
    }

    public void setLstItem(List<Item> lstItem) {
        this.lstItem = lstItem;
    }

}
