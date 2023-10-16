/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ma.projet.services;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
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
public class TacheService implements IDao<Tache> {

    @Override
    public boolean create(Tache o) {
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
    public List<Tache> getAll() {
        List<Tache> projets = null;
        Session session = null;
        Transaction tx = null;
        try {
            session = HibernateUtil.getSessionFactory().openSession();
            tx = session.beginTransaction();
            projets = session.createQuery("from Tache").list();
            tx.commit();
            return projets;
        } catch (HibernateException ex) {
            if (tx != null) {
                tx.rollback();
            }
            return projets;
        } finally {
            if (session != null) {
                session.close();
            }
        }
    }

    @Override
    public Tache getById(int id) {
        Tache projet = null;
        Session session = null;
        Transaction tx = null;
        try {
            session = HibernateUtil.getSessionFactory().openSession();
            tx = session.beginTransaction();
            projet = (Tache) session.get(Tache.class, id);
            tx.commit();
            return projet;
        } catch (HibernateException ex) {
            if (tx != null) {
                tx.rollback();
            }
            return projet;
        } finally {
            if (session != null) {
                session.close();
            }
        }
    }

    public void findTachesRealiseesByProjet(Projet p) {
        SimpleDateFormat format = new SimpleDateFormat();
        List<Tache> taches = null;
        Session session = null;
        Transaction tx = null;
        String query = " FROM Tache  where projet = :id";
        try {
            session = HibernateUtil.getSessionFactory().openSession();
            tx = session.beginTransaction();
            //commandeProduits = session.getNamedQuery("findByCommande").setParameter("id", c.getId()).list();
            taches = session.createQuery(query)
                    .setParameter("id", p).list();

            tx.commit();
            System.out.println("Projet: " + p.getId() + "\t\tNom: " + p.getNom() + "\t\tDate debut: " + format.format(p.getDateDebut()));
            System.out.println("Liste des tachess :");
            System.out.println("\tNum\t\tNom\t\tDate Début Réelle\t\tDate Fin Réelle");
            for (Tache t : taches) {
                System.out.println("\t" + t.getId() + "\t\t" + t.getNom() + "\t\t" +format.format( t.getDateDebut()) + "\t\t" + format.format( t.getDateFin()));
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
    
    public List<Tache> findTachesByMinPrix() {
        List<Tache> taches = null;
        Session session = null;
        Transaction tx = null;
        try {
            session = HibernateUtil.getSessionFactory().openSession();
            tx = session.beginTransaction();
            
            taches  = session.getNamedQuery("minPrix").setParameter("p", 1000.0).list();
            tx.commit();
            return taches;
        } catch (HibernateException ex) {
            if (tx != null) {
                tx.rollback();
            }
            return taches;
        } finally {
            if (session != null) {
                session.close();
            }
        }
    }
    
    public List<Tache> findBetweenDate(Date d1, Date d2) {
        List<Tache> taches = null;
        Session session = null;
        Transaction tx = null;
        try {
            session = HibernateUtil.getSessionFactory().openSession();
            tx = session.beginTransaction();
            taches = session.getNamedQuery("betweenDate").setParameter("d1", d1).setParameter("d2", d2).list();
            tx.commit();
            return taches;
        } catch (HibernateException ex) {
            if(tx != null)
                tx.rollback();
            return taches;
        } finally {
            if(session != null)
                session.close();
        }
    }
    

}
