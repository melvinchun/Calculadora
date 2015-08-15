/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pila;

public class Pila {

    private Nodo head;

    public Pila() {
        this.head = null;
    }

    public Pila(Nodo head) {
        this.head = head;
    }

    public Nodo getHead() {
        return head;
    }

    public void push(String value) {
        if (head == null) {
            head = new Nodo(value);
        } else {
            Nodo temp = head;
            head = new Nodo(value);
            head.setNext(temp);
        }
    }

    public String pop() {
        String retorno = "No hay elementos";
        if (head == null) {
        } else if (head.getNext() == null) {
            retorno = head.getValue();
            head=null;
        } else {
            retorno = head.getValue();
            Nodo temp = head.getNext();
            head = temp;
        }
        return retorno;
    }

}
