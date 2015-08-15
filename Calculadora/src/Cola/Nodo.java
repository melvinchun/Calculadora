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
    private Nodo previous;

    public Nodo(Nodo nodo){
       previous = nodo.previous;
    }
    public Nodo(String value, Nodo next) {
        this.value = value;
        this.previous = next;
    }
    public Nodo(String value) {
        this.value = value;
        previous = null;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public Nodo getPrevious() {
        return previous;
    }

    public void setPrevious(Nodo next) {
        this.previous = next;
    }
}
