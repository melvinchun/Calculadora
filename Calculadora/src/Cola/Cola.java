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
public class Cola {

    private Nodo cola;

    public void queue(String value) {
        if (cola == null) {
            cola = new Nodo(value);
        } else {
            Nodo next = cola;
            while(next.next() != null){
                next = next.next();
            }
            next.setNext(new Nodo(value));
        }
    }

    public String unqueue() {
        String retorno = "No hay valores";
        if(cola != null){
           retorno = cola.getValue();
           cola = cola.next();
        }
        return retorno;
    }

    public String peek() {
        String retorno = "No hay valores";
        if(cola != null){
            retorno = cola.getValue();
        }
        return retorno;
    }

    public void print() {
        Nodo next = cola;
        String retorno = "VACIO!";
        if(next != null){
            retorno = "";
            while(next.next() != null){
                retorno += next.getValue() + ", ";
                next = next.next();
            }
            retorno += next.getValue();
        }
        System.out.println(retorno);
    }
}
