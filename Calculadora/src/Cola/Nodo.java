/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Cola;

/**
 *
 * @author guitartsword
 */
class Nodo {
    private String value;
    private Nodo next;

    public Nodo(Nodo nodo){
       next = nodo.next;
    }
    public Nodo(String value, Nodo next) {
        this.value = value;
        this.next = next;
    }
    public Nodo(String value) {
        this.value = value;
        next = null;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public Nodo next() {
        return next;
    }

    public void setNext(Nodo next) {
        this.next = next;
    }
}
