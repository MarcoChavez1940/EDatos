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
public abstract class ListaD extends Lista{
    
    protected NodoDoble inicio;
    protected NodoDoble ultimo;
    
    @Override
    public boolean vacio(){
        return inicio == null;
    }
    
    @Override
    public void imprimir(){
        NodoDoble actual = inicio;
        while(actual != null){
            System.out.print(actual.getDato() + " - ");
            actual = actual.getSiguiente();
        }
    }
    
    public void imprimirAlreves(){
        NodoDoble actual = ultimo;
        while(actual != null){
            System.out.print(actual.getDato() + " - ");
            actual = actual.getAnterior();
        }
    }

    /**
     * @return the inicio
     */
    public NodoDoble getInicio() {
        return inicio;
    }

    /**
     * @param inicio the inicio to set
     */
    public void setInicio(NodoDoble inicio) {
        this.inicio = inicio;
    }

    /**
     * @return the ultimo
     */
    public NodoDoble getUltimo() {
        return ultimo;
    }

    /**
     * @param ultimo the ultimo to set
     */
    public void setUltimo(NodoDoble ultimo) {
        this.ultimo = ultimo;
    }
    
    
    
}
