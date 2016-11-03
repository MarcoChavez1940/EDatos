/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Colas;

import ListasCirculares.ListaDobleCircular;

/**
 *
 * @author A15216350
 */
public class ColaListaDobleCircular implements Queue{
    protected ListaDobleCircular lista;
    protected int cont;

    public ColaListaDobleCircular() {
        lista = new ListaDobleCircular();
        cont = 0;
    }

    @Override
    public void enqueue(Object dato) {
        lista.insertaFinal(dato);
        cont++;
    }

    @Override
    public Object dequeue() {
        if(!lista.vacio()){
            cont--;
            return lista.eliminaInicio();
        }
        return null;
    }

    @Override
    public int size() {
        return cont;
    }

    @Override
    public Object front() {
        if(!lista.vacio()){
            return lista.getInicio().getDato();
        }
        return null;
    }

    @Override
    public boolean isEmpty() {
        return lista.vacio();
    }
    
    public static void main(String[] args) {
        ColaListaDobleCircular cola = new ColaListaDobleCircular();
        cola.enqueue("Hola");
        cola.enqueue(336);
        cola.enqueue(25.78);
        cola.enqueue(true);
        do{
            System.out.print(cola.dequeue() + " -> ");
        }while(cola.size() != 0);
        //System.out.println(cola.front());
    }
}
