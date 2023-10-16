/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ma.projet.services;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import ma.projet.classes.Employe;
import ma.projet.classes.EmployeTache;
import ma.projet.classes.Projet;
import ma.projet.classes.Tache;
import ma.projet.dao.IDao;
import ma.projet.util.HibernateUtil;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author kholo
 */
public class EmployeService implements IDao<Employe> {

    @Override
    public boolean create(Employe o) {
        Session session = null;
        Transaction tx = null;
        try {
            session = HibernateUtil.getSessionFactory().openSession();
            tx = session.beginTransaction();
            session.save(o);
            tx.commit();
            return true;
        } catch (HibernateException ex) {
            if (tx != null) {
                tx.rollback();
            }
            return false;
        } finally {
            if (session != null) {
                session.close();
            }
        }
    }

    @Override
    public List<Employe> getAll() {
        List<Employe> employes = null;
        Session session = null;
        Transaction tx = null;
        try {
            session = HibernateUtil.getSessionFactory().openSession();
            tx = session.beginTransaction();
            employes = session.createQuery("from Employe").list();
            tx.commit();
            return employes;
        } catch (HibernateException ex) {
            if (tx != null) {
                tx.rollback();
            }
            return employes;
        } finally {
            if (session != null) {
                session.close();
            }
        }
    }

    @Override
    public Employe getById(int id) {
        Employe employe = null;
        Session session = null;
        Transaction tx = null;
        try {
            session = HibernateUtil.getSessionFactory().openSession();
            tx = session.beginTransaction();
            employe = (Employe) session.get(Employe.class, id);
            tx.commit();
            return employe;
        } catch (HibernateException ex) {
            if (tx != null) {
                tx.rollback();
            }
            return employe;
        } finally {
            if (session != null) {
                session.close();
            }
        }
    }

    public void findTachesByEmploye(Employe e) {

        List<EmployeTache> employeTaches = null;
        Session session = null;
        Transaction tx = null;
        String query = "select l FROM EmployeTache l "
                + "join l.tache Tache "
                + "join l.employe Employe "
                + "where Employe.id = :id";
        try {

            session = HibernateUtil.getSessionFactory().openSession();
            tx = session.beginTransaction();
            employeTaches = session.createQuery(query).setParameter("id", e.getId()).list();
            tx.commit();
            System.out.println("Employe: " + e.getId());
            System.out.println("Liste des taches :");
            for (EmployeTache l : employeTaches) {
                System.out.println("\t" + l.getTache().getNom() + "\t\t" + l.getTache().getDateDebut() + "\t\t" + l.getTache().getDateFin());
            }
        } catch (HibernateException ex) {
            if (tx != null) {
                tx.rollback();
            }
        } finally {
            if (session != null) {
                session.close();
            }
        }

    }

    public void findProjetsByEmploye(Employe e) {
        List<Projet> projets = null;
        Session session = null;
        Transaction tx = null;

        try {
            session = HibernateUtil.getSessionFactory().openSession();
            tx = session.beginTransaction();
            projets = session.createQuery("FROM Projet WHERE employe = :employe").setParameter("employe", e).list();

            tx.commit();
            System.out.println("Employe: " + e.getId());
            System.out.println("Liste des projets :");
            for (Projet p : projets) {
                System.out.println("\t" + p.getNom() + "\t\t" + p.getDateDebut() + "\t\t" + p.getDateFin());
            }
        } catch (HibernateException ex) {
            if (tx != null) {
                tx.rollback();
            }
        } finally {
            if (session != null) {
                session.close();
            }
        }
    }
    
    
}
