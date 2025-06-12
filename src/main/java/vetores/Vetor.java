package vetores;

/*
* Vetor (ou array) é uma estrutura de dados estática,
* Tamanho fixo, que armazena uma sequência de elementos do MESMO tipo,
* Acessados por índice.
*
* Classificação O(1)
* */
public class Vetor {
    public static void main(String args[]) {
        int[] numeros = new int[10];
        numeros[0] = 10;
        System.out.println(numeros[0]);
    }
}
