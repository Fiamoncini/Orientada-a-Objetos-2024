/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package calculadora;

/**
 *
 * @author pedro
 */
public class calculadora {
    int num1;
    int num2;
    int resultado;
    
    
    public int somar(){
        return num1 + num2;
    }
    
    public void subtrair(int num1, int num2){
        resultado = num1 - num2;
}
    public void dividir(){
        resultado = num1 / num2;
    }

    public int multiplicar(){
        return num1 * num2;
    }
}