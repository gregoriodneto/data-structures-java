package vetores;

/*
* Compara pares adjacentes e troca se estiverem fora de ordem.
* Repetido várias vezes.
* Classificação O(n²)
* */
public class BubbleSort {
    public static void main(String args[]) {
        int[] numeros = {50, 10, 2, 3, 30, 90, 1, 0, 5};
        bubbleSort(numeros);
        imprimir(numeros);
    }

    /*
    * O "i" representa o número de passadas no array.
    * A cada passada o valor maior "sobe" para o final do array.
    * Então neste caso não precisa comparar até o final do array sempre,
    * Por isso o "j - 1 - i", que reduz o número de comparações com o "-i".
    * Caso esteja fora de ordem é feito a troca dos valores adjacentes dentro do "if"
    * */
    public static void bubbleSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    public static void imprimir(int[] arr) {
        for (int value : arr) {
            System.out.println(value);
        }
    }
}
