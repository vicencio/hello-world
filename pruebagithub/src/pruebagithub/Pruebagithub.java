/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebagithub;

/**
 *
 * @author Usuario
 */
public class Pruebagithub {

    /**
     * @param args the command line arguments
     */
     public static void main(String[] args) {
        int aux = 0;
        int i=0;
        while(i<=5){
            aux = (int)(Math.random()*52 + 1);                                    
            System.out.print(aux + " ");
            i++;
            
        }
    }
}
