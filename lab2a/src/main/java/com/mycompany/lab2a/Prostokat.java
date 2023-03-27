/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lab2a;

/**
 *
 * @author User
 */
public class Prostokat extends Figura {
    
    private double a;
    private double b;

    public Prostokat(double a, double b) {
        this.a = a;
        this.b = b;
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }
    
    @Override
    void info()
    {
        System.out.println("wartosc a wynosi: "+a);
        System.out.println("wartosc b wynosi: "+b); 
    }
    
    @Override
    double pole()
    {
        return getB()*getA();
    }
   

   
    
}
