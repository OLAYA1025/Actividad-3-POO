/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Main;

/**
 *
 * @author jeron
 */
public class Empleado {
    String Nombre;
    double Vhora;
    double Nhoras;
    
    public Empleado(String Nombre, double Vhora, double Nhoras){
        this.Nombre=Nombre;
        this.Vhora=Vhora;
        this.Nhoras=Nhoras;
    }
    public String getNombre() {
        return Nombre;
    }
    
    public double CalcularSalario(){
        double salarioMensual=Vhora*Nhoras;
        return salarioMensual;
    }
    //preguntamos si el salario es mayor a 450000$
    public boolean Mayor450000(double salarioMensual){
        if (salarioMensual>450000){
            return true;
        }
        else{
            return false;
        }
    }
    

    
}
