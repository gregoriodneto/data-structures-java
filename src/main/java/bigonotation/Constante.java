package bigonotation;

/*
* O(1) - Constante - Tempo de execução não cresce com o tamanho da entrada.
* */
public class Constante {
    public static void main(String args[]) {
        int[] numeros = {10, 20, 30, 40, 50};
        System.out.println("Terceiro Elemento: " + getElementoSelecionado(numeros, 3));
    }

    static int getElementoSelecionado(int[] numeros, int elemento) {
        return numeros[elemento]; // O(1)
    }
}
