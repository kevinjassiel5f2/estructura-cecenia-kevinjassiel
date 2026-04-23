class ArbolBinario {

    // 🌱 Clase Nodo
    class Nodo {
        int valor;
        Nodo izquierdo, derecho;

        public Nodo(int valor) {
            this.valor = valor;
            izquierdo = null;
            derecho = null;
        }
    }

    private Nodo raiz;

    // Constructor
    public ArbolBinario() {
        raiz = null;
    }

    // Insertar
    public void insertar(int valor) {
        raiz = insertarRec(raiz, valor);
    }

    private Nodo insertarRec(Nodo actual, int valor) {
        if (actual == null) {
            return new Nodo(valor);
        }

        if (valor < actual.valor) {
            actual.izquierdo = insertarRec(actual.izquierdo, valor);
        } else if (valor > actual.valor) {
            actual.derecho = insertarRec(actual.derecho, valor);
        }

        return actual;
    }

    //  Buscar (true/false)
    public boolean buscar(int valor) {
        return buscarRec(raiz, valor);
    }

    private boolean buscarRec(Nodo actual, int valor) {
        if (actual == null) return false;

        if (valor == actual.valor) return true;

        if (valor < actual.valor) {
            return buscarRec(actual.izquierdo, valor);
        } else {
            return buscarRec(actual.derecho, valor);
        }
    }

    // Buscar nodo
    public Nodo buscarNodo(int valor) {
        return buscarNodoRec(raiz, valor);
    }

    private Nodo buscarNodoRec(Nodo actual, int valor) {
        if (actual == null || actual.valor == valor) {
            return actual;
        }

        if (valor < actual.valor) {
            return buscarNodoRec(actual.izquierdo, valor);
        } else {
            return buscarNodoRec(actual.derecho, valor);
        }
    }

    // Buscar padre
    public Nodo buscarPadre(int valor) {
        return buscarPadreRec(raiz, null, valor);
    }

    private Nodo buscarPadreRec(Nodo actual, Nodo padre, int valor) {
        if (actual == null) return null;

        if (actual.valor == valor) return padre;

        if (valor < actual.valor) {
            return buscarPadreRec(actual.izquierdo, actual, valor);
        } else {
            return buscarPadreRec(actual.derecho, actual, valor);
        }
    }

    // Recorrido Inorden
    public void inorden() {
        if (raiz == null) {
            System.out.println("Árbol vacío");
        } else {
            inordenRec(raiz);
            System.out.println();
        }
    }

    private void inordenRec(Nodo actual) {
        if (actual != null) {
            inordenRec(actual.izquierdo);
            System.out.print(actual.valor + " ");
            inordenRec(actual.derecho);
        }
    }

    // Imprimir árbol visual
    public void imprimirArbol() {
        imprimirRec(raiz, 0);
    }

    private void imprimirRec(Nodo actual, int nivel) {
        if (actual != null) {
            imprimirRec(actual.derecho, nivel + 1);

            for (int i = 0; i < nivel; i++) {
                System.out.print("   ");
            }

            System.out.println(actual.valor);

            imprimirRec(actual.izquierdo, nivel + 1);
        }
    }
}