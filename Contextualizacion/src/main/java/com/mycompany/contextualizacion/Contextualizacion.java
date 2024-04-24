
package com.mycompany.contextualizacion;
import java.util.Scanner;

public class Contextualizacion {         
     
        

    public static void main(String[] args) {
        System.out.println("hola mundo!");         
        Scanner scanner = new Scanner(System.in);
        
     
        
        System.out.print("Ingrese la cantidad de familias: ");
        int numFamilias = scanner.nextInt();
        
        double totalAgua = 0;
        double totalLuz = 0;
        double totalGas = 0;
        
        
        for (int i = 1; i <= numFamilias; i++) {
            System.out.println("\nFamilia " + i + ":");
            System.out.print("Ingrese el estrato de la familia (1, 2 o mayor): ");
            int estrato = scanner.nextInt();
            System.out.print("Ingrese el valor del agua: ");
            double valorAgua = scanner.nextDouble();
            System.out.print("Ingrese el valor de la luz: ");
            double valorLuz = scanner.nextDouble();
            System.out.print("Ingrese el valor del gas: ");
            double valorGas = scanner.nextDouble();
            
            
            double descuento;
        if (estrato == 1) {
            descuento = 0.2;
        } else if (estrato == 2) {
            descuento = 0.15;
        } else {
            descuento = 0.09;
        }             
        
        
            
             totalAgua += valorAgua * (1 - descuento);
            totalLuz += valorLuz * (1 - descuento);
            totalGas += valorGas * (1 - descuento);
        }
        
         System.out.println("\nTotal a pagar discriminado por servicio público:");
        System.out.println("Agua: " + totalAgua);
        System.out.println("Luz: " + totalLuz);
        System.out.println("Gas: " + totalGas);
                
        
        
       
        
    }
    
}

           

   