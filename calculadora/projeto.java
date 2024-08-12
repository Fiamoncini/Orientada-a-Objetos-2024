package calculadora;
import java.util.Scanner;

public class projeto {
    public static void main(String[] args) {
        new projeto();
    }
    
public projeto(){
    calculadora c1 = new calculadora();
    Scanner s = new Scanner(System.in);
    System.out.println("Digite o primeiro numero:");
    c1.num1 = s.nextInt();
    System.out.println("Digite o segundo numero:");
    c1.num2 = s.nextInt();
    System.out.println("Digite a operação que deseja: ");
    System.out.println("1 - Soma; ");
    System.out.println("2 - Subtrair; ");
    System.out.println("3 - Dividir; ");
    System.out.println("4 - Multiplicar; ");
    int num = s.nextInt();
    if (num == 1) {
        System.out.println("Soma = "+c1.somar());
    } else if(num == 2){
        System.out.println("Subtrair = " + c1.subtrair());
    } else if (num == 3){
        if (c1.num2 == 0) {
            System.out.println("Erro!");
        } else{
        System.out.println("Dividir = " + c1.dividir());
        }
    } else if (num == 4){
        System.out.println("Multiplicar " + c1.multiplicar());
    } else{
        System.out.println("Houve um erro! Tente Novamente!");
    }
}
}
