/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
import ma.produit.service.ProduitService;
import ma.projet.entity.Produit;

/**
 *
 * @author kholo
 */
public class Test {

    public static void main(String[] args) {

        ProduitService ps = new ProduitService();
       
        Date d;
        
        //Créer cinq produits------------------------------------------------       
        Produit p1 = new Produit("Apple", "iPhone 13", new Date(), 1099.99, "Téléphone");
        Produit p2 = new Produit("Huawei", "Huawei19", new Date(2023,7,3), 1030.0, "Téléphone");
        Produit p3 = new Produit("Samsung", "Samsungs23", new Date(2023,5,2), 100.0, "Téléphone");
        Produit p4 = new Produit("xiaomi", "cable", new Date(2023,4,11), 99.0, "Téléphone");
        Produit p5 = new Produit("Oppo", "cable", new Date(2023,6,8), 80.0, "Téléphone");       
        
        ps.create(p1);
        ps.create(p2);
        ps.create(p3);
        ps.create(p4);
        ps.create(p5);       
     
        
        //Afficher la liste des produits-------------------------------------
//        for (Produit s : ps.findAll()) {
//            System.out.println(s.toString());
//        }
        //Afficher les informations du produit dont id = 2-------------------
        //System.out.println(ps.findById(2));
        
        
        // Supprimer le produit dont id = 3----------------------------------
        //ps.delete(ps.findById(3));
        
        // Modifier les informations du produit dont id = 1------------------
//        Produit pp=ps.findById(1);
//        pp.setPrix(1050.0);
//        ps.update(pp);
        
        //Afficher la liste des produits dont le prix est supérieur à 100 DH
//        for(Produit s :ps.findAll())
//            if(s.getPrix()>=100)
//                System.out.println(s.toString());
        
 Scanner s = new Scanner(System.in);
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        Date dateDebut = null;
        Date dateFin = null;
       
 System.out.println("Saisissez la date de debut de la recherche !");
        try {
            dateDebut = dateFormat.parse(s.nextLine());
        } catch (ParseException ex) {
            System.out.println("date invalide");
        }
        System.out.println("Saisissez la date de fin de la recherche");
        try {
            dateFin = dateFormat.parse(s.nextLine());
        } catch (ParseException ex) {
            System.out.println("date invalide");
        }
        for (Produit p : ps.findAll()) {
            if (p.getDateAchat().after(dateDebut) && p.getDateAchat().before(dateFin)) {
                System.out.println(p);
            }
   
        }
    }
    }


