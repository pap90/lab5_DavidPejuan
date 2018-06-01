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
public class criaturas {
    private String nombre;
    private int energia;
    private int mlife;
    private String nregion;
    private int vivos;
    private int peso;
    private ArrayList <String> magia=new ArrayList();

    public criaturas() {
    }

    public criaturas(String nombre, int energia, int mlife, String nregion, int vivos, int peso) {
        this.nombre = nombre;
        this.energia = energia;
        this.mlife = mlife;
        this.nregion = nregion;
        this.vivos = vivos;
        this.peso = peso;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEnergia() {
        return energia;
    }

    public void setEnergia(int energia) {
        this.energia = energia;
    }

    public int getMlife() {
        return mlife;
    }

    public void setMlife(int mlife) {
        this.mlife = mlife;
    }

    public String getNregion() {
        return nregion;
    }

    public void setNregion(String nregion) {
        this.nregion = nregion;
    }

    public int getVivos() {
        return vivos;
    }

    public void setVivos(int vivos) {
        this.vivos = vivos;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public ArrayList<String> getMagia() {
        return magia;
    }

    public void setMagia(ArrayList<String> magia) {
        this.magia = magia;
    }

    @Override
    public String toString() {
        return "criaturas: "+nombre + " vivos= " + vivos ;
    }

    
    
    
}
