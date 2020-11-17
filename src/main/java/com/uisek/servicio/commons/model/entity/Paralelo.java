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

import com.fasterxml.jackson.annotation.JsonBackReference;

/**
 *
 * @author Wilson
 */
@Entity
@Table(name = "paralelo", catalog = "uisek_inscripcion", schema = "")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Paralelo.findAll", query = "SELECT p FROM Paralelo p")
    , @NamedQuery(name = "Paralelo.findByIdparalelo", query = "SELECT p FROM Paralelo p WHERE p.idparalelo = :idparalelo")
    , @NamedQuery(name = "Paralelo.findByNombreParalelo", query = "SELECT p FROM Paralelo p WHERE p.nombreParalelo = :nombreParalelo")
    , @NamedQuery(name = "Paralelo.findByActivoParalelo", query = "SELECT p FROM Paralelo p WHERE p.activoParalelo = :activoParalelo")
    , @NamedQuery(name = "Paralelo.findByCupoParalelo", query = "SELECT p FROM Paralelo p WHERE p.cupoParalelo = :cupoParalelo")})
public class Paralelo implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idparalelo")
    private Integer idparalelo;
    @Column(name = "nombre_paralelo")
    private String nombreParalelo;
    @Column(name = "activo_paralelo")
    private Short activoParalelo;
    @Column(name = "cupo_paralelo")
    private Integer cupoParalelo;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "paraleloIdparalelo", fetch = FetchType.LAZY)
    @JsonBackReference
    private List<Materias> materiasList;

    public Paralelo() {
    }

    public Paralelo(Integer idparalelo) {
        this.idparalelo = idparalelo;
    }

    public Integer getIdparalelo() {
        return idparalelo;
    }

    public void setIdparalelo(Integer idparalelo) {
        this.idparalelo = idparalelo;
    }

    public String getNombreParalelo() {
        return nombreParalelo;
    }

    public void setNombreParalelo(String nombreParalelo) {
        this.nombreParalelo = nombreParalelo;
    }

    public Short getActivoParalelo() {
        return activoParalelo;
    }

    public void setActivoParalelo(Short activoParalelo) {
        this.activoParalelo = activoParalelo;
    }

    public Integer getCupoParalelo() {
        return cupoParalelo;
    }

    public void setCupoParalelo(Integer cupoParalelo) {
        this.cupoParalelo = cupoParalelo;
    }

    @XmlTransient
    public List<Materias> getMateriasList() {
        return materiasList;
    }

    public void setMateriasList(List<Materias> materiasList) {
        this.materiasList = materiasList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idparalelo != null ? idparalelo.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Paralelo)) {
            return false;
        }
        Paralelo other = (Paralelo) object;
        if ((this.idparalelo == null && other.idparalelo != null) || (this.idparalelo != null && !this.idparalelo.equals(other.idparalelo))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.uisek.inscripciones.ec.entities.Paralelo[ idparalelo=" + idparalelo + " ]";
    }
    
}
