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
    private int peso;
    ArrayList <mundo> mun=new ArrayList();

    public Universo() {
    }

    public Universo(String codigo, int edad, int peso) {
        this.codigo = codigo;
        this.edad = edad;
        this.peso = peso;
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

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
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
