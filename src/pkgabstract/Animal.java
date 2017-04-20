/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkgabstract;

/**
 *
 * @author Estudiante
 */
public abstract class Animal {
    private int numLegs;
    
    public Animal(int numLegs){
        this.numLegs = numLegs;
    }

    public int getNumLegs() {
        return numLegs;
    }
    public abstract void hacerSonido();
    
}
