package bigonotation;

/*
* O(n²) - Quadrática - Geralmente aparece em algoritmos com dois loops aninhados
* */
public class Quadratica {
    public static void main(String args[]) {
        int[] numeros = {10, 20, 30, 40, 50};
        imprimirNumerosPares(numeros);
    }

    static void imprimirNumerosPares(int[] numeros) {
        for (int i = 0; i < numeros.length; i++) {
            for (int j = 0; j < numeros.length; j++) {
                System.out.println("(" + numeros[i] + ", " + numeros[j] + ")");
            }
        }
    }
}
