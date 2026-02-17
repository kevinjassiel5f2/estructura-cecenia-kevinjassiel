public class pila{
    //que es pila
    
    //Una pila (stack) en programación es una estructura de datos lineal que sigue el principio
     //LIFO (Last In, First Out - último en entrar, primero en salir). Los elementos se añaden 
     //y eliminan por un solo extremo llamado "tope" o "cima".
     //Es fundamental para gestionar procesos, recursividad, y la funcionalidad "deshacer" en aplicaciones. 

     //apilar (push), que coloca un objeto en la pila, y su operación inversa, retirar (o desapilar, pop),
      //que retira el último elemento apilado.

//La operación retirar permite la obtención de este elemento, que es retirado de la pila permitiendo el acceso
 //al anterior (apilado con anterioridad), que pasa a ser el último, el nuevo TOS.


 //Operaciones básicas de una pila:

push() → Agrega elemento

pop() → Elimina el último

peek() → Mira el último

isEmpty() → Verifica si está vacía

//Ejemplo básico: Agregar y quitar elementos
public class PilaBasica {
    public static void main(String[] args) {

        Stack<String> pila = new Stack<>();

        // Agregar elementos
        pila.push("A");
        pila.push("B");
        pila.push("C");

        System.out.println("Pila: " + pila);

        // Quitar elemento
        pila.pop();

        System.out.println("Después de pop: " + pila);
    }
//Ver el elemento de arriba (peek)
import java.util.Stack;

public class VerCima {
    public static void main(String[] args) {

        Stack<Integer> pila = new Stack<>();

        pila.push(5);
        pila.push(10);

        System.out.println("Elemento arriba: " + pila.peek());
    }
}
}
//Verificar si la pila está vacía
import java.util.Stack;

public class PilaVacia {
    public static void main(String[] args) {

        Stack<Integer> pila = new Stack<>();

        System.out.println(pila.isEmpty()); // true

        pila.push(1);

        System.out.println(pila.isEmpty()); // false
    }
}

}

