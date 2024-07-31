/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Main;

/**
 *
 * @author jeron
 */
public class Estudiante {
    String NumeroInscripcion;
    String Nombre;
    double Patrimonio;
    int Estrato;

    public Estudiante(String NumeroInscripcion, String Nombre, double Patrimonio, int Estrato) {
        this.NumeroInscripcion = NumeroInscripcion;
        this.Nombre = Nombre;
        this.Patrimonio = Patrimonio;
        this.Estrato = Estrato;
    }
    public double CalcularMatricula(){
        double valorMatricula=50000;
        if (Patrimonio>2000000 && Estrato>3){
            valorMatricula+=Patrimonio*0.03;
    }
        return valorMatricula;
       
    }
    
}
