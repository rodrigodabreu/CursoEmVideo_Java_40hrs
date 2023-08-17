// Trabalhando com a Estrutura Condicional do tipo ESCOLHA
import java.util.Scanner; // Chamando o scanner para inputs de informações

public class Switch {
    public static void main(String[] args) {
      Scanner tec = new Scanner(System.in); // Criando um método de entrada tec (teclado)
      System.out.print("Quantas pernas? ");
      int perna = tec.nextInt(); // A entrada do scanner tec fará o input de valor para a variável perna
      String tipo;
      System.out.print("Isso é um(a) ");
      
      // Aqui entra a estrutura condicional do tipo ESCOLHA
      switch (perna) {
          case 1:
              tipo = "Saci";
              break; // Sempre add um break após cada condição.
          case 2:
              tipo = "Bípede";
              break;
          case 3:
              tipo = "Tripé";
              break;
          case 4: 
              tipo = "Quadrúpede";
              break;
          case 6:
              tipo = "Inseto";
              break;
          case 8:
              tipo = "Aranha";
              break;
          default:
              tipo = "ET"; // O default é a última condição, geralmente ampla, e não precisa do break ao final
      }
    System.out.println(tipo);
  }
}
