/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejecutable;


public class Trabajador{
    String Codigo;
    String Nombre;
    double HorasTrabajadas;
    // este es el numero de horas trabajadas en el mes
    double ValorHora;
    double PorcRete;
    //porcentaje de retencion de fuente

    
    
    public Trabajador(String Codigo, String Nombre, double HorasTrabajadas, double
             ValorHora, double PorcRete){
        this.Codigo= Codigo;
        this.HorasTrabajadas= HorasTrabajadas;
        this.Nombre= Nombre;
        this.PorcRete= PorcRete;
        this.ValorHora= ValorHora;
    }
    
 
    public double salarioBruto(){
        double salarioBruto=ValorHora*HorasTrabajadas; 
        return salarioBruto;
    }
    public double salarioNeto(double salarioBruto){
        double salarioNeto=salarioBruto-(salarioBruto*PorcRete/100);
        return salarioNeto;
    
    }
    
}
