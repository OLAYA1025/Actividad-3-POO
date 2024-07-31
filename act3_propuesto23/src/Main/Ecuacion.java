/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Main;

/**
 *
 * @author jeron
 */
import javax.swing.JOptionPane;

public class Ecuacion {
    double A;
    double B;
    double C;
    double discriminante;
    public Ecuacion(double A, double B, double C){
        this.A=A;
        this.B=B;
        this.C=C;
        this.discriminante=Math.pow(B, 2)-4*A*C;
        
    }

    public double getDiscriminante() {
        return discriminante;
    }
   
    
    public void CalcularSolucion(){
        if (A!=0){
            if (discriminante>0){
            double primeraSolucion=((-B)+Math.sqrt(discriminante))/(2*A);
            double segundaSolucion=((-B)-Math.sqrt(discriminante))/(2*A);
            JOptionPane.showMessageDialog(null, "solucion 1: "
                    +primeraSolucion+"\nsolucion 2: "+segundaSolucion, "Soluciones", JOptionPane.INFORMATION_MESSAGE);
        }
        else if(discriminante==0){
            double solucion = ((-B)+Math.sqrt(discriminante))/(2*A);
            JOptionPane.showMessageDialog(null, "La ecuacion tiene una unica solucion: "+solucion
                    , "Solucion", JOptionPane.INFORMATION_MESSAGE);
        }
        else{
            JOptionPane.showMessageDialog(null, "la ecuacion introducida no tiene solucion", "ERROR", JOptionPane.ERROR_MESSAGE);
        }
        }else{
           JOptionPane.showMessageDialog(null, "A no puede ser cero, por favor ingrese un"
                   + " valor diferente", "ERROR", JOptionPane.ERROR_MESSAGE); 
        }
        
    }
    
    }

