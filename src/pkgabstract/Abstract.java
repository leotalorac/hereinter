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
public class Abstract {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Gato Cat = new Gato(4);
        Cat.hacerSonido();
        //pero no pueden haber instancias de una clase abstracta
        //Animal animal = Animal(4); ERROR
        
        Animal animal = new Gato(4);//polimorfismo
        animal.hacerSonido();
        
    }
    
}
