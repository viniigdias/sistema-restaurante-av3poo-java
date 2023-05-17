import java.util.ArrayList;
import java.util.Scanner;

public class Caixa {

    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);

        ArrayList<String> abrirCaixa = new ArrayList();

        abrirCaixa.add("Abrir o Caixa para Adicionar o Dinheiro");
        abrirCaixa.add("Abrir o Caixa para Trocar Dinheiro");
        abrirCaixa.add("Fechar o Caixa");

        int i;

        // [ C ] mostrando os "n" contatos da agenda (usando o índice)
        // número de elementos da agenda: método size()
        System.out.printf("Percorrendo o ArrayList (usando o índice)\n");
        int n = abrirCaixa.size();
        for (i = 0; i < n; i++) {
            System.out.printf("Caixa %d- %s\n", i, abrirCaixa.get(i));
        }
        System.out.println("\nO que você deseja no Caixa?\n");
         i = ler.nextInt();
        try {
            System.out.printf("Caixa %d- %s\n", i, abrirCaixa.get(i));
        } catch (IndexOutOfBoundsException e) {
            // exceção lançada para indicar que um índice (i)
            // está fora do intervalo válido (de 0 até agenda.size()-1)
            System.out.printf("\nError: Caixa inválido (%s).", e.getMessage());
        }

    }

}
