package pilas;

public class pilas {
    //Resumen sencillo
//La pila guarda números
//Cuando aparece un operador → calcula
//El resultado se vuelve a guardar
//Al final → queda un solo valor

//Una pila es una estructura de datos que funciona con el principio:

//LIFO (Last In, First Out)
//(el último en entrar es el primero en salir)

//Operaciones básicas:

//push → insertar
//pop → eliminar el último
//peek → ver el último sin eliminar

//Tipos de expresiones

//Antes de evaluar, hay 3 formas comunes:

//Infija: 3 + 5 (la normal)
//Postfija (Reverse Polish Notation): 3 5 +
//Prefija: + 3 5

//¿Cómo funciona el evaluador con pilas?
// Caso más común: evaluar expresión POSTFIJA
// Algoritmo
//Crear una pila vacía
//Recorrer la expresión:
//Si es número → push
//Si es operador (+ - * /):
//sacar (pop) dos números
//aplicar operación
//guardar resultado (push)

//Prioridad de operadores

//Cuando conviertes de infija a postfija:

//Operador	Prioridad
//* /	Alta
//+ -	Baja


//Ejemplo en pseudocódigo
//para cada elemento en expresion:
    //si es numero:
      //  push(pila, numero)
    //si es operador:
       // b = pop(pila)
       // a = pop(pila)
      //  resultado = a operador b
    //    push(pila, resultado)

//return pop(pila)

//Ejemplo 1:

//Expresión postfija:

//3 5 + 2 *
//Paso a paso:
//Paso	Acción	Pila
//1	push 3	[3]
//2	push 5	[3, 5]
//3	+ → 3+5=8	[8]
//4	push 2	[8, 2]
//5	* → 8*2=16	[16]

// Resultado: 16

}
