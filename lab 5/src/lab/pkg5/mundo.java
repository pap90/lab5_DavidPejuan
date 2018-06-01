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
public class mundo {
    private String nombre;
    private int peso;
    private ArrayList<criaturas> criatura=new ArrayList();

    public mundo() {
    }

    public mundo(String nombre, int peso) {
        this.nombre = nombre;
        this.peso = peso;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public ArrayList<criaturas> getCriatura() {
        return criatura;
    }

    public void setCriatura(ArrayList<criaturas> criatura) {
        this.criatura = criatura;
    }

    @Override
    public String toString() {
        return nombre;
    }
    
    
}
