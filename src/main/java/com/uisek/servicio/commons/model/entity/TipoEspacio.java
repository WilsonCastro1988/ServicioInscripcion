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
@Table(name = "tipo_espacio", catalog = "uisek_inscripcion", schema = "")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "TipoEspacio.findAll", query = "SELECT t FROM TipoEspacio t")
    , @NamedQuery(name = "TipoEspacio.findByIdtipoEspacio", query = "SELECT t FROM TipoEspacio t WHERE t.idtipoEspacio = :idtipoEspacio")
    , @NamedQuery(name = "TipoEspacio.findByNombreTipoEspacio", query = "SELECT t FROM TipoEspacio t WHERE t.nombreTipoEspacio = :nombreTipoEspacio")
    , @NamedQuery(name = "TipoEspacio.findByActivoTipoEspacio", query = "SELECT t FROM TipoEspacio t WHERE t.activoTipoEspacio = :activoTipoEspacio")})
public class TipoEspacio implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idtipo_espacio")
    private Integer idtipoEspacio;
    @Column(name = "nombre_tipo_espacio")
    private String nombreTipoEspacio;
    @Column(name = "activo_tipo_espacio")
    private Short activoTipoEspacio;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "tipoEspacioIdtipoEspacio", fetch = FetchType.LAZY)
    private List<Espacio> espacioList;

    public TipoEspacio() {
    }

    public TipoEspacio(Integer idtipoEspacio) {
        this.idtipoEspacio = idtipoEspacio;
    }

    public Integer getIdtipoEspacio() {
        return idtipoEspacio;
    }

    public void setIdtipoEspacio(Integer idtipoEspacio) {
        this.idtipoEspacio = idtipoEspacio;
    }

    public String getNombreTipoEspacio() {
        return nombreTipoEspacio;
    }

    public void setNombreTipoEspacio(String nombreTipoEspacio) {
        this.nombreTipoEspacio = nombreTipoEspacio;
    }

    public Short getActivoTipoEspacio() {
        return activoTipoEspacio;
    }

    public void setActivoTipoEspacio(Short activoTipoEspacio) {
        this.activoTipoEspacio = activoTipoEspacio;
    }

    @XmlTransient
    public List<Espacio> getEspacioList() {
        return espacioList;
    }

    public void setEspacioList(List<Espacio> espacioList) {
        this.espacioList = espacioList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idtipoEspacio != null ? idtipoEspacio.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TipoEspacio)) {
            return false;
        }
        TipoEspacio other = (TipoEspacio) object;
        if ((this.idtipoEspacio == null && other.idtipoEspacio != null) || (this.idtipoEspacio != null && !this.idtipoEspacio.equals(other.idtipoEspacio))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.uisek.inscripciones.ec.entities.TipoEspacio[ idtipoEspacio=" + idtipoEspacio + " ]";
    }
    
}
