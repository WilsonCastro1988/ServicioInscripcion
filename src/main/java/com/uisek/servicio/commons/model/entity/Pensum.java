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
@Table(name = "pensum", catalog = "uisek_inscripcion", schema = "")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Pensum.findAll", query = "SELECT p FROM Pensum p")
    , @NamedQuery(name = "Pensum.findByIdpensum", query = "SELECT p FROM Pensum p WHERE p.idpensum = :idpensum")
    , @NamedQuery(name = "Pensum.findByNombrePensum", query = "SELECT p FROM Pensum p WHERE p.nombrePensum = :nombrePensum")
    , @NamedQuery(name = "Pensum.findByAnioPensum", query = "SELECT p FROM Pensum p WHERE p.anioPensum = :anioPensum")
    , @NamedQuery(name = "Pensum.findByPeriodoPensum", query = "SELECT p FROM Pensum p WHERE p.periodoPensum = :periodoPensum")
    , @NamedQuery(name = "Pensum.findByDescripcionPensum", query = "SELECT p FROM Pensum p WHERE p.descripcionPensum = :descripcionPensum")
    , @NamedQuery(name = "Pensum.findByIniciaPensum", query = "SELECT p FROM Pensum p WHERE p.iniciaPensum = :iniciaPensum")
    , @NamedQuery(name = "Pensum.findByTerminaPensum", query = "SELECT p FROM Pensum p WHERE p.terminaPensum = :terminaPensum")
    , @NamedQuery(name = "Pensum.findByActivoPensum", query = "SELECT p FROM Pensum p WHERE p.activoPensum = :activoPensum")})
public class Pensum implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idpensum")
    private Integer idpensum;
    @Column(name = "nombre_pensum")
    private String nombrePensum;
    @Column(name = "anio_pensum")
    private String anioPensum;
    @Column(name = "periodo_pensum")
    private String periodoPensum;
    @Column(name = "descripcion_pensum")
    private String descripcionPensum;
    @Column(name = "inicia_pensum")
    @Temporal(TemporalType.TIMESTAMP)
    private Date iniciaPensum;
    @Column(name = "termina_pensum")
    @Temporal(TemporalType.TIMESTAMP)
    private Date terminaPensum;
    @Column(name = "activo_pensum")
    private Short activoPensum;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "pensumIdpensum", fetch = FetchType.LAZY)
    private List<Materias> materiasList;

    public Pensum() {
    }

    public Pensum(Integer idpensum) {
        this.idpensum = idpensum;
    }

    public Integer getIdpensum() {
        return idpensum;
    }

    public void setIdpensum(Integer idpensum) {
        this.idpensum = idpensum;
    }

    public String getNombrePensum() {
        return nombrePensum;
    }

    public void setNombrePensum(String nombrePensum) {
        this.nombrePensum = nombrePensum;
    }

    public String getAnioPensum() {
        return anioPensum;
    }

    public void setAnioPensum(String anioPensum) {
        this.anioPensum = anioPensum;
    }

    public String getPeriodoPensum() {
        return periodoPensum;
    }

    public void setPeriodoPensum(String periodoPensum) {
        this.periodoPensum = periodoPensum;
    }

    public String getDescripcionPensum() {
        return descripcionPensum;
    }

    public void setDescripcionPensum(String descripcionPensum) {
        this.descripcionPensum = descripcionPensum;
    }

    public Date getIniciaPensum() {
        return iniciaPensum;
    }

    public void setIniciaPensum(Date iniciaPensum) {
        this.iniciaPensum = iniciaPensum;
    }

    public Date getTerminaPensum() {
        return terminaPensum;
    }

    public void setTerminaPensum(Date terminaPensum) {
        this.terminaPensum = terminaPensum;
    }

    public Short getActivoPensum() {
        return activoPensum;
    }

    public void setActivoPensum(Short activoPensum) {
        this.activoPensum = activoPensum;
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
        hash += (idpensum != null ? idpensum.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Pensum)) {
            return false;
        }
        Pensum other = (Pensum) object;
        if ((this.idpensum == null && other.idpensum != null) || (this.idpensum != null && !this.idpensum.equals(other.idpensum))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.uisek.inscripciones.ec.entities.Pensum[ idpensum=" + idpensum + " ]";
    }
    
}
