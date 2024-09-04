/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_10_conversiones;

import java.util.Scanner;

/**
 *
 * @author chiri
 */
public class EVA1_10_CONVERSIONES {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Fahrenheit a Celsius
        double fahr, cent;
        Scanner captu = new Scanner (System.in);
        System.out.println("Captura los grados Fahrenheit:");
        fahr = captu.nextDouble();
        cent = (fahr - 32) / 1.8; //EXPRECIÓN
        System.out.println("°C = " + cent);
        
        //Celsius a Fahrenheit
        double cels, fah;
        System.out.println("Captura los grados Celsius:");
        cels = captu.nextDouble();
        fah = ((cels * 9) /5) + 32;
        System.out.println("F = " + fah);
        
        //Celsius a Kelvin
        double kelv, cel;
        System.out.println("Captura los grados Kelvin:");
        cel = captu.nextDouble();
        kelv = cel + 273.15;
        System.out.println("K = " + kelv);
        
        
        
        
        
        
        

        
        
        
        
        
    }
    
}
