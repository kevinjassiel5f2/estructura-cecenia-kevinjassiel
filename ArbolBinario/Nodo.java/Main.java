public class Main {
    public static void main(String[] args) {
        ArbolBinario arbol = new ArbolBinario();

        arbol.insertar(10);
        arbol.insertar(5);
        arbol.insertar(15);
        arbol.insertar(3);
        arbol.insertar(7);

        System.out.println("Inorden:");
        arbol.inorden();

        System.out.println("Buscar 7: " + arbol.buscar(7));
    }
}