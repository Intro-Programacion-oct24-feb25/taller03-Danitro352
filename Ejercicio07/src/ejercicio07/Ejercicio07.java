/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio07;

/**
 *
 * @author utpl
 */
public class Ejercicio07 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       int var1 = 81;
       int var2 = 9;
       int var3 = 3;
       int var4 = 10;
       int var5 = 1;
       int var6 = 100;
       int var7 = 25;
       
       double division = ((Math.sqrt(var1)+ var2)/var3);
       boolean factor3 = ((var6/var7)>= Math.sqrt(var6));
       boolean factor1 = (division == var2);
       boolean factor2 = (var4 > var5);
       boolean or = (factor1 || factor2);
       boolean resultado = (or && factor3);
       
       System.out.println(resultado);
       
             
    }
    
}
