package ArbolBinario;
public class ArbolBinario {

    //  Insertar (tipo ABB)
    public Nodo insertar(Nodo raiz, int valor) {
        if (raiz == null) {
            return new Nodo(valor);
        }

        if (valor < raiz.valor) {
            raiz.izquierdo = insertar(raiz.izquierdo, valor);
        } else {
            raiz.derecho = insertar(raiz.derecho, valor);
        }

        return raiz;
    }

    //  Método público para insertar
    public void insertar(int valor) {
        raiz = insertar(raiz, valor);
    }

    //  Buscar nodo
    public Nodo buscar(Nodo raiz, int valor) {
        if (raiz == null || raiz.valor == valor) {
            return raiz;
        }

        if (valor < raiz.valor) {
            return buscar(raiz.izquierdo, valor);
        } else {
            return buscar(raiz.derecho, valor);
        }
    }

    //  Identificar tipo de nodo
    public String tipoNodo(int valor) {
        Nodo nodo = buscar(raiz, valor);

        if (nodo == null) {
            return "No existe";
        }

        if (nodo == raiz) {
            return "Raíz";
        }

        if (nodo.izquierdo == null && nodo.derecho == null) {
            return "Hoja";
        }

        return "Intermedio";
    }

    //  Obtener nivel
    public int obtenerNivel(Nodo raiz, int valor, int nivel) {
        if (raiz == null) {
            return -1;
        }

        if (raiz.valor == valor) {
            return nivel;
        }

        int izq = obtenerNivel(raiz.izquierdo, valor, nivel + 1);
        if (izq != -1) {
            return izq;
        }

        return obtenerNivel(raiz.derecho, valor, nivel + 1);
    }

    //  Método público nivel
    public int nivel(int valor) {
        return obtenerNivel(raiz, valor, 0);
    }
}