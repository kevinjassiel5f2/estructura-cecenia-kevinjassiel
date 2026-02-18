 //que es la recursividad


 //técnica de programación y matemática donde una función se llama a sí misma para resolver un problema,
  //dividiéndolo en subproblemas más pequeños del mismo tipo. Se utiliza para simplificar algoritmos complejos, 
 //descomponiendo tareas hasta alcanzar un "caso base" que detiene la repetición y evita bucles infinitos

//recursividad fsctorial
//El factorial de un número entero positivo 

 X = 3 //Queremos 3!, por lo tanto X inicial es 3
X >= 2 -> return 3*factorial(2);
    X = 2 //Ahora estamos solicitando el factorial de 2
    X >= 2 -> return 2*factorial(1);
        X = 1 // Ahora estamos solicitando el factorial de 1
        X < 2 -> return 1;
        [En este punto tenemos el factorial de 1 por lo que volvemos marcha atrás resolviendo todos los resultados]
    return 2 [es decir: return 2*1 = return 2*factorial(1)]
return 6 [es decir: return 3*2 = return 3*factorial(2)*factorial(1)] // El resultado devuelto es 6

//ejemplo
//Ejemplo clásico: Factorial de un número (n!
//El factorial de es 5(5!) es 5*4*3*2*1=120
// caso recursivo n! n* (n-1)
3! = 3 × 2 × 1 = 6
0! = 1 (por definición)
factorial(5)
= 5 * factorial(4)
= 5 * (4 * factorial(3))
= 5 * (4 * (3 * factorial(2)))
= 5 * (4 * (3 * (2 * factorial(1))))
= 5 * 4 * 3 * 2 * 1
= 120


//Metodo factotial con recursividad 
//El cálculo del factorial 



public class RecursividadDirecta {
public static int fibonacci(int n) {

    // Casos base
    if (n == 0)
        return 0;

    if (n == 1)
        return 1;

    // Caso recursivo
    return fibonacci(n - 1) + fibonacci(n - 2);
}

    public class MultiplicacionRecursiva {

//ejercicio 1
    // función recursiva
    public static int multiplicar(int a, int b) {

        // caso base
        if (b == 0) {
            return 0;
        }

        // llamada recursiva (suma repetida)
        return a + multiplicar(a, b - 1);
    }

    public static void main(String[] args) {

        int num1 = 3;
        int num2 = 4;

        int resultado = multiplicar(num1, num2);

        System.out.println("Resultado: " + resultado);
    }
}
    //ejercicio  2
   public class SumaArregloRecursivo {

    public static int sumar(int[] arreglo, int n) {

        // caso base
        if (n == 0) {
            return 0;
        }

        // suma recursiva
        return arreglo[n - 1] + sumar(arreglo, n - 1);
    }

    public static void main(String[] args) {

        int[] numeros = {5, 10, 15, 20};

        int resultado = sumar(numeros, numeros.length);

        System.out.println("La suma es: " + resultado);
    }
}

    //ejercicio 3
public class NumeroParRecursivo {

    public static boolean esPar(int n) {

        // caso base
        if (n == 0) {
            return true;   // es par
        }

        if (n == 1) {
            return false;  // es impar
        }

        // llamada recursiva
        return esPar(n - 2);
    }

    public static void main(String[] args) {

        int numero = 6;

        if (esPar(numero)) {
            System.out.println("El número es PAR");
        } else {
            System.out.println("El número es IMPAR");
        }
    }
}
//ejercicio 4
public class Palindromo {

    public static boolean esPalindromo(String palabra, int inicio, int fin) {

        // caso base
        if (inicio >= fin) {
            return true;
        }

        // si las letras no coinciden
        if (palabra.charAt(inicio) != palabra.charAt(fin)) {
            return false;
        }

        // llamada recursiva
        return esPalindromo(palabra, inicio + 1, fin - 1);
    }

    public static void main(String[] args) {

        String palabra = "ana";

        if (esPalindromo(palabra, 0, palabra.length() - 1)) {
            System.out.println("Es palíndromo");
        } else {
            System.out.println("No es palíndromo");
        }
    }
}
//ejercicio 5
public class BuscarRecursivo {

    public static boolean buscar(int[] arreglo, int elemento, int indice) {

        // caso base: si llegamos al final
        if (indice == arreglo.length) {
            return false;
        }

        // si encontramos el elemento
        if (arreglo[indice] == elemento) {
            return true;
        }

        // llamada recursiva
        return buscar(arreglo, elemento, indice + 1);
    }

    public static void main(String[] args) {

        int[] numeros = {4, 8, 15, 20, 7};
        int valorBuscar = 15;

        if (buscar(numeros, valorBuscar, 0)) {
            System.out.println("Elemento encontrado");
        } else {
            System.out.println("Elemento no encontrado");
        }
    }
}
}