import java.util.Scanner;

public class SomaDoisNumeros {
    public static void main(String args[]) {
        Scanner scanner = new Scanner (System.in);
    
    System.out.print("Digite um número: ");
    int n1 = scanner.nextInt();
    
    System.out.print("Digite outro número: ");
    int n2 = scanner.nextInt();
    
    int s = n1 + n2;
    
    System.out.println("O resultado da soma dos dois números é: " + s);
    
    
    scanner.close();
    }
}
