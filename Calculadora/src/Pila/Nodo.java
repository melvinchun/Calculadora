/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pila;
/**
 *
 * @author guitartsword
 */
class Nodo {
    private int value;
    private Nodo next;
    private Nodo previous;

    public Nodo(Nodo nodo){
       value = nodo.value;
       next = nodo.next;
    }
    public Nodo(int value, Nodo next, Nodo previous) {
        this.value = value;
        this.next = next;
        this.previous = previous;
    }
    public Nodo(int value, Nodo next) {
        this.value = value;
        this.next = next;
    }
    public Nodo(int value) {
        this.value = value;
        next = null;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public Nodo next() {
        return next;
    }

    public void setNext(Nodo next) {
        this.next = next;
    }
    
    public Nodo previous() {
        return previous;
    }

    public void setPrevious(Nodo next) {
        this.previous = next;
    }
}
