/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ListasCirculares;

import Listas.ListaD;
import Listas.NodoDoble;

/**
 *
 * @author A15216350
 */
public class ListaDobleCircular extends ListaD {

    @Override
    public void insertaInicio(Object dato) {
        if(vacio()){
            inicio = ultimo = new NodoDoble(dato);
            inicio.setSiguiente(inicio);
            inicio.setAnterior(ultimo);
        }
        else{
            NodoDoble nuevo = new NodoDoble(dato, inicio, ultimo);
            inicio.setAnterior(nuevo);
            inicio = nuevo;
            inicio.setAnterior(ultimo);
            ultimo.setSiguiente(inicio);
        }
    }

    @Override
    public void insertaFinal(Object dato) {
        if (vacio()){
            inicio = ultimo = new NodoDoble(dato);
            inicio.setSiguiente(inicio);
            inicio.setAnterior(ultimo);
        }
        else{
            NodoDoble nuevo = new NodoDoble(dato, inicio, ultimo);
            ultimo.setSiguiente(nuevo);
            ultimo = nuevo;
            ultimo.setSiguiente(inicio);
            inicio.setAnterior(ultimo);
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
            if(inicio == ultimo){
                inicio = ultimo = null;
            }
            else{
                inicio = inicio.getSiguiente();
                inicio.setAnterior(ultimo);
                ultimo.setSiguiente(inicio);
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
            if(inicio == ultimo){
                inicio = ultimo = null;
                ultimo.setSiguiente(inicio);
                inicio.setAnterior(ultimo);
            }
            else{
                ultimo = ultimo.getAnterior();
                ultimo.setSiguiente(inicio);
                inicio.setAnterior(ultimo);
            }
        }
        return eliminado;
    }
    
    @Override
    public void imprimir(){
        NodoDoble actual = inicio;
        do{
            System.out.print(actual.getDato() + " - ");
            actual = actual.getSiguiente();
        }while(actual != inicio);
        System.out.println("Regresa al inicio: " + inicio.getDato());
    }
    
    @Override
    public void imprimirAlreves(){
        NodoDoble actual = ultimo;
        do{
            System.out.print(actual.getDato() + " - ");
            actual = actual.getAnterior();
        }while(actual != ultimo);
        System.out.println("Regresa al final: " + ultimo.getDato());
    }
    
    public static void main(String[] args) {
        ListaDobleCircular listaD = new ListaDobleCircular();
        listaD.insertaInicio(20);
        listaD.insertaInicio("perro");
        listaD.insertaInicio(25.3);
        listaD.insertaInicio("Hola");
        
        listaD.imprimir();
        listaD.imprimirAlreves();
        System.out.println("");
        
        listaD.insertaFinal("nepe");
        listaD.insertaFinal("kappa");
        listaD.insertaFinal(76.55);
        
        listaD.imprimir();
        listaD.imprimirAlreves();
        System.out.println("");
        
        listaD.eliminaInicio();
        listaD.eliminaInicio();
        
        listaD.imprimir();
        listaD.imprimirAlreves();
        System.out.println("");
        
        listaD.eliminaFinal();
        listaD.eliminaFinal();
        
        listaD.imprimir();
        listaD.imprimirAlreves();
        System.out.println("");
    }
    
}
