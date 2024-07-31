/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Main;

/**
 *
 * @author Administrator
 */
public class Circulo {
    private double radio;
    public Circulo(double radio){
        this.radio = radio;
    }
   public double calcularArea() {
    return Math.PI*Math.pow(radio,2);
    }
   public double calcularPerimetro() {
    return 2*Math.PI*radio;
    }
    
}
