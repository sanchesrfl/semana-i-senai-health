package logica_de_programacao;
public class ExemploForLoop {
    public static void main(String[] args) {
        // Criando um array de números
        int[] numeros = {1, 2, 3, 4, 5};

        // Usando o for loop para percorrer o array e imprimir os valores
        System.out.println("Usando o for loop:");
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Índice " + i + ": " + numeros[i]);
        }
    }
}
