package vetores;

/*
* Pode ter a inserção feita de forma Manual ou Movendo os elementos
* Classificação O(n)
* */
public class Insercao {
    public static void main(String args[]) {
        int[] numeros = {1, 2, 3, 4, 0}; // No final o Zero representa espaço livre.
        inserir(numeros, 99, 2);
        imprimir(numeros);
    }

    static void inserir(int[] arr, int value, int position) {
        // Inserir o numero (value) na posição (position)
        int n = arr.length - 1;
        for (int i = n; i > position ; i--) {
            arr[i] = arr[i - 1]; // Deslocando para a direita
        }
        arr[position] = value;
    }

    static void imprimir(int[] arr) {
        for (int value : arr) {
            System.out.println(value);
        }
    }
}
