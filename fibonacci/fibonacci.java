//El método Fibonacci puede referirse a distintas técnicas basadas en la sucesión de i,
//  una secuencia numérica muy famosa en matemáticas.
public static int fibonacci(int n) {

    // Casos base
    if (n == 0)
        return 0;

    if (n == 1)
        return 1;

    // Caso recursivo
    return fibonacci(n - 1) + fibonacci(n - 2);
    // Se trata de una secuencia infinita de números naturales; 
    // a partir del 0 y el 1, se van sumando a pares,
    //  de manera que cada número es igual a la suma de sus dos anteriores,
    //  de manera que: 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55…
}
