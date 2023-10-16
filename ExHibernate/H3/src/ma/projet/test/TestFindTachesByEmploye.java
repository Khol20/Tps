/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ma.projet.test;

import java.util.Date;
import ma.projet.classes.Employe;
import ma.projet.classes.EmployeTache;
import ma.projet.classes.EmployeTachePK;
import ma.projet.classes.Tache;
import ma.projet.services.EmployeService;
import ma.projet.services.EmployeTacheService;
import ma.projet.services.ProjetService;
import ma.projet.services.TacheService;
import ma.projet.util.HibernateUtil;

/**
 *
 * @author kholo
 */
public class TestFindTachesByEmploye {

    public static void main(String[] args) {
        //HibernateUtil.getSessionFactory().openSession();
        EmployeService es = new EmployeService();
        TacheService ts = new TacheService();
        EmployeTacheService ets = new EmployeTacheService();
        ProjetService ps = new ProjetService();

        Employe e1 = new Employe("jihad", "Ali", "0600000000");
        Employe e2 = new Employe("ziyad", "loubna", "0600000001");

//        es.create(e1);
//        es.create(e2);

        Tache t1 = new Tache("tache1", new Date("2023/07/10"), new Date("2023/07/20"), 1500.0,ps.getById(1));
        Tache t2 = new Tache("tache2", new Date("2023/06/10"), new Date("2023/06/20"), 1000.0,ps.getById(1));
        Tache t3 = new Tache("tache3", new Date("2023/05/10"), new Date("2023/05/20"), 800.0,ps.getById(2));
        
//        ts.create(t1);
//        ts.create(t2);
//        ts.create(t3);

//        EmployeTachePK pk1 = new EmployeTachePK(es.getById(1).getId(),ts.getById(1).getId(), new Date("2023/07/11"));
//        EmployeTachePK pk2 = new EmployeTachePK(es.getById(1).getId(), ts.getById(2).getId(), new Date("2023/06/11"));
//        EmployeTachePK pk3 = new EmployeTachePK(es.getById(2).getId(), ts.getById(2).getId(), new Date("2023/06/13"));
//        EmployeTachePK pk4 = new EmployeTachePK(es.getById(2).getId(), ts.getById(3).getId(), new Date("2023/05/11"));
//
//        ets.create(new EmployeTache(pk1, new Date("2023/07/18")));
//        ets.create(new EmployeTache(pk2, new Date("2023/06/29")));
//        ets.create(new EmployeTache(pk3, new Date("2023/07/16")));
//        ets.create(new EmployeTache(pk4, new Date("2023/05/18")));
        
//       es.findTachesByEmploye(es.getById(1));

    }

}
