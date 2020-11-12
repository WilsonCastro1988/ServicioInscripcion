/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.uisek.servicio.commons.model.entity;

import java.io.Serializable;
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
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author Wilson
 */
@Entity
@Table(name = "estado_matricula", catalog = "uisek_inscripcion", schema = "")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "EstadoMatricula.findAll", query = "SELECT e FROM EstadoMatricula e")
    , @NamedQuery(name = "EstadoMatricula.findByIdestadoMatricula", query = "SELECT e FROM EstadoMatricula e WHERE e.idestadoMatricula = :idestadoMatricula")
    , @NamedQuery(name = "EstadoMatricula.findByNombreEstadoMatricula", query = "SELECT e FROM EstadoMatricula e WHERE e.nombreEstadoMatricula = :nombreEstadoMatricula")
    , @NamedQuery(name = "EstadoMatricula.findByActivoEstadoMatricula", query = "SELECT e FROM EstadoMatricula e WHERE e.activoEstadoMatricula = :activoEstadoMatricula")})
public class EstadoMatricula implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idestado_matricula")
    private Integer idestadoMatricula;
    @Column(name = "nombre_estado_matricula")
    private String nombreEstadoMatricula;
    @Column(name = "activo_estado_matricula")
    private Short activoEstadoMatricula;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "estadoMatriculaIdestadoMatricula", fetch = FetchType.LAZY)
    private List<Matricula> matriculaList;

    public EstadoMatricula() {
    }

    public EstadoMatricula(Integer idestadoMatricula) {
        this.idestadoMatricula = idestadoMatricula;
    }

    public Integer getIdestadoMatricula() {
        return idestadoMatricula;
    }

    public void setIdestadoMatricula(Integer idestadoMatricula) {
        this.idestadoMatricula = idestadoMatricula;
    }

    public String getNombreEstadoMatricula() {
        return nombreEstadoMatricula;
    }

    public void setNombreEstadoMatricula(String nombreEstadoMatricula) {
        this.nombreEstadoMatricula = nombreEstadoMatricula;
    }

    public Short getActivoEstadoMatricula() {
        return activoEstadoMatricula;
    }

    public void setActivoEstadoMatricula(Short activoEstadoMatricula) {
        this.activoEstadoMatricula = activoEstadoMatricula;
    }

    @XmlTransient
    public List<Matricula> getMatriculaList() {
        return matriculaList;
    }

    public void setMatriculaList(List<Matricula> matriculaList) {
        this.matriculaList = matriculaList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idestadoMatricula != null ? idestadoMatricula.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof EstadoMatricula)) {
            return false;
        }
        EstadoMatricula other = (EstadoMatricula) object;
        if ((this.idestadoMatricula == null && other.idestadoMatricula != null) || (this.idestadoMatricula != null && !this.idestadoMatricula.equals(other.idestadoMatricula))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.uisek.inscripciones.ec.entities.EstadoMatricula[ idestadoMatricula=" + idestadoMatricula + " ]";
    }
    
}
