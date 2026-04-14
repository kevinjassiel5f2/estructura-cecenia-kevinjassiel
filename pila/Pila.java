package pila;

public class Pila<T> {
    private Nodo<T> cima;
    private int tamaño;

    public Pila() {
        cima = null;
        tamaño = 0;
    }

    public boolean estaVacia() {
        return cima == null;
    }

    public int getTamaño() {
        return tamaño;
    }

    public void apilar(T valor) {
        Nodo<T> nuevo = new Nodo<>(valor);
        nuevo.setSiguiente(cima);
        cima = nuevo;
        tamaño++;
    }

    public void retirar() {
        if (!estaVacia()) {
            cima = cima.getSiguiente();
            tamaño--;
        }
    }

    public T verCima() {
        if (!estaVacia()) {
            return cima.getValor();
        }
        return null;
    }

    public void push(T valor) {
    apilar(valor);
}

public T pop() {
    if (estaVacia()) {
        return null;
    }
    T valor = cima.getValor();
    cima = cima.getSiguiente();
    tamaño--;
    return valor;
}

public T peek() {
    return verCima();
}

public boolean empty() {
    return estaVacia();
}

public int search(T valor) {
    Nodo<T> actual = cima;
    int pos = 1;
    while (actual != null) {
        if (actual.getValor().equals(valor)) {
            return pos;
        }
        actual = actual.getSiguiente();
        pos++;
    }
    return -1;
}

}