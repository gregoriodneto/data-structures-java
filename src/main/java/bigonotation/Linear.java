package bigonotation;

/*
* O(n) - Linear - Tempo cresce linearmente com o tamanho da entrada
* */
public class Linear {
    public static void main(String args[]) {
        int[] numeros = {10, 20, 30, 40, 50};
        System.out.println("Soma: " + somar(numeros));
    }

    static int somar(int[] numeros) {
        int soma = 0;
        for (int numero : numeros) {
            soma += numero; // O (n)
        }
        return soma;
    }
}
