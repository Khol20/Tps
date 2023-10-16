/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ma.projet.test;

import java.util.Date;
import ma.projet.classes.Employe;
import ma.projet.classes.Projet;
import ma.projet.services.EmployeService;
import ma.projet.services.EmployeTacheService;
import ma.projet.services.ProjetService;
import ma.projet.services.TacheService;

/**
 *
 * @author kholo
 */
public class TestFindProjetsByEmploye {

    public static void main(String[] args) {

        EmployeService es = new EmployeService();
        TacheService ts = new TacheService();
        EmployeTacheService ets = new EmployeTacheService();
        Projet p = new Projet();
        ProjetService ps = new ProjetService();

//        ps.create(new Projet("projet1",new Date("2023/07/01"),new Date("2023/07/30"),es.getById(1)));
//        ps.create(new Projet("projet2",new Date("2023/06/01"),new Date("2023/06/30"),es.getById(1)));
//        ps.create(new Projet("projet3",new Date("2023/05/01"),new Date("2023/05/30"),es.getById(2)));
                es.findProjetsByEmploye(es.getById(1));
                
   
        
        
        
        
    }
}
