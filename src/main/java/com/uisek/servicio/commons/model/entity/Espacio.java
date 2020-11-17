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
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
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
@Table(name = "espacio", catalog = "uisek_inscripcion", schema = "")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Espacio.findAll", query = "SELECT e FROM Espacio e")
    , @NamedQuery(name = "Espacio.findByIdespacio", query = "SELECT e FROM Espacio e WHERE e.idespacio = :idespacio")
    , @NamedQuery(name = "Espacio.findByNombreEspacio", query = "SELECT e FROM Espacio e WHERE e.nombreEspacio = :nombreEspacio")
    , @NamedQuery(name = "Espacio.findByDescripcionEspacio", query = "SELECT e FROM Espacio e WHERE e.descripcionEspacio = :descripcionEspacio")
    , @NamedQuery(name = "Espacio.findByActivoEspacio", query = "SELECT e FROM Espacio e WHERE e.activoEspacio = :activoEspacio")
    , @NamedQuery(name = "Espacio.findByCapacidadEspacio", query = "SELECT e FROM Espacio e WHERE e.capacidadEspacio = :capacidadEspacio")})
public class Espacio implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idespacio")
    private Integer idespacio;
    @Column(name = "nombre_espacio")
    private String nombreEspacio;
    @Column(name = "descripcion_espacio")
    private String descripcionEspacio;
    @Column(name = "activo_espacio")
    private Short activoEspacio;
    @Column(name = "capacidad_espacio")
    private Integer capacidadEspacio;
    @JoinColumn(name = "tipo_espacio_idtipo_espacio", referencedColumnName = "idtipo_espacio")
    @ManyToOne(optional = false)
    private TipoEspacio tipoEspacioIdtipoEspacio;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "espacio")
    private List<EspacioHasHorarios> espacioHasHorariosList;

    public Espacio() {
    }

    public Espacio(Integer idespacio) {
        this.idespacio = idespacio;
    }

    public Integer getIdespacio() {
        return idespacio;
    }

    public void setIdespacio(Integer idespacio) {
        this.idespacio = idespacio;
    }

    public String getNombreEspacio() {
        return nombreEspacio;
    }

    public void setNombreEspacio(String nombreEspacio) {
        this.nombreEspacio = nombreEspacio;
    }

    public String getDescripcionEspacio() {
        return descripcionEspacio;
    }

    public void setDescripcionEspacio(String descripcionEspacio) {
        this.descripcionEspacio = descripcionEspacio;
    }

    public Short getActivoEspacio() {
        return activoEspacio;
    }

    public void setActivoEspacio(Short activoEspacio) {
        this.activoEspacio = activoEspacio;
    }

    public Integer getCapacidadEspacio() {
        return capacidadEspacio;
    }

    public void setCapacidadEspacio(Integer capacidadEspacio) {
        this.capacidadEspacio = capacidadEspacio;
    }

    public TipoEspacio getTipoEspacioIdtipoEspacio() {
        return tipoEspacioIdtipoEspacio;
    }

    public void setTipoEspacioIdtipoEspacio(TipoEspacio tipoEspacioIdtipoEspacio) {
        this.tipoEspacioIdtipoEspacio = tipoEspacioIdtipoEspacio;
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
        hash += (idespacio != null ? idespacio.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Espacio)) {
            return false;
        }
        Espacio other = (Espacio) object;
        if ((this.idespacio == null && other.idespacio != null) || (this.idespacio != null && !this.idespacio.equals(other.idespacio))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.uisek.inscripciones.ec.entities.Espacio[ idespacio=" + idespacio + " ]";
    }
    
}
