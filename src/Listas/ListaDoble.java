/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Listas;

/**
 *
 * @author A15216350
 */
public class ListaDoble extends ListaD {

    @Override
    public void insertaInicio(Object dato) {
        if(vacio())
            inicio = ultimo = new NodoDoble(dato);
        else{
            NodoDoble nuevo = new NodoDoble(dato, inicio, null);
            inicio.setAnterior(nuevo);
            inicio = nuevo;
        }
    }

    @Override
    public void insertaFinal(Object dato) {
        if (vacio())
            inicio = ultimo = new NodoDoble(dato);
        else{
            NodoDoble nuevo = new NodoDoble(dato, null, ultimo);
            ultimo.siguiente = nuevo;
            ultimo = nuevo;
        }
    }

    @Override
    public Object eliminaInicio() {
        Object eliminado = null;
        if (vacio()){
            System.out.println("lista vacia");
        }
        else{
            eliminado = inicio.getDato();
            if(inicio == ultimo)
                inicio = ultimo = null;
            else{
                inicio = inicio.getSiguiente();
                inicio.anterior = null;
            }            
        }
        return eliminado;
    }

    @Override
    public Object eliminaFinal() {
        Object eliminado = null;
        if(vacio())
            System.out.println("Lista vacía");
        else{
            eliminado = ultimo.getDato();
            if(inicio == ultimo)
                inicio = ultimo = null;
            else{
                ultimo = ultimo.anterior;
                ultimo.siguiente = null;
            }
        }
        return eliminado;
    }
    
    public static void main(String[] args) {
        ListaDoble listaD = new ListaDoble();
        listaD.insertaInicio(20);
        listaD.insertaInicio("perro");
        listaD.insertaInicio(25.3);
        listaD.insertaInicio("Hola");
        listaD.insertaFinal("nepe");
        listaD.eliminaInicio();
        System.out.println("Imprimiendo la lista normal...");
        listaD.imprimir();
        System.out.println("");
        System.out.println("Imprimiendo la lista en orden inverso");
        listaD.imprimirAlreves();
        System.out.println("Eliminando el ultimo elemento: " + listaD.eliminaFinal() + "\n");
        System.out.println("Imprimiendo la lista normal...");
        listaD.imprimir();
        System.out.println("");
        System.out.println("Imprimiendo la lista en orden inverso");
        listaD.imprimirAlreves();
    }
    
}
