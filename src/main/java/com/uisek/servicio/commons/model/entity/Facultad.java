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
@Table(name = "facultad", catalog = "uisek_inscripcion", schema = "")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Facultad.findAll", query = "SELECT f FROM Facultad f")
    , @NamedQuery(name = "Facultad.findByIdfacultad", query = "SELECT f FROM Facultad f WHERE f.idfacultad = :idfacultad")
    , @NamedQuery(name = "Facultad.findByNombeFacultad", query = "SELECT f FROM Facultad f WHERE f.nombeFacultad = :nombeFacultad")
    , @NamedQuery(name = "Facultad.findByDescripcionFacultad", query = "SELECT f FROM Facultad f WHERE f.descripcionFacultad = :descripcionFacultad")
    , @NamedQuery(name = "Facultad.findByActivoFacultad", query = "SELECT f FROM Facultad f WHERE f.activoFacultad = :activoFacultad")})
public class Facultad implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idfacultad")
    private Integer idfacultad;
    @Column(name = "nombe_facultad")
    private String nombeFacultad;
    @Column(name = "descripcion_facultad")
    private String descripcionFacultad;
    @Column(name = "activo_facultad")
    private String activoFacultad;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "facultadIdfacultad")
    private List<Carrera> carreraList;

    public Facultad() {
    }

    public Facultad(Integer idfacultad) {
        this.idfacultad = idfacultad;
    }

    public Integer getIdfacultad() {
        return idfacultad;
    }

    public void setIdfacultad(Integer idfacultad) {
        this.idfacultad = idfacultad;
    }

    public String getNombeFacultad() {
        return nombeFacultad;
    }

    public void setNombeFacultad(String nombeFacultad) {
        this.nombeFacultad = nombeFacultad;
    }

    public String getDescripcionFacultad() {
        return descripcionFacultad;
    }

    public void setDescripcionFacultad(String descripcionFacultad) {
        this.descripcionFacultad = descripcionFacultad;
    }

    public String getActivoFacultad() {
        return activoFacultad;
    }

    public void setActivoFacultad(String activoFacultad) {
        this.activoFacultad = activoFacultad;
    }

    @XmlTransient
    public List<Carrera> getCarreraList() {
        return carreraList;
    }

    public void setCarreraList(List<Carrera> carreraList) {
        this.carreraList = carreraList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idfacultad != null ? idfacultad.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Facultad)) {
            return false;
        }
        Facultad other = (Facultad) object;
        if ((this.idfacultad == null && other.idfacultad != null) || (this.idfacultad != null && !this.idfacultad.equals(other.idfacultad))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.uisek.inscripciones.ec.entities.Facultad[ idfacultad=" + idfacultad + " ]";
    }
    
}
