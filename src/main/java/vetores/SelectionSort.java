package vetores;

/*
* Encontra o menor elemento e coloca no início, fazendo trocas diretas.
* Classificação O(n²)
* */
public class SelectionSort {
    public static void main(String args[]) {
        int[] numeros = {50, 10, 2, 3, 30, 90, 1, 0, 5};
        selectionSort(numeros);
        imprimir(numeros);
    }

    /*
     * O objetivo do Selection Sort é ordenar o array colocando os menores valores no início.
     * Para isso, ele percorre o array procurando o menor valor na parte ainda não ordenada.
     *
     * A cada iteração do índice "i", assumimos que o menor valor está na posição "i".
     * Então, com o laço interno (índice "j"), comparamos todos os elementos à frente de "i".
     * Se encontrarmos um valor menor que o atual mínimo (arr[index]), atualizamos "index".
     *
     * No final da iteração, trocamos o valor da posição "i" com o menor valor encontrado.
     * Isso garante que, a cada passo, o menor valor restante seja colocado na posição correta.
     */
    public static void selectionSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            int index = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[index]) {
                    index = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[index];
            arr[index] = temp;
        }
    }

    public static void imprimir(int[] arr) {
        for (int value : arr) {
            System.out.println(value);
        }
    }
}
