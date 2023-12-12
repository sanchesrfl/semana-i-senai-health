import java.util.Scanner;

public class InserirNumerosNoArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Pedindo ao usuário para inserir o tamanho do array
        System.out.print("Digite o tamanho do array: ");
        int tamanhoArray = scanner.nextInt();

        // Criando um array com o tamanho informado pelo usuário
        int[] numeros = new int[tamanhoArray];

        // Usando o for loop para inserir números no array
        for (int i = 0; i < tamanhoArray; i++) {
            System.out.print("Digite o número para a posição " + i + ": ");
            numeros[i] = scanner.nextInt();
        }

        // Exibindo os números inseridos no array
        System.out.println("Números no array:");
        for (int i = 0; i < tamanhoArray; i++) {
            System.out.println("Posição " + i + ": " + numeros[i]);
        }

        scanner.close();
    }
}
