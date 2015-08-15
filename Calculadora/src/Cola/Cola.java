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
            Nodo temp = cola;
            Nodo temp2 = cola.getPrevious();
            do {
                if (temp2 == null) {
                    temp.setPrevious(new Nodo(value));
                    break;
                } else {
                    temp = temp2;
                    temp2 = temp.getPrevious();
                }
            } while (temp != null);
        }
    }

    public String unqueue() {
        String retorno = "No hay valores";
        if (cola == null) {
            //Alguna validacion
        } else {
            retorno = cola.getValue();
            Nodo temp = cola.getPrevious();
            cola = temp;
        }
        return retorno;
    }

    public String peek() {
        return cola.getValue();
    }

    public void print() {
        Nodo previous = cola;
        String retorno = "";
        do {
            retorno = previous.getValue() + " " + retorno;
            previous = previous.getPrevious();
        } while (previous != null);
        System.out.println(retorno);
    }
}
