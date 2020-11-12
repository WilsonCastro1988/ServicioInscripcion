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
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
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
@Table(name = "estudiantes", catalog = "uisek_inscripcion", schema = "")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Estudiantes.findAll", query = "SELECT e FROM Estudiantes e")
    , @NamedQuery(name = "Estudiantes.findByIdestudiantes", query = "SELECT e FROM Estudiantes e WHERE e.idestudiantes = :idestudiantes")
    , @NamedQuery(name = "Estudiantes.findByNombresEstudiantes", query = "SELECT e FROM Estudiantes e WHERE e.nombresEstudiantes = :nombresEstudiantes")
    , @NamedQuery(name = "Estudiantes.findByCodigoEstudiantes", query = "SELECT e FROM Estudiantes e WHERE e.codigoEstudiantes = :codigoEstudiantes")
    , @NamedQuery(name = "Estudiantes.findByFechaNacimientoEstudiantes", query = "SELECT e FROM Estudiantes e WHERE e.fechaNacimientoEstudiantes = :fechaNacimientoEstudiantes")
    , @NamedQuery(name = "Estudiantes.findByDireccionEstudiantes", query = "SELECT e FROM Estudiantes e WHERE e.direccionEstudiantes = :direccionEstudiantes")
    , @NamedQuery(name = "Estudiantes.findByEmailEstudiantes", query = "SELECT e FROM Estudiantes e WHERE e.emailEstudiantes = :emailEstudiantes")
    , @NamedQuery(name = "Estudiantes.findByTelefonoEstudiantes", query = "SELECT e FROM Estudiantes e WHERE e.telefonoEstudiantes = :telefonoEstudiantes")
    , @NamedQuery(name = "Estudiantes.findByActivoEstudiantes", query = "SELECT e FROM Estudiantes e WHERE e.activoEstudiantes = :activoEstudiantes")
    , @NamedQuery(name = "Estudiantes.findByFlagCarreraEstudiantes", query = "SELECT e FROM Estudiantes e WHERE e.flagCarreraEstudiantes = :flagCarreraEstudiantes")})
public class Estudiantes implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "idestudiantes")
    private String idestudiantes;
    @Column(name = "nombres_estudiantes")
    private String nombresEstudiantes;
    @Column(name = "codigo_estudiantes")
    private String codigoEstudiantes;
    @Column(name = "fecha_nacimiento_estudiantes")
    @Temporal(TemporalType.DATE)
    private Date fechaNacimientoEstudiantes;
    @Column(name = "direccion_estudiantes")
    private String direccionEstudiantes;
    @Column(name = "email_estudiantes")
    private String emailEstudiantes;
    @Column(name = "telefono_estudiantes")
    private String telefonoEstudiantes;
    @Column(name = "activo_estudiantes")
    private Short activoEstudiantes;
    @Column(name = "flag_carrera_estudiantes")
    private Integer flagCarreraEstudiantes;
    @JoinColumn(name = "matricula_idmatricula", referencedColumnName = "idmatricula")
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private Matricula matriculaIdmatricula;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "estudiantes", fetch = FetchType.LAZY)
    private List<MateriasHasEstudiantes> materiasHasEstudiantesList;

    public Estudiantes() {
    }

    public Estudiantes(String idestudiantes) {
        this.idestudiantes = idestudiantes;
    }

    public String getIdestudiantes() {
        return idestudiantes;
    }

    public void setIdestudiantes(String idestudiantes) {
        this.idestudiantes = idestudiantes;
    }

    public String getNombresEstudiantes() {
        return nombresEstudiantes;
    }

    public void setNombresEstudiantes(String nombresEstudiantes) {
        this.nombresEstudiantes = nombresEstudiantes;
    }

    public String getCodigoEstudiantes() {
        return codigoEstudiantes;
    }

    public void setCodigoEstudiantes(String codigoEstudiantes) {
        this.codigoEstudiantes = codigoEstudiantes;
    }

    public Date getFechaNacimientoEstudiantes() {
        return fechaNacimientoEstudiantes;
    }

    public void setFechaNacimientoEstudiantes(Date fechaNacimientoEstudiantes) {
        this.fechaNacimientoEstudiantes = fechaNacimientoEstudiantes;
    }

    public String getDireccionEstudiantes() {
        return direccionEstudiantes;
    }

    public void setDireccionEstudiantes(String direccionEstudiantes) {
        this.direccionEstudiantes = direccionEstudiantes;
    }

    public String getEmailEstudiantes() {
        return emailEstudiantes;
    }

    public void setEmailEstudiantes(String emailEstudiantes) {
        this.emailEstudiantes = emailEstudiantes;
    }

    public String getTelefonoEstudiantes() {
        return telefonoEstudiantes;
    }

    public void setTelefonoEstudiantes(String telefonoEstudiantes) {
        this.telefonoEstudiantes = telefonoEstudiantes;
    }

    public Short getActivoEstudiantes() {
        return activoEstudiantes;
    }

    public void setActivoEstudiantes(Short activoEstudiantes) {
        this.activoEstudiantes = activoEstudiantes;
    }

    public Integer getFlagCarreraEstudiantes() {
        return flagCarreraEstudiantes;
    }

    public void setFlagCarreraEstudiantes(Integer flagCarreraEstudiantes) {
        this.flagCarreraEstudiantes = flagCarreraEstudiantes;
    }

    public Matricula getMatriculaIdmatricula() {
        return matriculaIdmatricula;
    }

    public void setMatriculaIdmatricula(Matricula matriculaIdmatricula) {
        this.matriculaIdmatricula = matriculaIdmatricula;
    }

    @XmlTransient
    public List<MateriasHasEstudiantes> getMateriasHasEstudiantesList() {
        return materiasHasEstudiantesList;
    }

    public void setMateriasHasEstudiantesList(List<MateriasHasEstudiantes> materiasHasEstudiantesList) {
        this.materiasHasEstudiantesList = materiasHasEstudiantesList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idestudiantes != null ? idestudiantes.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Estudiantes)) {
            return false;
        }
        Estudiantes other = (Estudiantes) object;
        if ((this.idestudiantes == null && other.idestudiantes != null) || (this.idestudiantes != null && !this.idestudiantes.equals(other.idestudiantes))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.uisek.inscripciones.ec.entities.Estudiantes[ idestudiantes=" + idestudiantes + " ]";
    }
    
}
