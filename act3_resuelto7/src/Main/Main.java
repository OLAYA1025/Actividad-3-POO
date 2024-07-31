package Main;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import interfaz.numeros;
import java.util.Scanner;
public class Main {
    public static void main(String args[]){
        numeros mayor = new numeros();
        Scanner entrada=new Scanner(System.in);
        mayor.setLocationRelativeTo(null);
        mayor.setAlwaysOnTop(true);
        mayor.setVisible(true);
        System.out.print("digite el numero: ");
        int numero=entrada.nextInt();
        if (numero==0){
            mayor.setVisible(false);
        }
        
        
        
        
        
        
    
    }
    
}
