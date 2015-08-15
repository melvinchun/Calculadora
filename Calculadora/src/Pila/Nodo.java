/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pila;


class Nodo {

    private String value;
    private Nodo next;

    public Nodo() {
        this.value = null;
        this.next = null;
    }
    
    public Nodo(String value) {
        this.value = value;
    }
    
    public Nodo(String value, Nodo next) {
        this.value = value;
        this.next = next;
    }
    
    public Nodo getNext(){
        return next;
    }
    
    public void setNext(Nodo nuevo){
        next=nuevo;
    }
    
    public String getValue(){
        return value;
    }
}
