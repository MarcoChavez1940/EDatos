/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pilas;

import Listas.ListaSimple;

/**
 *
 * @author A15216350
 */
public class PilaListaSimple implements Pila {

    protected ListaSimple pilaLista;
    protected int cont;

    public PilaListaSimple() {
        pilaLista = new ListaSimple();
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
        PilaListaSimple pila = new PilaListaSimple();
        pila.push("h");
        pila.push("o");
        pila.push("l");
        pila.push("a");
        while(!pila.isEmpty())
            System.out.println(pila.size() + " - " + pila.pop());
    }
    
}
