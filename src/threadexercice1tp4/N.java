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
public class N {

    static int n = 1;
    static int synce = 1;
    static int ncarre;

    public N() {
    }

    public static synchronized boolean carre() {
        try {
            if (N.synce == 2) {
                System.out.println("calcul de  carre de =" + N.n);
                System.out.println("<<" + N.synce + ">>");
                N.ncarre = (N.n) * (N.n);
                N.synce = 3;
                return true;
            }

        } catch (Exception e) {
        }
        return false;
    }

    public static synchronized boolean increment() {
        try {
            if (N.synce == 1) {
                System.out.println(" incrementation de :" + N.n);
                System.out.println("<<" + N.synce + ">>");
                N.n += 1;
                N.synce = 2;
                return true;
            }

        } catch (Exception e) {
        }

        return false;

    }

    public static synchronized boolean affichage() {
        try {
            if (N.synce == 3) {
                System.out.println("<<" + N.synce + ">>");

                System.out.println("  n devient : " + N.n);
                System.out.println("la valeur de  ncarre est : " + N.ncarre);
                N.synce = 1;
                N.n += 1;
                return true;
            }

        } catch (Exception e) {
        }

        return false;

    }
}
