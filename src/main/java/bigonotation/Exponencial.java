package bigonotation;

/*
*O (2^n) - Algoritmos que testam todas as possibilidades (Recursividade sem otimização)
* */
public class Exponencial {
    public static void main(String args[]) {
        int n = 5;
        System.out.println("Fibonacci: de " + n + ": " + fibonacci(5));
    }

    static int fibonacci(int n) {
        if (n <= 1) return n;
        return fibonacci(n - 1) + fibonacci(n - 2); // O(2^n)
    }
}
