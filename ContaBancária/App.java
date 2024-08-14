
import java.util.Scanner;

public class App {
    public App(){
        Scanner s = new Scanner(System.in);
        
        System.out.print("Numero: ");
        String numero = s.nextLine();
        System.out.print("Titular:");
        String titular = s.nextLine();
        
        ContaBancaria c1 = new ContaBancaria();
        c1.setNumero(numero);
        c1.setTitular(titular);
        
        System.out.print("Numero: ");
        numero = s.nextLine();
        System.out.print("Titular:");
        titular = s.nextLine();
        
        ContaBancaria c2 = new ContaBancaria();
        c2.setNumero(numero);
        c2.setTitular(titular);
        
        //a
        c1.depositar(1000);
        c1.depositar(700);
        
        //b
        c2.depositar(5000);
        
        //c
        c2.sacar(2000);
        
        //d
        c2.transferir(c1, 1800);
        
        //e
        System.out.println("C1: " + c1.getNumero());
        System.out.println("Titular: "+c1.getTitular());
        System.out.println("Saldo: R$"+c1.getSaldo());
        System.out.println("C2: " + c2.getNumero());
        System.out.println("Titular: "+c2.getTitular());
        System.out.println("Saldo: R$"+c2.getSaldo());
        s.close();
    }
    
    public static void main(String[] args) {
        new App();
    }
}
