import java.util.ArrayList;
import java.util.Scanner;

public class SistemaPedido {
    public static void main(String[] args) {
        // Definindo o cardápio
        String[] itens = {"Hamburguer", "Batata Frita", "Refrigerante"};
        double[] precos = {10.0, 5.0, 3.0};

        // Exibindo o cardápio
        System.out.println("Cardápio:");

        for (int i = 0; i < itens.length; i++) {
            System.out.println((i + 1) + ". " + itens[i] + " - R$ " + precos[i]);
        }

        // Solicitando o pedido
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> pedido = new ArrayList<>();

        int escolha;
        do {
            System.out.print("Escolha um item do cardápio (ou 0 para finalizar o pedido): ");
            escolha = scanner.nextInt();

            if (escolha >= 1 && escolha <= itens.length) {
                pedido.add(escolha);
            } else if (escolha != 0) {
                System.out.println("Opção inválida. Tente novamente.");
            }
        } while (escolha != 0);

        // Emitindo o recibo
        System.out.println("\nRecibo do Pedido:");

        double total = 0.0;
        for (int item : pedido) {
            System.out.println(itens[item - 1] + " - R$ " + precos[item - 1]);
            total += precos[item - 1];
        }

        System.out.println("\nTotal a pagar: R$ " + total);

        // Fechando o scanner
        scanner.close();
    }
}
