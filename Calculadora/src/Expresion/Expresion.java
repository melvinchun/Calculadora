/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Expresion;

/**
 *
 * @author Brenda
 */
public class Expresion {

    private String standard;
    private String postfija;
    private int resultado;

    public Expresion() {
        this.standard = null;
        this.postfija = null;
        this.resultado = 0;
    }

    public Expresion(String standard) {
        this.standard = standard;
        this.postfija = null;
        this.resultado = 0;
    }

    public Expresion(String standard, String postfija, int resultado) {
        this.standard = standard;
        this.postfija = postfija;
        this.resultado = resultado;
    }

    public String getStandard() {
        return standard;
    }

    public void setStandard(String standard) {
        this.standard = standard;
    }

    public String getPostfija() {
        return postfija;
    }

    public void setPostfija(String postfija) {
        this.postfija = postfija;
    }

    public int getResultado() {
        return resultado;
    }

    public void setResultado(int resultado) {
        this.resultado = resultado;
    }

}
