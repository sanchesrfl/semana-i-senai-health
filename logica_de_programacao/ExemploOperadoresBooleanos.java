package logica_de_programacao;
public class ExemploOperadoresBooleanos {
    public static void main(String[] args) {
        // Exemplo de operadores booleanos (AND, OR, NOT)
        boolean a = true;
        boolean b = false;

        // AND lógico (&&)
        boolean resultadoAnd = a && b;
        System.out.println("AND lógico: " + resultadoAnd);

        // OR lógico (||)
        boolean resultadoOr = a || b;
        System.out.println("OR lógico: " + resultadoOr);

        // NOT lógico (!)
        boolean resultadoNotA = !a;
        boolean resultadoNotB = !b;
        System.out.println("NOT lógico para a: " + resultadoNotA);
        System.out.println("NOT lógico para b: " + resultadoNotB);
    }
}
