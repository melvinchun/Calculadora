/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listaenlazada;

/**
 *
 * @author guitartsword
 */
public class ListaEnlazada {
    private Nodo cabeza;
    private int size = 0;
    public ListaEnlazada() {
        cabeza = null;
    }
    public void insert(int value, int pos){
        if(pos == 0 && cabeza == null){
            cabeza = new Nodo(value);
        }else if(pos == 0){
            Nodo newCabeza = new Nodo(value, new Nodo(cabeza));
            cabeza = newCabeza;
        }else if(pos == 1){
            Nodo newNodo = new Nodo(value, cabeza.next());
            cabeza.setNext(newNodo);
        }
        Nodo next = cabeza;
        int lugar = 0;
        while(next.next() != null){
            lugar++;
            next = next.next();
            if(lugar == pos-1){
                Nodo newNodo = new Nodo(value, next.next());
                next.setNext(newNodo);
            }
        }
        /*
            next = new Nodo(next.next());
            System.out.println(next.getValue() + ", ");
        */
    }
    public void print(){
        System.out.println(cabeza.getValue() +", ");
        Nodo next = cabeza;
        while(next.next() != null){
            next = next.next();
            System.out.println(next.getValue() + ", ");
        }
    }
    public void delete(int pos){
        if(pos == 0){
            cabeza = cabeza.next();
        }else if(pos == 1){
            //Nodo newNodo = new Nodo(value, cabeza.next());
            cabeza.setNext(cabeza.next().next());
        }
        Nodo siguiente = cabeza;
        int lugar = 0;
        while(siguiente.next() != null){
            lugar++;
            siguiente = siguiente.next();
            if(lugar == pos-1){
                siguiente.setNext(siguiente.next().next());
            }
        }
    }
    public int getSize(){
        return size;
    }
    @Override
    public String toString(){
        String retVal = cabeza.getValue() + ", ";
        Nodo next = cabeza;
        while(next.next() != null){
            next = next.next();
            retVal += (next.getValue() + ", ");
        }
        return retVal;
    }
}