package bigonotation;

public class EstudyBigONotation {
    public static void main( String args[] ) {
        int[] numeros = {1, 2, 3, 4};
        int n = 3;
        constante(numeros);
        linear(numeros);
        int busca = buscaBinaria(numeros, 3);
        System.out.println("Logarítmica: " + busca);
        quadratica(n);
    }

    /*
    * A complexidade de Algoritmos mede quanto tempo ou memória ele consome,
    * conforme a entrada de dados.
    * */

    // O(1) - Constante - Tempo de execução não cresce com o tamanho da entrada.
    static void constante(int[] numeros) {
        System.out.println("Constante: " + numeros[2]);
    }

    // O(n) - Linear - Tempo cresce linearmente com o tamanho da entrada
    static void linear(int[] numeros) {
        System.out.println("Linear: ");
        for (int numero : numeros) {
            System.out.println(numero);
        }
    }

    // O(log n) - Logarítmica - O Algoritmo reduz o problema pela metade a cada passo.
    static int buscaBinaria(int[] arr, int alvo) {
        int inicio = 0, fim = arr.length - 1;

        while (inicio <= fim) {
            int meio = (inicio + fim) / 2;

            if (arr[meio] == alvo) return meio;
            else if (arr[meio] < alvo) inicio = meio + 1;
            else fim = meio - 1;
        }

        return -1;
    }

    // O(n²) - Quadrática - Geralmente aparece em algoritmos com dois loops aninhados
    static void quadratica(int n) {
        System.out.println("Quadratica: ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.println(i + " - " + j); // O(1)
            }
        }
    }

    /*
    * O (n log n) - Algoritmos eficientes de ordenação (Merge Sort, Quick Sort)
    * O (2^n) - Algoritmos que testam todas as possibilidades (Recursividade sem otimização)
    * O (n!) - Algoritmos de permutação, como em problemas de força bruta (problema do caixeiro viajante)
    * */
}
