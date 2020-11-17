/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.uisek.servicio.commons.model.entity;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Basic;
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
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

import com.fasterxml.jackson.annotation.JsonBackReference;

/**
 *
 * @author Wilson
 */
@Entity
@Table(name = "matricula", catalog = "uisek_inscripcion", schema = "")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Matricula.findAll", query = "SELECT m FROM Matricula m")
    , @NamedQuery(name = "Matricula.findByIdmatricula", query = "SELECT m FROM Matricula m WHERE m.idmatricula = :idmatricula")
    , @NamedQuery(name = "Matricula.findByFlagPensum", query = "SELECT m FROM Matricula m WHERE m.flagPensum = :flagPensum")
    , @NamedQuery(name = "Matricula.findByNumeroMatricula", query = "SELECT m FROM Matricula m WHERE m.numeroMatricula = :numeroMatricula")
    , @NamedQuery(name = "Matricula.findByActivoMatricula", query = "SELECT m FROM Matricula m WHERE m.activoMatricula = :activoMatricula")})
public class Matricula implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idmatricula")
    private Integer idmatricula;
    @Column(name = "flag_pensum")
    private Integer flagPensum;
    @Column(name = "numero_matricula")
    private String numeroMatricula;
    @Column(name = "activo_matricula")
    private Short activoMatricula;
    
    @JoinColumn(name = "estudiante_idestudiante", referencedColumnName = "idestudiantes")
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    @JsonBackReference
    private Estudiantes estudianteIdestudiante;
    
    
    
    @JoinColumn(name = "estado_matricula_idestado_matricula", referencedColumnName = "idestado_matricula")
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private EstadoMatricula estadoMatriculaIdestadoMatricula;

    public Matricula() {
    }

    public Matricula(Integer idmatricula) {
        this.idmatricula = idmatricula;
    }

    public Integer getIdmatricula() {
        return idmatricula;
    }

    public void setIdmatricula(Integer idmatricula) {
        this.idmatricula = idmatricula;
    }

    public Integer getFlagPensum() {
        return flagPensum;
    }

    public void setFlagPensum(Integer flagPensum) {
        this.flagPensum = flagPensum;
    }

    public String getNumeroMatricula() {
        return numeroMatricula;
    }

    public void setNumeroMatricula(String numeroMatricula) {
        this.numeroMatricula = numeroMatricula;
    }

    public Short getActivoMatricula() {
        return activoMatricula;
    }

    public void setActivoMatricula(Short activoMatricula) {
        this.activoMatricula = activoMatricula;
    }

   

    public Estudiantes getEstudianteIdestudiante() {
		return estudianteIdestudiante;
	}

	public void setEstudianteIdestudiante(Estudiantes estudianteIdestudiante) {
		this.estudianteIdestudiante = estudianteIdestudiante;
	}

	public EstadoMatricula getEstadoMatriculaIdestadoMatricula() {
        return estadoMatriculaIdestadoMatricula;
    }

    public void setEstadoMatriculaIdestadoMatricula(EstadoMatricula estadoMatriculaIdestadoMatricula) {
        this.estadoMatriculaIdestadoMatricula = estadoMatriculaIdestadoMatricula;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idmatricula != null ? idmatricula.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Matricula)) {
            return false;
        }
        Matricula other = (Matricula) object;
        if ((this.idmatricula == null && other.idmatricula != null) || (this.idmatricula != null && !this.idmatricula.equals(other.idmatricula))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.uisek.inscripciones.ec.entities.Matricula[ idmatricula=" + idmatricula + " ]";
    }
    
}
