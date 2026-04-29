package codigo;
import Lista.*;
import java.util.Scanner;

public class Escuela {
    static Scanner sc = new Scanner(System.in);
    static Lista<Estudiante> grupo1 = new Lista<>();
    static Lista<Estudiante> grupo2 = new Lista<>();

    public static void main(String[] args) {
        int opcion;
        do {
            System.out.println("\n--- MENÚ GESTIÓN ESCOLAR ---");
            System.out.println("1. Insertar estudiante");
            System.out.println("2. Eliminar estudiante (por matrícula)");
            System.out.println("3. Buscar estudiante");
            System.out.println("4. Mostrar lista");
            System.out.println("5. Mostrar promedio general");
            System.out.println("6. Mostrar aprobados");
            System.out.println("7. Unir grupos y mostrar reprobados");
            System.out.println("8. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = sc.nextInt();

            if (opcion >= 1 && opcion <= 6) {
                System.out.print("¿A qué grupo? (1 o 2): ");
                int g = sc.nextInt();
                
    
                if (g == 1) {
                    procesarOpcion(opcion, grupo1);
                } else {
                    procesarOpcion(opcion, grupo2);
                }
            } else if (opcion == 7) {
                unirYMostrarReprobados();
            }
        } while (opcion != 8);
    }

    public static void procesarOpcion(int op, Lista<Estudiante> lista) {
        switch (op) {
            case 1:
                System.out.print("Matrícula: "); int mat = sc.nextInt();
                System.out.print("Nombre: "); String nom = sc.next();
                System.out.print("Promedio: "); double prom = sc.nextDouble();
                lista.agregar(new Estudiante(mat, nom, prom));
                break;
            case 2:
                System.out.print("Matrícula a eliminar: "); int mEli = sc.nextInt();
                eliminarEstudiante(lista, mEli);
                break;
            case 3:
                System.out.print("Matrícula a buscar: "); int mBus = sc.nextInt();
                buscarEstudiante(lista, mBus);
                break;
            case 4:
                System.out.println("Contenido de la lista:");
                System.out.println(lista.toString());
                break;
            case 5:
                System.out.println("Promedio General del Grupo: " + calcularPromedio(lista));
                break;
            case 6:
                System.out.println("--- Alumnos Aprobados ---");
                mostrarPorEstatus(lista, true);
                break;
        }
    }

    public static void eliminarEstudiante(Lista<Estudiante> lista, int matricula) {
        if (lista.esVacia()) {
            System.out.println("La lista está vacía.");
            return;
        }
        for (int i = 0; i < lista.getTamaño(); i++) {
            if (lista.getValor(i).getMatricula() == matricula) {
                lista.remover(i);
                System.out.println("Estudiante con matrícula " + matricula + " eliminado correctamente.");
                return;
            }
        }
        System.out.println("No se encontró ningún estudiante con esa matrícula.");
    }

    public static void buscarEstudiante(Lista<Estudiante> lista, int matricula) {
        for (int i = 0; i < lista.getTamaño(); i++) {
            Estudiante e = lista.getValor(i);
            if (e.getMatricula() == matricula) {
                System.out.println("Estudiante encontrado: " + e);
                return;
            }
        }
        System.out.println("Estudiante no encontrado.");
    }

    public static double calcularPromedio(Lista<Estudiante> lista) {
        if (lista.esVacia()) return 0;
        double suma = 0;
        for (int i = 0; i < lista.getTamaño(); i++) {
            suma += lista.getValor(i).getPromedio();
        }
        return suma / lista.getTamaño();
    }

    public static void mostrarPorEstatus(Lista<Estudiante> lista, boolean aprobados) {
        boolean huboResultados = false;
        for (int i = 0; i < lista.getTamaño(); i++) {
            Estudiante e = lista.getValor(i);
            if (aprobados && e.getPromedio() >= 6.0) {
                System.out.println(e);
                huboResultados = true;
            } else if (!aprobados && e.getPromedio() < 6.0) {
                System.out.println(e);
                huboResultados = true;
            }
        }
        if (!huboResultados) System.out.println("No hay estudiantes en esta categoría.");
    }

    public static void unirYMostrarReprobados() {
        System.out.println("--- Estudiantes Reprobados (Ambos Grupos) ---");
        System.out.println("Grupo 1:");
        mostrarPorEstatus(grupo1, false);
        System.out.println("Grupo 2:");
        mostrarPorEstatus(grupo2, false);
    }
}