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
public class ListaSimple extends Lista {

    @Override
    public void insertaInicio(Object dato) {
        if (vacio())
            inicio = ultimo = new Nodo(dato);
        else{
            inicio = new Nodo(dato, inicio);
        }
    }

    @Override
    public void insertaFinal(Object dato) {
        if (vacio())
            inicio = ultimo = new Nodo(dato);
        else{
            Nodo temp = new Nodo(dato);
            ultimo.setSiguiente(temp);
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
            if (eliminar.siguiente == ultimo){
                ultimo = eliminar;
                eliminar.siguiente = null;
                return 0;
            }
            eliminar = eliminar.siguiente;
        }
        return eliminar;
    }
    
    public Object get(int index){
        Nodo aux = inicio;
        int cont = 0;
        Object dato = null;
        while(aux != null){
                if (index == cont){
                    dato = aux.getDato();
                }
                aux = aux.getSiguiente();
                cont++;
            }
        return dato;
    }
    
    public void insertaOrdenado(int dato){
        if(vacio())
            insertaInicio(dato);
        else
            if(inicio == ultimo){// solo hay un nodo en la lista
                if(dato < (Integer)inicio.getDato())
                    insertaInicio(dato);
                else
                    insertaFinal(dato);
            }else{ //la lista contiene mas de un elemento
                Nodo antes = null, despues = inicio;   
                while(despues != null && dato > (Integer)despues.getDato()){
                    antes = despues;
                    despues = despues.getSiguiente();
                }
                if(antes ==  null)
                    insertaInicio(dato);
                else
                    if(despues == null)
                        insertaFinal(dato);
                    else{
                        Nodo nuevo = new Nodo(dato, despues);
                        antes.setSiguiente(nuevo); 
                    }
            }
        }
    
    public void insertaOrdenadoAlumnos(Alumno alumno){
        if(vacio())
            insertaInicio(alumno);
        else
            if(inicio == ultimo){// solo hay un nodo en la lista
                if(alumno.getEdad() < ((Alumno)inicio.getDato()).getEdad())
                    insertaInicio(alumno);
                else
                    insertaFinal(alumno);
            }else{ //la lista contiene mas de un elemento
                Nodo antes = null, despues = inicio;   
                while(despues != null && alumno.getEdad() > ((Alumno)inicio.getDato()).getEdad()){
                    antes = despues;
                    despues = despues.getSiguiente();
                }
                if(antes ==  null)
                    insertaInicio(alumno);
                else
                    if(despues == null)
                        insertaFinal(alumno);
                    else{
                        Nodo nuevo = new Nodo(alumno, despues);
                        antes.setSiguiente(nuevo); 
                    }
            }
    }
    
    public static void main(String[] args) {
        ListaSimple lista = new ListaSimple();
        ListaSimple lista2 = new ListaSimple();
        Alumno alumno1 = new Alumno("Pancho", "Pantera", 10);
        Alumno alumno2 = new Alumno("Pepe", "Pepon", 75);
        Alumno alumno3 = new Alumno("Elver", "Galarga", 55);
        Alumno alumno4 = new Alumno("Empanada", "Grasienta", 8);
        /*lista.insertaOrdenado(123);
        lista.insertaOrdenado(5876983);
        lista.insertaOrdenado(7809);
        lista.insertaOrdenado(0);
        System.out.println("\n\n\n");*/
        lista2.insertaOrdenadoAlumnos(alumno1);
        lista2.insertaOrdenadoAlumnos(alumno2);
        lista2.insertaOrdenadoAlumnos(alumno3);
        lista2.insertaOrdenadoAlumnos(alumno4);
        /*lista.insertaInicio(25);
        lista.insertaInicio("Perro");
        lista.insertaInicio(256.3);
        lista.insertaInicio('f');
        lista.insertaFinal("casa");
        lista.eliminaInicio();
        System.out.println(lista.get(4));*/
        lista2.imprimir();
        
    }
    
}
