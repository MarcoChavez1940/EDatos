/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pilas;

import ListasCirculares.ListaDobleCircular;

/**
 *
 * @author A15216350
 */
public class PilaListaDobleCircular implements Pila {
    protected ListaDobleCircular pilaLista;
    protected int cont;

    public PilaListaDobleCircular() {
        pilaLista = new ListaDobleCircular();
    }
    
    
    
    @Override
    public void push(Object dato) {
        pilaLista.insertaInicio(dato);
        cont++;
    }

    @Override
    public Object pop() {
        if(pilaLista.vacio())
            return null;
        else{
            cont--;
            return pilaLista.eliminaInicio();
        }
    }

    @Override
    public Object top() {
        if(pilaLista.vacio())
            return null;
        else
            return pilaLista.getInicio().getDato();
    }

    @Override
    public int size() {
        return cont;
    }

    @Override
    public boolean isEmpty() {
        return pilaLista.vacio();
    }
    
    public static void main(String[] args) {
        PilaListaDobleCircular pila = new PilaListaDobleCircular();
        pila.push("h");
        pila.push("o");
        pila.push("l");
        pila.push("a");
        while(pila.size() != 0)
            System.out.println(pila.size() + " - " + pila.pop());
    }
}
