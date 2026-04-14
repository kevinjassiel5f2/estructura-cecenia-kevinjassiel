                                              n                                                                                                                                                                                                                        nnnnnnnnnnnnnnnnn                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                 import java.util.ArrayList;
import java.util.Collections;

public class ListaOrdenada {
    private ArrayList<Integer> lista;

    public ListaOrdenada() {
        lista = new ArrayList<>();
    }

    // Método para agregar elementos y mantener el orden
    public void agregar(int elemento) {
        lista.add(elemento);
        Collections.sort(lista); // Ordena la lista automáticamente
    }

    // Método para mostrar la lista
    public void mostrar() {
        for (int num : lista) {
            System.out.println(num);
        }
    }

    // Método principal para probar la clase
    public static void main(String[] args) {
        ListaOrdenada miLista = new ListaOrdenada();

        miLista.agregar(5);
        miLista.agregar(2);
        miLista.agregar(8);
        miLista.agregar(1);

        System.out.println("Lista ordenada:");
        miLista.mostrar();
    }
}     vvvvvvvvvv