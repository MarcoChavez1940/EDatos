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
public class NodoPrioridad {
    
    protected int prioridad;
    protected Object dato;

    public NodoPrioridad(int prioridad, Object dato) {
        this.prioridad = prioridad;
        this.dato = dato;
    }

    /**
     * @return the prioridad
     */
    public int getPrioridad() {
        return prioridad;
    }

    /**
     * @param prioridad the prioridad to set
     */
    public void setPrioridad(int prioridad) {
        this.prioridad = prioridad;
    }

    /**
     * @return the dato
     */
    public Object getDato() {
        return dato;
    }

    /**
     * @param dato the dato to set
     */
    public void setDato(Object dato) {
        this.dato = dato;
    }

    @Override
    public String toString() {
        return "\nPrioridad: " + prioridad + "\nDato: " + dato;
    }
    
}
