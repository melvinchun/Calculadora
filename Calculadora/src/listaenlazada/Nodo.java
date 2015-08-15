/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listaenlazada;

import Expresion.Expresion;

/**
 *
 * @author guitartsword
 */
public class Nodo {
    private Expresion value;
    private Nodo next;

    public Nodo(Nodo nodo){
       value = nodo.value;
       next = nodo.next;
    }
    public Nodo(Expresion value, Nodo next) {
        this.value = value;
        this.next = next;
    }

    public Nodo(Expresion value) {
        this.value = value;
        next = null;
    }

    public Expresion getValue() {
        return value;
    }

    public void setValue(Expresion value) {
        this.value = value;
    }

    public Nodo next() {
        return next;
    }

    public void setNext(Nodo next) {
        this.next = next;
    }
    
}
