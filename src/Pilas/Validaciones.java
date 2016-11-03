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
public class Validaciones {
    
    public boolean validaParentesis(String cadena){
        PilaListaSimple pila = new PilaListaSimple();
        boolean valido = true;
        for(int i = 0; i < cadena.length() && valido; i++){
            if(cadena.charAt(i) == '(')
                pila.push('(');
            else 
                if (!pila.isEmpty())
                    pila.pop();
                else
                    valido = false;
        }
        return valido && pila.isEmpty();
    }
    
    public boolean validaPalindromo(String cadena){
        PilaListaSimple pila = new PilaListaSimple();
        boolean valido = true;
        int mitad = cadena.length()/2;
        int aux;

        if(cadena.length() % 2 == 0){
            aux = 0;
        }else{
            aux = 1;
        }

        for(int i = 0; i < mitad; i++){
            pila.push(cadena.charAt(i));
        }

        for(int j = mitad + aux; j < cadena.length() && valido; j++){
            if((char)pila.top() == cadena.charAt(j)){
                pila.pop();
            }else{ 
                valido = false;
            }
        }

        return valido && pila.isEmpty();
    }
    
    public static void main(String[] args) {
        Validaciones valida = new Validaciones();
        if (valida.validaParentesis("(())"))
            System.out.println("Cadena válida");
        else
            System.out.println("Cadena inválida");
    }
    
}
