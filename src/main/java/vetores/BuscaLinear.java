package vetores;

/*
* Buscando elemento de forma linear
* Classificação O(n)
* */
public class BuscaLinear {
    public static void main(String args[]) {
        int[] numeros = {1, 2, 3, 4};
        System.out.println("O número encontra-se na posição: " + busca(numeros, 3));
    }

    public static int busca(int[] arr, int value) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == value) return i;
        }
        return -1; // Não encontrado
    }
}
