/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.lab2a;

import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author User
 */

public class Lab2a {

    public static void main(String[] args) {
        
        //tworzenie prostokąta
        Prostokat prostokat1=new Prostokat(3.0,4.0);
       
        System.out.println("info o porstokącie");
        prostokat1.info();

        System.out.println("pole prostokąta");
        System.out.println(prostokat1.pole());
       
        System.out.println("zmiana i wypisanie b prostokąta");
        prostokat1.setB(5.0);
        System.out.println(prostokat1.getB());
        
        System.out.println("zmiana i wypisanie a prostokąta");
        prostokat1.setA(5.0);
        System.out.println(prostokat1.getA());
        System.out.println("pole prostokąta po zmianie");
        System.out.println(prostokat1.pole());
        
        Kolo kolo1 = new Kolo(3.15);
        System.out.println("info kola");
        kolo1.info();
        System.out.println("pole kola");
        System.out.println(kolo1.pole());
        
        List<Kolo> listakola = new LinkedList<>();
        listakola.add(new Kolo(3.0));
        listakola.add(new Kolo(4.0));
        listakola.add(new Kolo(5.0));
        
        List<Prostokat> listapro = new LinkedList<>();
        listapro.add(new Prostokat(3.0,4.0));
        listapro.add(new Prostokat(4.0,5.0));
        listapro.add(new Prostokat(5.0,6.0));
        
        //listy na wyniki szukania
         List<Kolo> listakola2 = new LinkedList<>();
         List<Prostokat> listapro2 = new LinkedList<>();
         
        for(Kolo kollo : listakola)
        {
            if(kollo.pole()>20)
               listakola2.add(kollo);
        }
        
        for(Prostokat kollo : listapro)
        {
            if(kollo.pole()>20)
               listapro2.add(kollo);
        }
        //pola kół wieksze od 20
        System.out.println("pola kół>20");
        for(Kolo kollo : listakola2)
        {
            System.out.println(kollo.pole());
        }
        System.out.println("pola kwadratu >20");
        //pola kwadratów wieksze od 20
        for(Prostokat kwad : listapro2)
        {
            System.out.println(kwad.pole());
        }
    }
}
