/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pcInventario.Model;

import com.pcInventario.Model.Asignacion;
import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 *
 * @author bfranco
 */
@Entity
@Table(name = "computadora")

public class Computadora implements Serializable {

    @Id
    @Basic(optional = false)
    @Column(name = "idComputadora")
    private Integer idComputadora;
    @Size(max = 45)
    @Column(name = "ip")
    private String ip;
    @Size(max = 45)
    @Column(name = "mac")
    private String mac;
    @Size(max = 45)
    @Column(name = "hostname")
    private String hostname;
    @Size(max = 45)
    @Column(name = "windows")
    private String windows;
    @Size(max = 45)
    @Column(name = "windowslic")
    private String windowslic;
    @Size(max = 45)
    @Column(name = "office")
    private String office;
    @Size(max = 45)
    @Column(name = "officelic")
    private String officelic;
    @JoinColumn(name = "idAsignacion", referencedColumnName = "idAsignacion")
    @ManyToOne(optional = false)
    private Asignacion idAsignacion;

    public Integer getIdComputadora() {
        return idComputadora;
    }

    public void setIdComputadora(Integer idComputadora) {
        this.idComputadora = idComputadora;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public String getMac() {
        return mac;
    }

    public void setMac(String mac) {
        this.mac = mac;
    }

    public String getHostname() {
        return hostname;
    }

    public void setHostname(String hostname) {
        this.hostname = hostname;
    }

    public String getWindows() {
        return windows;
    }

    public void setWindows(String windows) {
        this.windows = windows;
    }

    public String getWindowslic() {
        return windowslic;
    }

    public void setWindowslic(String windowslic) {
        this.windowslic = windowslic;
    }

    public String getOffice() {
        return office;
    }

    public void setOffice(String office) {
        this.office = office;
    }

    public String getOfficelic() {
        return officelic;
    }

    public void setOfficelic(String officelic) {
        this.officelic = officelic;
    }

    public Asignacion getIdAsignacion() {
        return idAsignacion;
    }

    public void setIdAsignacion(Asignacion idAsignacion) {
        this.idAsignacion = idAsignacion;
    }


}
