/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poligono;
import java.util.*;
/**
 *
 * @author enriq
 */
public class UsaFiguras {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner (System.in);
        //Rectángulo
        System.out.println ("Dime la base del rectángulo");
        double b = teclado.nextDouble();
        teclado.nextLine();
        System.out.println ("Dime la altura del rectángulo");
        double a = teclado.nextDouble();
        teclado.nextLine();
        Rectangulo r1 = new Rectangulo (b,a);
        
        System.out.println ("La base de r1 es : " +r1.getBase());
        System.out.println ("La altura de r1 es : " +r1.getAltura());
        System.out.println ("El area de r1 es :  "+ r1.calcArea());
        System.out.println ("El perímetro de r1 es: "+r1.calcPer());
        
        //Círculo
        System.out.println ("\nDime el radio del círculo");
        double r = teclado.nextDouble();
        teclado.nextLine();
        Circulo c1 = new Circulo (r);
        
        System.out.println(r1.toString());
        System.out.println (r1.getAltura());
        
        System.out.println ("\n\n--------Circulo------");
        System.out.println ("Radio: "+c1.getRadio());
        System.out.printf ("Pi: %.4f\n",c1.getPI());
        System.out.printf ("El area del circulo es:  %.4f\n", c1.calcArea());
        System.out.printf ("La longitud del circulo es:  %.4f\n", c1.calcLon());
        System.out.printf ("El volumen del circulo es:  %.4f\n", c1.calcVol());

    }

    
}
