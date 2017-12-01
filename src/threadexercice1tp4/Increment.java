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
public class Increment extends Thread{
  N n;

    public Increment(N n ) {
        this.n = n;
    }

    @Override
    public void run() {
        try {
             if(n.increment())
           this.notifyAll();
             else{
           this.wait();
                 System.out.println("waiting in increment");
             }
        System.out.println("ça marche thread incre");
        } catch (Exception e) {
        }
   }

    
}
