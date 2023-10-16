/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ma.projet.classes;

import java.util.Date;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;

/**
 *
 * @author kholo
 */
@Entity
public class EmployeTache {

    @EmbeddedId
    private EmployeTachePK id;
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date dateFinReelle;
    @ManyToOne()
    @JoinColumn(name = "employe", referencedColumnName = "id", insertable = false, updatable = false)
    private Employe employe;

    @ManyToOne()
    @JoinColumn(name = "tache", referencedColumnName = "id", insertable = false, updatable = false)
    private Tache tache;

    public EmployeTache() {
    }

    public EmployeTache(EmployeTachePK id, Date dateFinReelle) {
        this.id = id;
        this.dateFinReelle = dateFinReelle;
    }

    public EmployeTache(Date dateFinReelle, Employe employe, Tache tache) {
        this.dateFinReelle = dateFinReelle;
        this.employe = employe;
        this.tache = tache;
    }
    

    public EmployeTachePK getId() {
        return id;
    }

    public void setId(EmployeTachePK id) {
        this.id = id;
    }

    public Date getDateFinReelle() {
        return dateFinReelle;
    }

    public void setDateFinReelle(Date dateFinReelle) {
        this.dateFinReelle = dateFinReelle;
    }

    public Employe getEmploye() {
        return employe;
    }

    public void setEmploye(Employe employe) {
        this.employe = employe;
    }

    public Tache getTache() {
        return tache;
    }

    public void setTache(Tache tache) {
        this.tache = tache;
    }

}
