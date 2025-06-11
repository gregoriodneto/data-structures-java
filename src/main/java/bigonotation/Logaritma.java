package bigonotation;

/*
* O(log n) - Logarítmica - O Algoritmo reduz o problema pela metade a cada passo.
* */
public class Logaritma {
    public static void main(String args[]) {
        int[] numeros = {10, 20, 30, 40, 50};
        System.out.println("Indice do número 30: " + buscaBinaria(numeros, 30));
    }

    static int buscaBinaria(int numeros[], int alvo) {
        int inicio = 0, fim = numeros.length - 1;

        while (inicio <= fim) {
            int meio = (inicio + fim) / 2;

            if (numeros[meio] == alvo) return meio;
            else if (numeros[meio] < alvo) inicio = meio + 1;
            else fim = meio - 1;
        }

        return -1;
    }
}
