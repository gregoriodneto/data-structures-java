package vetores;

/*
* Remover elemento no array exige deslocar os elementos à esquerda para preencher o espaço.
* Classificação O(n)
* */
public class Remover {
    public static void main(String args[]) {
        int[] numeros = {1, 2, 3, 4};
        remover(numeros, 2);
        imprimir(numeros);
    }

    /*
     * arr = [1, 2, 3, 4] ,
     * position = 2,
     * Ele começa na posição 3,
     * E vai subistituindo o valor atual pelo próximo.
     * No final vai ter um campo vazio que será preenchido pelo Zero
     * */
    public static int[] remover(int[] arr, int position) {
        for (int i = position; i < arr.length - 1; i++) {
            arr[i] = arr[i + 1];
        }
        arr[arr.length - 1] = 0;
        return arr;
    }

    public static void imprimir(int[] arr) {
        for (int value : arr) {
            System.out.println(value);
        }
    }
}
