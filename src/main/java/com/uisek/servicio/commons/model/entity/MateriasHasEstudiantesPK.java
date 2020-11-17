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
public class MateriasHasEstudiantesPK implements Serializable {

    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Basic(optional = false)
    @Column(name = "materias_idmaterias")
    private int materiasIdmaterias;
    @Basic(optional = false)
    @Column(name = "estudiantes_idestudiantes")
    private String estudiantesIdestudiantes;

    public MateriasHasEstudiantesPK() {
    }

    public MateriasHasEstudiantesPK(int materiasIdmaterias, String estudiantesIdestudiantes) {
        this.materiasIdmaterias = materiasIdmaterias;
        this.estudiantesIdestudiantes = estudiantesIdestudiantes;
    }

    public int getMateriasIdmaterias() {
        return materiasIdmaterias;
    }

    public void setMateriasIdmaterias(int materiasIdmaterias) {
        this.materiasIdmaterias = materiasIdmaterias;
    }

    public String getEstudiantesIdestudiantes() {
        return estudiantesIdestudiantes;
    }

    public void setEstudiantesIdestudiantes(String estudiantesIdestudiantes) {
        this.estudiantesIdestudiantes = estudiantesIdestudiantes;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) materiasIdmaterias;
        hash += (estudiantesIdestudiantes != null ? estudiantesIdestudiantes.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof MateriasHasEstudiantesPK)) {
            return false;
        }
        MateriasHasEstudiantesPK other = (MateriasHasEstudiantesPK) object;
        if (this.materiasIdmaterias != other.materiasIdmaterias) {
            return false;
        }
        if ((this.estudiantesIdestudiantes == null && other.estudiantesIdestudiantes != null) || (this.estudiantesIdestudiantes != null && !this.estudiantesIdestudiantes.equals(other.estudiantesIdestudiantes))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.uisek.inscripciones.ec.entities.MateriasHasEstudiantesPK[ materiasIdmaterias=" + materiasIdmaterias + ", estudiantesIdestudiantes=" + estudiantesIdestudiantes + " ]";
    }
    
}
