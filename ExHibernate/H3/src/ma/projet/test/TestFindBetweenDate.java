/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ma.projet.test;

import java.text.SimpleDateFormat;
import java.util.Date;
import ma.projet.classes.Projet;
import ma.projet.services.EmployeService;
import ma.projet.services.EmployeTacheService;
import ma.projet.services.ProjetService;
import ma.projet.services.TacheService;
import ma.projet.util.HibernateUtil;

/**
 *
 * @author kholo
 */
public class TestFindBetweenDate {
    public static void main(String[] args){
       // HibernateUtil.getSessionFactory().openSession();
        
        EmployeService es = new EmployeService();
        TacheService ts = new TacheService();
        EmployeTacheService ets = new EmployeTacheService();
        Projet p = new Projet();
        ProjetService ps = new ProjetService();
        
        System.out.println(ts.findBetweenDate(new Date("2023/05/08"),new Date("2023/06/22")));
    }
}
