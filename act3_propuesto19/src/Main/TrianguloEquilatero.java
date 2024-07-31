/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Main;


public class TrianguloEquilatero {
    double lado;
    public TrianguloEquilatero(double lado){
        this.lado=lado;
    }
    public double calcularArea(){
        double area=(lado*lado)/2;
        return area;
    }
    
    public double calcurarPerimetro(){
        double perimetro=lado*3;
        return perimetro;
    }
    public double calcularAltura(){
        double altura=Math.sqrt((lado*lado)+((lado/2)*(lado/2)));
        return altura;
    }
    
}
