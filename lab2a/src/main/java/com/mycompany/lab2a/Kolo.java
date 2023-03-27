/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lab2a;

/**
 *
 * @author User
 */
public class Kolo extends Figura  {

    private double r;

    public double getR() {
        return r;
    }

    public void setR(double r) {
        this.r = r;
    }

    public Kolo(double r) {
        this.r = r;
    }
    
    @Override
    double pole(){
       return 3.14* getR() * getR();
    }

    @Override
    void info() {
        System.out.println("wartosc r wynosi: "+r);
    }
    
}
