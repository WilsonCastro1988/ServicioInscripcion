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

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 *
 * @author Wilson
 */
@Entity
@Table(name = "materias", catalog = "uisek_inscripcion", schema = "")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Materias.findAll", query = "SELECT m FROM Materias m")
    , @NamedQuery(name = "Materias.findByIdmaterias", query = "SELECT m FROM Materias m WHERE m.idmaterias = :idmaterias")
    , @NamedQuery(name = "Materias.findByNombreMateria", query = "SELECT m FROM Materias m WHERE m.nombreMateria = :nombreMateria")
    , @NamedQuery(name = "Materias.findByActivoMaterias", query = "SELECT m FROM Materias m WHERE m.activoMaterias = :activoMaterias")})
public class Materias implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idmaterias")
    private Integer idmaterias;
    @Column(name = "nombre_materia")
    private String nombreMateria;
    @Column(name = "dias_materia")
    private String diasMateria;
    @Column(name = "activo_materias")
    private Short activoMaterias;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "materias")
    private List<MateriasHasEspacioHasHorarios> materiasHasEspacioHasHorariosList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "materias")
    private List<MateriasHasEstudiantes> materiasHasEstudiantesList;
    @JoinColumn(name = "carrera_idcarrera", referencedColumnName = "idcarrera")
    @ManyToOne(optional = false)
    private Carrera carreraIdcarrera;
    @JoinColumn(name = "paralelo_idparalelo", referencedColumnName = "idparalelo")
    @ManyToOne(optional = false)
    private Paralelo paraleloIdparalelo;
    @JoinColumn(name = "pensum_idpensum", referencedColumnName = "idpensum")
    @ManyToOne(optional = false)
    private Pensum pensumIdpensum;

    public Materias() {
    }

    public Materias(Integer idmaterias) {
        this.idmaterias = idmaterias;
    }
    
    

    public String getDiasMateria() {
		return diasMateria;
	}

	public void setDiasMateria(String diasMateria) {
		this.diasMateria = diasMateria;
	}

	public Integer getIdmaterias() {
        return idmaterias;
    }

    public void setIdmaterias(Integer idmaterias) {
        this.idmaterias = idmaterias;
    }

    public String getNombreMateria() {
        return nombreMateria;
    }

    public void setNombreMateria(String nombreMateria) {
        this.nombreMateria = nombreMateria;
    }

    public Short getActivoMaterias() {
        return activoMaterias;
    }

    public void setActivoMaterias(Short activoMaterias) {
        this.activoMaterias = activoMaterias;
    }

    @XmlTransient
    public List<MateriasHasEspacioHasHorarios> getMateriasHasEspacioHasHorariosList() {
        return materiasHasEspacioHasHorariosList;
    }

    public void setMateriasHasEspacioHasHorariosList(List<MateriasHasEspacioHasHorarios> materiasHasEspacioHasHorariosList) {
        this.materiasHasEspacioHasHorariosList = materiasHasEspacioHasHorariosList;
    }

    @XmlTransient
    public List<MateriasHasEstudiantes> getMateriasHasEstudiantesList() {
        return materiasHasEstudiantesList;
    }

    public void setMateriasHasEstudiantesList(List<MateriasHasEstudiantes> materiasHasEstudiantesList) {
        this.materiasHasEstudiantesList = materiasHasEstudiantesList;
    }

    public Carrera getCarreraIdcarrera() {
        return carreraIdcarrera;
    }

    public void setCarreraIdcarrera(Carrera carreraIdcarrera) {
        this.carreraIdcarrera = carreraIdcarrera;
    }

    public Paralelo getParaleloIdparalelo() {
        return paraleloIdparalelo;
    }

    public void setParaleloIdparalelo(Paralelo paraleloIdparalelo) {
        this.paraleloIdparalelo = paraleloIdparalelo;
    }

    public Pensum getPensumIdpensum() {
        return pensumIdpensum;
    }

    public void setPensumIdpensum(Pensum pensumIdpensum) {
        this.pensumIdpensum = pensumIdpensum;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idmaterias != null ? idmaterias.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Materias)) {
            return false;
        }
        Materias other = (Materias) object;
        if ((this.idmaterias == null && other.idmaterias != null) || (this.idmaterias != null && !this.idmaterias.equals(other.idmaterias))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.uisek.inscripciones.ec.entities.Materias[ idmaterias=" + idmaterias + " ]";
    }
    
}
