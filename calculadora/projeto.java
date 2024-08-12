/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package calculadora;

import java.util.Scanner;

/**
 *
 * @author pedro
 */
public class projeto {
    public static void main(String[] args) {
        new projeto();
    }
    
public projeto(){
    calculadora c1 = new calculadora();
    Scanner s = new Scanner(System.in);
    c1.num1 = s.nextInt();
    c1.num2 = s.nextInt();
    System.out.println("Soma = "+c1.somar());
    c1.subtrair(c1.num1, c1.num2);
    System.out.println("Subtrair = " + c1.resultado);
    c1.dividir();
    System.out.println("Dividir = " + c1.resultado);
    System.out.println("Multiplicar " + c1.multiplicar());
    
    
}
}
