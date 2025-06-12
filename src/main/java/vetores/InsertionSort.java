package vetores;

/*
* Constrói o array ordenado inserindo um item por vez na posição correta.
* Classificação O(n²)
* */
public class InsertionSort {
    public static void main(String args[]) {
        int[] numeros = {50, 10, 2, 3, 30, 90, 1, 0, 5};
        insertionSort(numeros);
        imprimir(numeros);
    }

    /*
     * O objetivo do Insertion Sort é inserir cada elemento na posição correta da parte ordenada do array.
     * A cada iteração, selecionamos um valor (chamado de "key") na posição "i".
     * O índice "j" começa em "i - 1" e representa os elementos da parte já ordenada.
     *
     * No laço while, comparamos os elementos da parte ordenada com a "key".
     * Enquanto o valor na posição "j" for maior que a "key", deslocamos esse valor uma posição à frente.
     * Isso abre espaço para inserir a "key" na posição correta.
     *
     * Ao sair do while, a posição "j + 1" será o local correto para inserir a "key",
     * garantindo que a parte inicial do array (até o índice "i") esteja sempre ordenada.
    */
    public static void insertionSort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int key = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = key;
        }
    }

    public static void imprimir(int[] arr) {
        for (int value : arr) {
            System.out.println(value);
        }
    }
}
