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
    private int size;
    private Nodo cola;
    
    public void queue(int value){
        if (cola == null) {
            cola = new Nodo(value);
        }else{
            Nodo newCola = new Nodo(value);
            newCola.setNext(cola);
            cola = newCola;
        }
    }
    public int unqueue(){
        int retValue = cola.getValue();
        cola = cola.next();
        return retValue;
    }
    public int peek(){
        return cola.getValue();
    }
    public void print(){
        System.out.println(cola.getValue() +", ");
        Nodo next = cola;
        while(next.next() != null){
            next = next.next();
            System.out.println(next.getValue() + ", ");
        }
    }
    
}
