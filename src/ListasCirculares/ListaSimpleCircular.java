/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ListasCirculares;

import Listas.Lista;
import Listas.Nodo;

/**
 *
 * @author A15216350
 */
public class ListaSimpleCircular extends Lista {

    @Override
    public void insertaInicio(Object dato) {
        if (vacio()){
            inicio = ultimo = new Nodo(dato);
            ultimo.setSiguiente(inicio);
        }
        else{
            inicio = new Nodo(dato, inicio);
            ultimo.setSiguiente(inicio);
        }
    }

    @Override
    public void insertaFinal(Object dato) {
        if (vacio()){
            inicio = ultimo = new Nodo(dato);
            ultimo.setSiguiente(inicio);
        }
        else{
            Nodo temp = new Nodo(dato, inicio);
            ultimo.setSiguiente(temp);
            temp.setSiguiente(inicio);
            ultimo = temp;
        }
    }

    @Override
    public Object eliminaInicio() {
        Object eliminado;
        if (vacio())
            eliminado = null;
        else{
            eliminado = inicio.getDato();
            inicio = inicio.getSiguiente();
        }
        return eliminado;
    }

    @Override
    public Object eliminaFinal() {
        Nodo eliminar = inicio;
        if(vacio())
            eliminar = null;
        while(eliminar != null){
            if (eliminar.getSiguiente() == ultimo){
                eliminar.setSiguiente(inicio);
                ultimo = eliminar;
                return 0;
            }
            eliminar = eliminar.getSiguiente();
        }
        return eliminar;
    }
    
    @Override
    public void imprimir(){
        Nodo actual = inicio;
        do{
            System.out.print(actual.getDato() + " -> ");
            actual = actual.getSiguiente();
        }while (actual != inicio);
        System.out.println("Regresa al inicio: " + inicio.getDato());
    }
    
    public static void main(String[] args) {
        ListaSimpleCircular lista = new ListaSimpleCircular();
        lista.insertaInicio(25);
        lista.insertaInicio("Perro");
        lista.insertaInicio(256.3);
        lista.insertaInicio('f');
        lista.insertaFinal("casa");
        lista.eliminaInicio();
        lista.imprimir();
    }
    
}
