/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poligono;

/**
 *
 * @author enriq
 */
public class Circulo {
    //Atributos
    private double radio;
    private final double PI;
    //Métodos
    public Circulo() {
        this.radio=4.3;
        this.PI=Math.PI;
    }
    public Circulo(double radio) {
        this.radio = radio;
        this.PI = Math.PI;
    }  
    // Getter

    public double getPI() {
        return PI;
    }

    public double getRadio() {
        return radio;
    }
    
    //Setter
    public void setRadio(double radio) {
        this.radio = radio;
    }
    
    //Métodos propios
    
    public double calcLon ( ){
         double lon = 2 * PI * radio;
         return lon;
    }
    
    public double calcVol ( ){
         double vol =  (4/3)* PI * (Math.pow(radio, PI));
         return vol;
    }    
    
    public double calcArea ( ){
         double area = PI * (Math.pow(radio, 2));
         return area;
    }

    
    
    
}
