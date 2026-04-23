public class Main {
    public static void main(String[] args) {
        ArbolBinario arbol = new ArbolBinario();

        arbol.insertar(10);
        arbol.insertar(5);
        arbol.insertar(15);
        arbol.insertar(3);
        arbol.insertar(7);

        System.out.println("Raíz: " + arbol.buscar(10));

        System.out.println("=== MÉTODOS DE BÚSQUEDA ===");

        System.out.println("Buscar 7: " + arbol.buscar(7));
        System.out.println("Buscar 20: " + arbol.buscar(20));

        ArbolBinario.Nodo nodo = arbol.buscarNodo(5);
        if (nodo != null) {
            System.out.println("Nodo encontrado: " + nodo.valor);
        }

        ArbolBinario.Nodo padre = arbol.buscarPadre(7);
        if (padre != null) {
            System.out.println("Padre de 7: " + padre.valor);
        }

        
        
        System.out.println("\nInorden:");
     arbol.inorden();

    System.out.println("\nÁrbol:");
     arbol.imprimirArbol();
    }
}