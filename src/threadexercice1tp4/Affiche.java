/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package threadexercice1tp4;

/**
 *
 * @author Lenovo
 */
 class Affiche extends Thread{
    
N n;

    public Affiche(N n) {
        this.n = n;
    }

    @Override
    public void run() {
        try {
            if( n.affichage())
           this.notifyAll();
                   else 
           this.wait();
         System.out.println("ça marche thread affichage");
                   } catch (Exception e) {
        }
 
        }
    
}
