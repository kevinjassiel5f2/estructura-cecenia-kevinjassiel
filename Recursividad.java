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