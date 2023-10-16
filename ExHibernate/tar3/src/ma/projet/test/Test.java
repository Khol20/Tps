/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ma.projet.test;
import java.util.Date;
import ma.projet.beans.Femme;
import ma.projet.beans.Mariage;
import ma.projet.services.FemmeService;
import ma.projet.services.HommeService;
import ma.projet.services.MariageService;


/**
 *
 * @author kholo
 */
public class Test {

    public static void main(String[] args) {
        FemmeService fs = new FemmeService();
        HommeService hs = new HommeService();
        MariageService ms = new MariageService();

//        fs.create(new Femme("Smith", "Emma", "0676543210", "400 Rue de la Femme ", new Date("1999/10/18")));
//       fs.create(new Femme("Doe", "Linda", "0676543230", "300 Rue de la roche ", new Date("1997/11/19")));
//       fs.create(new Femme("Doe", "Jullia", "0676543240", "200 Rue de la perle ", new Date("1980/12/20")));
//       fs.create(new Femme("Doe", "Sandi", "0676543250", "100 Rue de la mer ", new Date("1997/07/27")));
//       fs.create(new Femme("Doe", "Bella", "0676543260", "90 Rue de la foret ", new Date("1996/08/23")));
//       fs.create(new Femme("Smith", "samira", "0676543260", "10 Rue de la foret ", new Date("1995/08/23")));
//       fs.create(new Femme("sisi", "jihan", "0676543260", "20 Rue de la foret ", new Date("1996/08/24")));
//       fs.create(new Femme("mimi", "mila", "0676560260", "30 Rue de la foret ", new Date("1995/08/25")));
//       fs.create(new Femme("dala", "wafa", "0676550260", "40 Rue de la foret ", new Date("1996/08/26")));
//       fs.create(new Femme("Dono", "lara", "0676540260", "50 Rue de la foret ", new Date("1995/08/27")));
//       
//       
//       
//       hs.create(new Homme("Doe", "Michael", "0676546000", "100 Rue de la mer ",new Date("1980/01/20")));
//       hs.create(new Homme("Smith", "Sam", "0676547000", "400 Rue de la Femme",new Date("1989/12/12")));
//       hs.create(new Homme("Maison", "Jack", "0706548000", "455 Rue de l'Homme ",new Date("1979/03/18")));
//       hs.create(new Homme("Dono", "salim", "0716548000", "50 Rue de la foret ",new Date("1979/03/18")));
//       hs.create(new Homme("mimi", "jad", "0726548000", "30 Rue de la foret ",new Date("1979/03/18")));
       
       
//       MariagePK pk1 = new MariagePK(2,11,new Date("2020/10/11"));
//       MariagePK pk2 = new MariagePK(3,11,new Date("2021/11/11"));
//       MariagePK pk3 = new MariagePK(4,11,new Date("2022/12/11"));
//       MariagePK pk4 = new MariagePK(5,11,new Date("2023/02/11"));
//       MariagePK pk5 = new MariagePK(1,12,new Date("2022/10/11"));
//       MariagePK pk6 = new MariagePK(8,15,new Date("2022/10/11"));
//       MariagePK pk7 = new MariagePK(8,12,new Date("2022/10/11"));
//       
//       
//       
//       ms.create(new Mariage(pk1,new Date("2021/11/08"),4));
//       ms.create(new Mariage(pk2,new Date("2022/10/11"),2));
//       ms.create(new Mariage(pk3,new Date("2023/01/12"),1));
//       ms.create(new Mariage(pk4,new Date("2023/07/12"),0));
//       ms.create(new Mariage(pk5,new Date("2023/01/12"),6));
//       ms.create(new Mariage(pk6,new Date("2023/03/12"),1));
//       ms.create(new Mariage(pk7,new Date("2023/03/16"),2));


//----------------------------------------------------
        System.out.println(fs.getFemmePlusAgee().getNom());
//----------------------------------------------------
//        hs.getListEpousesParHomme(hs.getById(13));


//----------------------------------------------------
//        hs.getMarriedWithFourWomenBetweenDates(new Date("2022/07/01"), new Date("2023/10/09"));
//----------------------------------------------------
//        for (Mariage m : hs.getMariagesParHomme(hs.getById(11))) {
//            System.out.println(m);
//        }
        
        //----------------------------------------------------
//        for (Femme f : fs.getFemmesMarieesAuMoinsDeuxFois()) {
//            System.out.println(f);
//        }
        
      //----------------------------------------------------
//        for (Femme ff : fs.getAll()) {
//            System.out.println(ff);
//        } 
        
        //----------------------------------------------------
//        System.out.println(fs.getNombreEnfantsEntreDates(2, new Date("2018/03/15"), new Date("2023/05/4")));
        
        
        
    }
    
    
    
    
    
}
