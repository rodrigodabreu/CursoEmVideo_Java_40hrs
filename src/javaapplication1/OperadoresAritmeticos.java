//Trabalhando com operadores aritméticos

import java.util.Scanner;

public class OperadoresAritmeticos {
    public static void main(String args[]) {
      Scanner scanner = new Scanner(System.in);
      
    //Opção 1 - Aqui vou deixar a parte de interação com o usuário
/*      System.out.print("Digite um número: ");
            int x = scanner.nextInt();
        System.out.print("Digite outro número: ");
            int y = scanner.nextInt(); */
         
    //Opção 2 - Aqui vou fazer o programa gerar números aleatórios para alimentar o algoritmo
        double aleatorio1 = Math.random();
        double aleatorio2 = Math.random();
        System.out.println("Gerando números aleatórios entre 0 e 100...");
        int x = (int) Math.round (0 + aleatorio1*(100-0));
            System.out.println("Primeiro número gerado: " + x);
        int y = (int) Math.round (0 + aleatorio2*(100-0));
            System.out.println("Segundo número gerado: " + y);

    //Daqui a sequência de cálculos segue normal 
        int soma = x+y;
        float media = (x+y)/2;
        float divisao = x/y;
        float resultado = x%y;
        int multiplicacao = x*y;

        scanner.close();

      System.out.println("A soma dos dois números é igual a " + soma);
      System.out.printf("A média dos dois números é igual a %.1f \n", media);
      System.out.format("A divisao entre os dois números é %.1f \n", divisao);
      System.out.printf("O resto da divisão dos números é igual %.1f \n", resultado);
      System.out.println("O produto dos dois números é igual a " + multiplicacao);
      

//Trabalhando com operadores UNÁRIOS
        /*int numero = 4;
        int valor = 10 + --numero;
        System.out.println(valor);

//Trabalhando com operadores DE ATRIBUIÇÃO
        int x = 4;
        int y = 6;
        x += 2; // x = x+2
        y *= 7; // y = y*7
        System.out.println(x);
        System.out.println(y);*/
    }
}