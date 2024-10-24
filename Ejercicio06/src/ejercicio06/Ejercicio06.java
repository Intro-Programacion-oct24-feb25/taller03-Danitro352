/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio06;

/**
 *
 * @author utpl
 */
public class Ejercicio06 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       int var1 = 81;
       int var2 = 9;
       int var3 = 3;
       int var4 = 10;
       int var5 = 1;
       
       double division = ((Math.sqrt(var1)+ var2)/var3);
       boolean factor1 = (division == var2);
       boolean factor2 = (var4 > var5);
       boolean resultado = (factor1 && factor2);
       System.out.println(resultado);
    }
    
}
