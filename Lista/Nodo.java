package Lista;

public class Nodo<T> {
    //atributos
    private T valor;
    private Nodo<T> siguiente;

    //constructor
    public Nodo() {
        valor = null;
        siguiente = null;
    }

    //metodos
    public T getValor() {
        return valor;
    }

    public void setValor(T valor) {
        this.valor = valor;
    }

    public Nodo<T> getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(Nodo<T> siguiente) {
        this.siguiente = siguiente;
    }
}