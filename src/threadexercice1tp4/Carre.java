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
public class Carre extends Thread{
N n;

    public Carre(N n) {
        this.n = n;
    }

    @Override
    public void run() {
        try {
            if( n.carre())
            this.notifyAll();
      else 
          this.wait();
          
        } catch (Exception e) {
        }
    }
    
    
}
