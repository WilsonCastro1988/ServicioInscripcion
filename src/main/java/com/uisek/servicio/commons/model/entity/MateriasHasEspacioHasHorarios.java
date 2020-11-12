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
import javax.persistence.JoinColumns;
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
@Table(name = "materias_has_espacio_has_horarios", catalog = "uisek_inscripcion", schema = "")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "MateriasHasEspacioHasHorarios.findAll", query = "SELECT m FROM MateriasHasEspacioHasHorarios m")
    , @NamedQuery(name = "MateriasHasEspacioHasHorarios.findByMateriasIdmaterias", query = "SELECT m FROM MateriasHasEspacioHasHorarios m WHERE m.materiasHasEspacioHasHorariosPK.materiasIdmaterias = :materiasIdmaterias")
    , @NamedQuery(name = "MateriasHasEspacioHasHorarios.findByEspacioHasHorariosEspacioIdespacio", query = "SELECT m FROM MateriasHasEspacioHasHorarios m WHERE m.materiasHasEspacioHasHorariosPK.espacioHasHorariosEspacioIdespacio = :espacioHasHorariosEspacioIdespacio")
    , @NamedQuery(name = "MateriasHasEspacioHasHorarios.findByEspacioHasHorariosHorariosIdhorarios", query = "SELECT m FROM MateriasHasEspacioHasHorarios m WHERE m.materiasHasEspacioHasHorariosPK.espacioHasHorariosHorariosIdhorarios = :espacioHasHorariosHorariosIdhorarios")
    , @NamedQuery(name = "MateriasHasEspacioHasHorarios.findByActivoMateriasHasEspacioHasHorarios", query = "SELECT m FROM MateriasHasEspacioHasHorarios m WHERE m.activoMateriasHasEspacioHasHorarios = :activoMateriasHasEspacioHasHorarios")})
public class MateriasHasEspacioHasHorarios implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected MateriasHasEspacioHasHorariosPK materiasHasEspacioHasHorariosPK;
    @Column(name = "activo_materias_has_espacio_has_horarios")
    private Short activoMateriasHasEspacioHasHorarios;
    @JoinColumns({
        @JoinColumn(name = "espacio_has_horarios_espacio_idespacio", referencedColumnName = "espacio_idespacio", insertable = false, updatable = false)
        , @JoinColumn(name = "espacio_has_horarios_horarios_idhorarios", referencedColumnName = "horarios_idhorarios", insertable = false, updatable = false)})
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private EspacioHasHorarios espacioHasHorarios;
    @JoinColumn(name = "materias_idmaterias", referencedColumnName = "idmaterias", insertable = false, updatable = false)
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private Materias materias;

    public MateriasHasEspacioHasHorarios() {
    }

    public MateriasHasEspacioHasHorarios(MateriasHasEspacioHasHorariosPK materiasHasEspacioHasHorariosPK) {
        this.materiasHasEspacioHasHorariosPK = materiasHasEspacioHasHorariosPK;
    }

    public MateriasHasEspacioHasHorarios(int materiasIdmaterias, int espacioHasHorariosEspacioIdespacio, int espacioHasHorariosHorariosIdhorarios) {
        this.materiasHasEspacioHasHorariosPK = new MateriasHasEspacioHasHorariosPK(materiasIdmaterias, espacioHasHorariosEspacioIdespacio, espacioHasHorariosHorariosIdhorarios);
    }

    public MateriasHasEspacioHasHorariosPK getMateriasHasEspacioHasHorariosPK() {
        return materiasHasEspacioHasHorariosPK;
    }

    public void setMateriasHasEspacioHasHorariosPK(MateriasHasEspacioHasHorariosPK materiasHasEspacioHasHorariosPK) {
        this.materiasHasEspacioHasHorariosPK = materiasHasEspacioHasHorariosPK;
    }

    public Short getActivoMateriasHasEspacioHasHorarios() {
        return activoMateriasHasEspacioHasHorarios;
    }

    public void setActivoMateriasHasEspacioHasHorarios(Short activoMateriasHasEspacioHasHorarios) {
        this.activoMateriasHasEspacioHasHorarios = activoMateriasHasEspacioHasHorarios;
    }

    public EspacioHasHorarios getEspacioHasHorarios() {
        return espacioHasHorarios;
    }

    public void setEspacioHasHorarios(EspacioHasHorarios espacioHasHorarios) {
        this.espacioHasHorarios = espacioHasHorarios;
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
        hash += (materiasHasEspacioHasHorariosPK != null ? materiasHasEspacioHasHorariosPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof MateriasHasEspacioHasHorarios)) {
            return false;
        }
        MateriasHasEspacioHasHorarios other = (MateriasHasEspacioHasHorarios) object;
        if ((this.materiasHasEspacioHasHorariosPK == null && other.materiasHasEspacioHasHorariosPK != null) || (this.materiasHasEspacioHasHorariosPK != null && !this.materiasHasEspacioHasHorariosPK.equals(other.materiasHasEspacioHasHorariosPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.uisek.inscripciones.ec.entities.MateriasHasEspacioHasHorarios[ materiasHasEspacioHasHorariosPK=" + materiasHasEspacioHasHorariosPK + " ]";
    }
    
}
