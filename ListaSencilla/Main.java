package ListaSencilla;

public class Main {
    public static void main(String[] args) {
        ListaSencilla lista = new ListaSencilla();

        lista.insertarInicio(3);
        lista.insertarInicio(1);
        lista.insertarFinal(5);
        lista.insertarFinal(7);

        System.out.println("Lista:");
        lista.mostrar();

        System.out.println("¿Existe 5? " + lista.buscar(5));
        System.out.println("¿Existe 10? " + lista.buscar(10));

        lista.eliminar(3);
        System.out.println("Lista después de eliminar 3:");
        lista.mostrar();
    }
}