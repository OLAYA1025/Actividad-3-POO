/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Main;

import javax.swing.JOptionPane;

/**
 *
 * @author Administrator
 */
public class TrianguloRectangulo {
    public double base; 
    public double altura; 

    public TrianguloRectangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    public double calcularArea() {
        return (base * altura / 2);
    }

    public double calcularPerimetro() {
        return (base + altura + calcularHipotenusa());
    }

    public double calcularHipotenusa() {
        return Math.sqrt((base * base) + (altura * altura));
    }

    public void determinarTipoTriangulo() {
        if (base == altura && base == calcularHipotenusa() && altura == calcularHipotenusa()){
            JOptionPane.showMessageDialog(null, "Es un triangulo equilatero "
                    , "Tipo de triangulo", JOptionPane.INFORMATION_MESSAGE);
        }
        else if (base != altura && base != calcularHipotenusa() && altura != calcularHipotenusa()){
            JOptionPane.showMessageDialog(null, "Es un triangulo escaleno "
                    , "Tipo de triangulo", JOptionPane.INFORMATION_MESSAGE); 
        }else{
            JOptionPane.showMessageDialog(null, "Es un triangulo isósceles "
                    , "Tipo de triangulo", JOptionPane.INFORMATION_MESSAGE);
        }
}
}
