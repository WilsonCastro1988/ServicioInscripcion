/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.uisek.servicio.commons.model.entity;

import java.io.Serializable;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 *
 * @author Wilson
 */
@Entity
@Table(name = "espacio_has_horarios", catalog = "uisek_inscripcion", schema = "")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "EspacioHasHorarios.findAll", query = "SELECT e FROM EspacioHasHorarios e")
    , @NamedQuery(name = "EspacioHasHorarios.findByEspacioIdespacio", query = "SELECT e FROM EspacioHasHorarios e WHERE e.espacioHasHorariosPK.espacioIdespacio = :espacioIdespacio")
    , @NamedQuery(name = "EspacioHasHorarios.findByHorariosIdhorarios", query = "SELECT e FROM EspacioHasHorarios e WHERE e.espacioHasHorariosPK.horariosIdhorarios = :horariosIdhorarios")
    , @NamedQuery(name = "EspacioHasHorarios.findByActivoEspacioHasHorarios", query = "SELECT e FROM EspacioHasHorarios e WHERE e.activoEspacioHasHorarios = :activoEspacioHasHorarios")})
public class EspacioHasHorarios implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected EspacioHasHorariosPK espacioHasHorariosPK;
    @Column(name = "activo_espacio_has_horarios")
    private Short activoEspacioHasHorarios;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "espacioHasHorarios", fetch = FetchType.LAZY)
    private List<MateriasHasEspacioHasHorarios> materiasHasEspacioHasHorariosList;
    @JoinColumn(name = "espacio_idespacio", referencedColumnName = "idespacio", insertable = false, updatable = false)
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    @JsonIgnore
    private Espacio espacio;
    @JoinColumn(name = "horarios_idhorarios", referencedColumnName = "idhorarios", insertable = false, updatable = false)
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    @JsonIgnore
    private Horarios horarios;

    public EspacioHasHorarios() {
    }

    public EspacioHasHorarios(EspacioHasHorariosPK espacioHasHorariosPK) {
        this.espacioHasHorariosPK = espacioHasHorariosPK;
    }

    public EspacioHasHorarios(int espacioIdespacio, int horariosIdhorarios) {
        this.espacioHasHorariosPK = new EspacioHasHorariosPK(espacioIdespacio, horariosIdhorarios);
    }

    public EspacioHasHorariosPK getEspacioHasHorariosPK() {
        return espacioHasHorariosPK;
    }

    public void setEspacioHasHorariosPK(EspacioHasHorariosPK espacioHasHorariosPK) {
        this.espacioHasHorariosPK = espacioHasHorariosPK;
    }

    public Short getActivoEspacioHasHorarios() {
        return activoEspacioHasHorarios;
    }

    public void setActivoEspacioHasHorarios(Short activoEspacioHasHorarios) {
        this.activoEspacioHasHorarios = activoEspacioHasHorarios;
    }

    @XmlTransient
    public List<MateriasHasEspacioHasHorarios> getMateriasHasEspacioHasHorariosList() {
        return materiasHasEspacioHasHorariosList;
    }

    public void setMateriasHasEspacioHasHorariosList(List<MateriasHasEspacioHasHorarios> materiasHasEspacioHasHorariosList) {
        this.materiasHasEspacioHasHorariosList = materiasHasEspacioHasHorariosList;
    }

    public Espacio getEspacio() {
        return espacio;
    }

    public void setEspacio(Espacio espacio) {
        this.espacio = espacio;
    }

    public Horarios getHorarios() {
        return horarios;
    }

    public void setHorarios(Horarios horarios) {
        this.horarios = horarios;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (espacioHasHorariosPK != null ? espacioHasHorariosPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof EspacioHasHorarios)) {
            return false;
        }
        EspacioHasHorarios other = (EspacioHasHorarios) object;
        if ((this.espacioHasHorariosPK == null && other.espacioHasHorariosPK != null) || (this.espacioHasHorariosPK != null && !this.espacioHasHorariosPK.equals(other.espacioHasHorariosPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.uisek.inscripciones.ec.entities.EspacioHasHorarios[ espacioHasHorariosPK=" + espacioHasHorariosPK + " ]";
    }
    
}
