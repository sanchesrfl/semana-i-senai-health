package logica_de_programacao;
public class ExemploWhileLoop {
    public static void main(String[] args) {
        // Criando um array de nomes
        String[] nomes = {"Alice", "Bob", "Charlie", "David"};

        // Usando o while loop para percorrer o array e imprimir os valores
        System.out.println("Usando o while loop:");
        int indice = 0;
        while (indice < nomes.length) {
            System.out.println("Índice " + indice + ": " + nomes[indice]);
            indice++;
        }
    }
}
