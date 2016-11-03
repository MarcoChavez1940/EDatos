/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pilas;

/**
 *
 * @author A15216350
 */
public class PilaArreglos implements Pila {

    protected int cont;
    Object arreglo[] = new Object[100];    

    @Override
    public void push(Object dato) {
        arreglo[cont] = dato;
        cont++;
    }

    @Override
    public Object pop() {
        Object A;
        if(arreglo[0] == null)
            return null;
        else{
            A = arreglo[cont];
            arreglo[cont] = null;
            cont--;
            return A;
        }
    }

    @Override
    public Object top() {
        if(arreglo[0] == null)
            return null;
        else
            return arreglo[cont];
    }

    @Override
    public int size() {
        return cont;
    }

    @Override
    public boolean isEmpty() {
        return arreglo[0] == null;
    }
    
    public static void main(String[] args) {
        PilaArreglos pila = new PilaArreglos();
        pila.push("h");
        pila.push("o");
        pila.push("l");
        pila.push("a");
        while(!pila.isEmpty())
            System.out.println(pila.size() + " - " + pila.pop());
    }
    
}
