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
public class Threadexercice1TP4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     N n=new N();
        Increment i=new Increment(n);
      Carre  c =new Carre(n);
      Affiche a =new Affiche(n);
       i.start();
       a.start();
       c.start();
       
    //  while(i.isAlive() && a.isAlive() && c.isAlive())
     //   System.out.println("everything is alive");
    
     
    }
    
}
