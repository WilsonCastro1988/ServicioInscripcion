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
public class MateriasHasEspacioHasHorariosPK implements Serializable {

    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Basic(optional = false)
    @Column(name = "materias_idmaterias")
    private int materiasIdmaterias;
    @Basic(optional = false)
    @Column(name = "espacio_has_horarios_espacio_idespacio")
    private int espacioHasHorariosEspacioIdespacio;
    @Basic(optional = false)
    @Column(name = "espacio_has_horarios_horarios_idhorarios")
    private int espacioHasHorariosHorariosIdhorarios;

    public MateriasHasEspacioHasHorariosPK() {
    }

    public MateriasHasEspacioHasHorariosPK(int materiasIdmaterias, int espacioHasHorariosEspacioIdespacio, int espacioHasHorariosHorariosIdhorarios) {
        this.materiasIdmaterias = materiasIdmaterias;
        this.espacioHasHorariosEspacioIdespacio = espacioHasHorariosEspacioIdespacio;
        this.espacioHasHorariosHorariosIdhorarios = espacioHasHorariosHorariosIdhorarios;
    }

    public int getMateriasIdmaterias() {
        return materiasIdmaterias;
    }

    public void setMateriasIdmaterias(int materiasIdmaterias) {
        this.materiasIdmaterias = materiasIdmaterias;
    }

    public int getEspacioHasHorariosEspacioIdespacio() {
        return espacioHasHorariosEspacioIdespacio;
    }

    public void setEspacioHasHorariosEspacioIdespacio(int espacioHasHorariosEspacioIdespacio) {
        this.espacioHasHorariosEspacioIdespacio = espacioHasHorariosEspacioIdespacio;
    }

    public int getEspacioHasHorariosHorariosIdhorarios() {
        return espacioHasHorariosHorariosIdhorarios;
    }

    public void setEspacioHasHorariosHorariosIdhorarios(int espacioHasHorariosHorariosIdhorarios) {
        this.espacioHasHorariosHorariosIdhorarios = espacioHasHorariosHorariosIdhorarios;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) materiasIdmaterias;
        hash += (int) espacioHasHorariosEspacioIdespacio;
        hash += (int) espacioHasHorariosHorariosIdhorarios;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof MateriasHasEspacioHasHorariosPK)) {
            return false;
        }
        MateriasHasEspacioHasHorariosPK other = (MateriasHasEspacioHasHorariosPK) object;
        if (this.materiasIdmaterias != other.materiasIdmaterias) {
            return false;
        }
        if (this.espacioHasHorariosEspacioIdespacio != other.espacioHasHorariosEspacioIdespacio) {
            return false;
        }
        if (this.espacioHasHorariosHorariosIdhorarios != other.espacioHasHorariosHorariosIdhorarios) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.uisek.inscripciones.ec.entities.MateriasHasEspacioHasHorariosPK[ materiasIdmaterias=" + materiasIdmaterias + ", espacioHasHorariosEspacioIdespacio=" + espacioHasHorariosEspacioIdespacio + ", espacioHasHorariosHorariosIdhorarios=" + espacioHasHorariosHorariosIdhorarios + " ]";
    }
    
}
