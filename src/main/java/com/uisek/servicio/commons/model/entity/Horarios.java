/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.uisek.servicio.commons.model.entity;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author Wilson
 */
@Entity
@Table(name = "horarios", catalog = "uisek_inscripcion", schema = "")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Horarios.findAll", query = "SELECT h FROM Horarios h")
    , @NamedQuery(name = "Horarios.findByIdhorarios", query = "SELECT h FROM Horarios h WHERE h.idhorarios = :idhorarios")
    , @NamedQuery(name = "Horarios.findByInicioHorario", query = "SELECT h FROM Horarios h WHERE h.inicioHorario = :inicioHorario")
    , @NamedQuery(name = "Horarios.findByHorarioFin", query = "SELECT h FROM Horarios h WHERE h.horarioFin = :horarioFin")
    , @NamedQuery(name = "Horarios.findByActivoHorario", query = "SELECT h FROM Horarios h WHERE h.activoHorario = :activoHorario")})
public class Horarios implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idhorarios")
    private Integer idhorarios;
    @Column(name = "inicio_horario")
    @Temporal(TemporalType.TIME)
    private Date inicioHorario;
    @Column(name = "horario_fin")
    @Temporal(TemporalType.TIME)
    private Date horarioFin;
    @Column(name = "activo_horario")
    private Short activoHorario;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "horarios", fetch = FetchType.LAZY)
    private List<EspacioHasHorarios> espacioHasHorariosList;

    public Horarios() {
    }

    public Horarios(Integer idhorarios) {
        this.idhorarios = idhorarios;
    }

    public Integer getIdhorarios() {
        return idhorarios;
    }

    public void setIdhorarios(Integer idhorarios) {
        this.idhorarios = idhorarios;
    }

    public Date getInicioHorario() {
        return inicioHorario;
    }

    public void setInicioHorario(Date inicioHorario) {
        this.inicioHorario = inicioHorario;
    }

    public Date getHorarioFin() {
        return horarioFin;
    }

    public void setHorarioFin(Date horarioFin) {
        this.horarioFin = horarioFin;
    }

    public Short getActivoHorario() {
        return activoHorario;
    }

    public void setActivoHorario(Short activoHorario) {
        this.activoHorario = activoHorario;
    }

    @XmlTransient
    public List<EspacioHasHorarios> getEspacioHasHorariosList() {
        return espacioHasHorariosList;
    }

    public void setEspacioHasHorariosList(List<EspacioHasHorarios> espacioHasHorariosList) {
        this.espacioHasHorariosList = espacioHasHorariosList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idhorarios != null ? idhorarios.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Horarios)) {
            return false;
        }
        Horarios other = (Horarios) object;
        if ((this.idhorarios == null && other.idhorarios != null) || (this.idhorarios != null && !this.idhorarios.equals(other.idhorarios))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.uisek.inscripciones.ec.entities.Horarios[ idhorarios=" + idhorarios + " ]";
    }
    
}
