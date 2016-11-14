/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

import java.util.LinkedList;

/**
 *
 * @author pared
 */
public class Cola {
    private LinkedList<String> cola;
    public Cola(){
        cola = new LinkedList();
    }
    
    public void agregar(String a){
        cola.addFirst(a);
    }
    public String sacar(){
        return cola.removeLast();
       
    }

    public LinkedList<String> getCola() {
        return cola;
    }

    public void setCola(LinkedList<String> cola) {
        this.cola = cola;
    }
}
