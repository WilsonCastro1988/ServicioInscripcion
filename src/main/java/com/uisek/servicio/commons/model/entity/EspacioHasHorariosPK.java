/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.uisek.servicio.commons.model.entity;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 *
 * @author Wilson
 */
@Embeddable
public class EspacioHasHorariosPK implements Serializable {

    @Basic(optional = false)
    @Column(name = "espacio_idespacio")
    private int espacioIdespacio;
    @Basic(optional = false)
    @Column(name = "horarios_idhorarios")
    private int horariosIdhorarios;

    public EspacioHasHorariosPK() {
    }

    public EspacioHasHorariosPK(int espacioIdespacio, int horariosIdhorarios) {
        this.espacioIdespacio = espacioIdespacio;
        this.horariosIdhorarios = horariosIdhorarios;
    }

    public int getEspacioIdespacio() {
        return espacioIdespacio;
    }

    public void setEspacioIdespacio(int espacioIdespacio) {
        this.espacioIdespacio = espacioIdespacio;
    }

    public int getHorariosIdhorarios() {
        return horariosIdhorarios;
    }

    public void setHorariosIdhorarios(int horariosIdhorarios) {
        this.horariosIdhorarios = horariosIdhorarios;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) espacioIdespacio;
        hash += (int) horariosIdhorarios;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof EspacioHasHorariosPK)) {
            return false;
        }
        EspacioHasHorariosPK other = (EspacioHasHorariosPK) object;
        if (this.espacioIdespacio != other.espacioIdespacio) {
            return false;
        }
        if (this.horariosIdhorarios != other.horariosIdhorarios) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.uisek.inscripciones.ec.entities.EspacioHasHorariosPK[ espacioIdespacio=" + espacioIdespacio + ", horariosIdhorarios=" + horariosIdhorarios + " ]";
    }
    
}
