
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

    public class AlugarMesa {

        public static void main(String[] args) {
            Scanner ler = new Scanner(System.in);


            ArrayList<String> agendamentoDeClientes = new ArrayList();

            agendamentoDeClientes.add("Juca Bala;85 99643-5671, Reserva 7, às 21h");
            agendamentoDeClientes.add("Marcos Paqueta;85 99782-1367, Reserva 10, às 19h");
            agendamentoDeClientes.add("Maria Antonieta;85 98563-8901, Reserva 5, às 20h");
            agendamentoDeClientes.add("Antônio Conselheiro;85 93453-5671,Reserva 2, às 18:30h");

            int i;


            System.out.printf("Percorrendo o ArrayList (usando o índice)\n");
            int n = agendamentoDeClientes.size();
            for (i = 0; i < n; i++) {
                System.out.printf("Agendamento %d- %s\n", i, agendamentoDeClientes.get(i));
            }

            System.out.printf("\nInforme a Agendamento a ser excluído:\n");
            i = ler.nextInt();

            try {

                agendamentoDeClientes.remove(i);
            } catch (IndexOutOfBoundsException e) {

                System.out.printf("\nErro: Agendamento inválido (%s).", e.getMessage());
            }


            System.out.printf("\nPercorrendo o ArrayList (usando for-each)\n");
            i = 0;
            for (String contato: agendamentoDeClientes) {
                System.out.printf("Agendamento %d- %s\n", i, contato);
                i++;
            }

        }

    }
