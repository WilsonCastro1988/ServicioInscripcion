/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.uisek.servicio.commons.model.entity;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Wilson
 */
@Entity
@Table(name = "materias_has_estudiantes", catalog = "uisek_inscripcion", schema = "")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "MateriasHasEstudiantes.findAll", query = "SELECT m FROM MateriasHasEstudiantes m")
    , @NamedQuery(name = "MateriasHasEstudiantes.findByMateriasIdmaterias", query = "SELECT m FROM MateriasHasEstudiantes m WHERE m.materiasHasEstudiantesPK.materiasIdmaterias = :materiasIdmaterias")
    , @NamedQuery(name = "MateriasHasEstudiantes.findByEstudiantesIdestudiantes", query = "SELECT m FROM MateriasHasEstudiantes m WHERE m.materiasHasEstudiantesPK.estudiantesIdestudiantes = :estudiantesIdestudiantes")
    , @NamedQuery(name = "MateriasHasEstudiantes.findByActivoMateriasHasEstudiantes", query = "SELECT m FROM MateriasHasEstudiantes m WHERE m.activoMateriasHasEstudiantes = :activoMateriasHasEstudiantes")})
public class MateriasHasEstudiantes implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected MateriasHasEstudiantesPK materiasHasEstudiantesPK;
    @Column(name = "activo_materias_has_estudiantes")
    private Short activoMateriasHasEstudiantes;
    @JoinColumn(name = "estudiantes_idestudiantes", referencedColumnName = "idestudiantes", insertable = false, updatable = false)
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private Estudiantes estudiantes;
    @JoinColumn(name = "materias_idmaterias", referencedColumnName = "idmaterias", insertable = false, updatable = false)
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private Materias materias;

    public MateriasHasEstudiantes() {
    }

    public MateriasHasEstudiantes(MateriasHasEstudiantesPK materiasHasEstudiantesPK) {
        this.materiasHasEstudiantesPK = materiasHasEstudiantesPK;
    }

    public MateriasHasEstudiantes(int materiasIdmaterias, String estudiantesIdestudiantes) {
        this.materiasHasEstudiantesPK = new MateriasHasEstudiantesPK(materiasIdmaterias, estudiantesIdestudiantes);
    }

    public MateriasHasEstudiantesPK getMateriasHasEstudiantesPK() {
        return materiasHasEstudiantesPK;
    }

    public void setMateriasHasEstudiantesPK(MateriasHasEstudiantesPK materiasHasEstudiantesPK) {
        this.materiasHasEstudiantesPK = materiasHasEstudiantesPK;
    }

    public Short getActivoMateriasHasEstudiantes() {
        return activoMateriasHasEstudiantes;
    }

    public void setActivoMateriasHasEstudiantes(Short activoMateriasHasEstudiantes) {
        this.activoMateriasHasEstudiantes = activoMateriasHasEstudiantes;
    }

    public Estudiantes getEstudiantes() {
        return estudiantes;
    }

    public void setEstudiantes(Estudiantes estudiantes) {
        this.estudiantes = estudiantes;
    }

    public Materias getMaterias() {
        return materias;
    }

    public void setMaterias(Materias materias) {
        this.materias = materias;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (materiasHasEstudiantesPK != null ? materiasHasEstudiantesPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof MateriasHasEstudiantes)) {
            return false;
        }
        MateriasHasEstudiantes other = (MateriasHasEstudiantes) object;
        if ((this.materiasHasEstudiantesPK == null && other.materiasHasEstudiantesPK != null) || (this.materiasHasEstudiantesPK != null && !this.materiasHasEstudiantesPK.equals(other.materiasHasEstudiantesPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.uisek.inscripciones.ec.entities.MateriasHasEstudiantes[ materiasHasEstudiantesPK=" + materiasHasEstudiantesPK + " ]";
    }
    
}
