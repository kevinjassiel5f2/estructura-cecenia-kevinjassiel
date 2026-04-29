package Lista;

public class Lista<T>  {
    //atributos
    private Nodo<T> cabeza;
    private int tamaño;
    
    //constructor por defecto
    public Lista() {
        cabeza = null;
        tamaño = 0;
    }
    public int getTamaño() {
        return tamaño;
    }
    //metodos personalizados
        //verifica si la pila esta vacia
    public boolean esVacia(){
    return cabeza == null;

    }
    //encola un elemento nuevo
    public void agregar(T valor){
        Nodo<T> nuevo = new Nodo<>();
        nuevo.setValor(valor);
        if (esVacia()) {
            cabeza = nuevo;
        } else {
            Nodo<T> aux = cabeza;
            while (aux.getSiguiente() != null) {
                aux = aux.getSiguiente();
            }
            aux.setSiguiente(nuevo);
        }
        tamaño++;
    // llave extra eliminada
    }
    /**
     * Inserta un nuevo nodo en la lista en la posición indicada.
     * @param valor valor a agregar
     * @param pos posicion donde se insertara (0 = inicio)
     * @throws PosicionIlegalException excepcion en caso que la posicion no exista
     */
    public void insertar(int pos, T valor) {
        if (pos >= 0 && pos <= tamaño) {
            //es una posicion valida
            Nodo<T> nuevo = new Nodo<>();
            nuevo.setValor(valor);
            if (pos == 0) {
                //insertar al principio de la lista
                nuevo.setSiguiente(cabeza);
                cabeza = nuevo;
            } else {
                //el nodo se inserta al final de la lista
                if (pos == tamaño) {
                    Nodo<T> aux = cabeza;
                    while (aux.getSiguiente() != null) {
                        aux = aux.getSiguiente();
                }
                        aux.setSiguiente(nuevo);
                } else {
                    //insertar en el medio
                    Nodo<T> aux = cabeza;
                    for(int i = 0; i <= pos - 2; i++) {
                        aux = aux.getSiguiente();
                    }
                    Nodo<T> siguiente = aux.getSiguiente();
                    aux.setSiguiente(nuevo);
                    nuevo.setSiguiente(siguiente);
                }
            }
            tamaño++;
        } 
            
    }
    //Elimina un nodo en determinada posicion
    //@param pos posicion del nodo a eliminar
    //@throws PosicionIlegalException en caso que la posicion no exista
    public void remover(int pos) {
        if (pos >= 0 && pos < tamaño) {
            if (pos == 0) {
                //El nodo a eliminar está en la primera posición
                cabeza = cabeza.getSiguiente();
                tamaño--;
            } else { //eliminar al final o en medio
                Nodo<T> aux = cabeza;
                for (int i = 0; i <= pos - 2; i++) {
                    aux = aux.getSiguiente();
                }
                Nodo<T> prox = aux.getSiguiente();
                aux.setSiguiente(prox.getSiguiente());
                tamaño--;
            }

        } 

    }

    //devuelve el elemento almacenado en determinada posición
    /* @param pos: posicion a consultar
    @return: el valor tipo T
    @thros PosicionIlegalException */
    public T getValor(int pos) {
        if (pos >= 0 && pos < tamaño) {
            T valor;
            if (pos == 0) {
                valor = cabeza.getValor();
                return valor;
            } else { //al final o en medio
                Nodo<T> aux = cabeza;
                for (int i = 0; i <= pos - 1; i++) {
                    aux = aux.getSiguiente();
                }
                valor = aux.getValor();
                return valor;
            }
        } 
        return null;
    }

    public void limpiar() {
        cabeza = null;
        tamaño = 0;
    }
    
    public T frente(){
        if (!esVacia()) {
            return cabeza.getValor();
        }
        else{
            return null;
        }
    }
    
    public  String toString() {
        String resultado = "";
        Nodo<T> actual = cabeza;
        while (actual != null) {
            resultado += actual.getValor() + "\n";
            actual = actual.getSiguiente();
        }
        return resultado.trim();
    }
    
}
