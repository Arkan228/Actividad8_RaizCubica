/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package actividad8_cubo;

import java.util.Scanner;

/**
 *
 * @author omarmora
 */
public class Actividad8_Cubo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int num;
        Double raiz, x;
        Scanner leer= new Scanner(System.in);
        System.out.println("Introduzca el numero a evalular");
        num= leer.nextInt();
        raiz=Math.cbrt(num);
        x=raiz;
        while (x>=0)
        {
            if(x==0)
            {
                System.out.println("La raiz cubica de el numero "+num+" es "+raiz);
                System.exit(0);
            }
            else
            {
                x--;
            }
        }
       System.out.println("El numero "+num+" no cuenta con una raiz cubica entera, su raiz cubica es "+raiz);
    }
    
}
