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
public class debug {
    public static void main(String[] args) {
        Cola cola = new Cola();
        cola.queue("1");
        cola.queue("2");
        cola.queue("yo");
        cola.queue("soy");
        cola.queue("cr4ck");
        cola.queue("programando xD");
        cola.print();
        cola.unqueue();
        cola.unqueue();
        System.out.println(cola.peek());
        cola.print();
    }
}
