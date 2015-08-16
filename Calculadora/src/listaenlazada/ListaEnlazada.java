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
public class ListaEnlazada {

    private Nodo cabeza;

    public ListaEnlazada() {
        cabeza = null;
    }

    public void insert(Expresion value, int pos) {
        int cont = 0;
        Nodo temp = cabeza;
        boolean agrego = true;
        do {
            if (pos == 0 && cont == 0 && temp == null) {
                cabeza = new Nodo(value);
                agrego = false;
                temp = cabeza;
            } else if (pos == 0 && cont == 0) {
                cabeza = new Nodo(value, temp);
                agrego = false;
            } else if ((cont + 1) == pos) {
                Nodo temp2 = temp.next();
                temp.setNext(new Nodo(value, temp2));
                agrego = false;
            }
            cont++;
            temp = temp.next();
        } while (temp != null && agrego);
    }

    public void print() {
        if(cabeza !=null){
            Nodo siguiente = cabeza;
            while (siguiente.next() != null) {
                System.out.println(siguiente.getValue().getStandard() + ", ");
                siguiente = siguiente.next();
            }
            System.out.println(siguiente.getValue().getStandard());
        }else{
            System.out.println("VACIO!");
        }
    }

    public void delete(int pos) {
        if(getSize() == 1){
            cabeza = null;
        }else if (pos == 0 ) {
            cabeza = cabeza.next();
        } else if (pos == 1) {
            //Nodo newNodo = new Nodo(value, cabeza.next());
            cabeza.setNext(cabeza.next().next());
        }else{
            Nodo siguiente = cabeza;
            int lugar = 0;
            while (siguiente.next() != null) {
                lugar++;
                siguiente = siguiente.next();
                if (lugar == pos - 1) {
                    siguiente.setNext(siguiente.next().next());
                }
            }
        }
    }

    public Expresion get(int pos) {
        int cont = 0;
        Nodo temp = cabeza;
        Nodo retorno = null;
        boolean encontro = true;
        do {
            if (pos == cont) {
                retorno = temp;
                encontro = false;
            }
            cont++;
            temp = temp.next();
        } while (temp != null && encontro);
        if (encontro) {
            return null;
        } else {
            return retorno.getValue();
        }
    }

    public int getSize() {
        if (cabeza == null) {
            return 0;
        }
        int cont = 1;
        Nodo temp = cabeza;
        while(temp.next() != null) {
            cont++;
            temp = temp.next();
        }
        return cont;
    }
}
