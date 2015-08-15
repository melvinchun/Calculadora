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
        cola.queue(5);
        cola.queue(8);
        cola.queue(9);
        cola.queue(-3);
        cola.queue(932);
        cola.unqueue();
        cola.peek();
        cola.unqueue();
    }
}
