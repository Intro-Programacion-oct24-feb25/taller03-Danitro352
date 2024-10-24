/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio08;

/**
 *
 * @author utpl
 */
public class Ejercicio08 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int var1 = 10;
        int var2 = 9;
        int var3 = 20;
        int var4 = 500;
        int var5 = 2;
        int var6 = 3;
        int var7 = 200;
        int var8 = 50;
        int var9 = 51;
        
        double parentesis1 = ((var1 * var2)+ var3 - (var4/var5)+ Math.pow(var6,var5));
        boolean factor1 = (parentesis1 >= var7);
        boolean factor2 = (var8 >= var8 - var8 + var9);
        boolean resultado = (factor1 || factor2); 
        System.out.println(resultado);
                
              
    }
    
}
