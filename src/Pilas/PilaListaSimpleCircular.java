/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pilas;

import ListasCirculares.ListaSimpleCircular;

/**
 *
 * @author A15216350
 */
public class PilaListaSimpleCircular implements Pila {
    protected ListaSimpleCircular pilaLista;
    protected int cont;

    public PilaListaSimpleCircular() {
        pilaLista = new ListaSimpleCircular();
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
        PilaListaSimpleCircular pila = new PilaListaSimpleCircular();
        pila.push("h");
        pila.push("o");
        pila.push("l");
        pila.push("a");
        while(pila.size() != 0)
            System.out.println(pila.size() + " - " + pila.pop());
    }
    
}
