/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab.pkg5;

import java.util.ArrayList;

/**
 *
 * @author david
 */
public class Universo {
    private String codigo;
    private int edad;
    ArrayList <mundo> mun=new ArrayList();

    public Universo() {
    }

    public Universo(String codigo, int edad) {
        this.codigo = codigo;
        this.edad = edad;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }


    public ArrayList<mundo> getMun() {
        return mun;
    }

    public void setMun(ArrayList<mundo> mun) {
        this.mun = mun;
    }

    @Override
    public String toString() {
        return "Universo";
    }
    
}
