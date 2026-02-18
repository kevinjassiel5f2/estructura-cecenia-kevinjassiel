public class RecursividadDirecta {

    // =========================
    // EJERCICIO 0 - Fibonacci
    // =========================
    public static int fibonacci(int n) {

        // Casos base
        if (n == 0)
            return 0;

        if (n == 1)
            return 1;

        // Caso recursivo
        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    public static void main(String[] args) {

        System.out.println("Fibonacci(6): " + fibonacci(6));

        System.out.println("Multiplicación: " + MultiplicacionRecursiva.multiplicar(3, 4));

        int[] numeros = {5, 10, 15, 20};
        System.out.println("Suma arreglo: " + SumaArregloRecursivo.sumar(numeros, numeros.length));

        System.out.println("¿6 es par?: " + NumeroParRecursivo.esPar(6));

        System.out.println("¿'ana' es palíndromo?: " +
                Palindromo.esPalindromo("ana", 0, "ana".length() - 1));

        int[] buscarArray = {4, 8, 15, 20, 7};
        System.out.println("¿15 está en el arreglo?: " +
                BuscarRecursivo.buscar(buscarArray, 15, 0));
    }
}

// =========================
// EJERCICIO 1 - Multiplicación
// =========================
class MultiplicacionRecursiva {

    public static int multiplicar(int a, int b) {

        if (b == 0)
            return 0;

        return a + multiplicar(a, b - 1);
    }
}

// =========================
// EJERCICIO 2 - Suma arreglo
// =========================
class SumaArregloRecursivo {

    public static int sumar(int[] arreglo, int n) {

        if (n == 0)
            return 0;

        return arreglo[n - 1] + sumar(arreglo, n - 1);
    }
}

// =========================
// EJERCICIO 3 - Número Par
// =========================
class NumeroParRecursivo {

    public static boolean esPar(int n) {

        if (n == 0)
            return true;

        if (n == 1)
            return false;

        return esPar(n - 2);
    }
}

// =========================
// EJERCICIO 4 - Palíndromo
// =========================
class Palindromo {

    public static boolean esPalindromo(String palabra, int inicio, int fin) {

        if (inicio >= fin)
            return true;

        if (palabra.charAt(inicio) != palabra.charAt(fin))
            return false;

        return esPalindromo(palabra, inicio + 1, fin - 1);
    }
}

// =========================
// EJERCICIO 5 - Buscar elemento
// =========================
class BuscarRecursivo {

    public static boolean buscar(int[] arreglo, int elemento, int indice) {

        if (indice == arreglo.length)
            return false;

        if (arreglo[indice] == elemento)
            return true;

        return buscar(arreglo, elemento, indice + 1);
    }
}
