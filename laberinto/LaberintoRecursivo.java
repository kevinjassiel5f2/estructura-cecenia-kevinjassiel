public class LaberintoRecursivo {
 //Valor Significado                
 
//0 Camino libre               
//1 Pared                      
//2 Punto inicial              
//3 Punto final                
//9 Camino correcto encontrado

    static int[][] laberinto = {
        {2, 0, 1, 0, 0},
        {1, 0, 1, 0, 1},
        {0, 0, 0, 0, 1},
        {0, 1, 1, 0, 1},
        {0, 0, 0, 3, 1}
    };

    static int filas = 5;
    static int columnas = 5;

    public static void main(String[] args) {

        // buscar desde el punto inicial (0,0)
        if (resolver(0, 0)) {
            System.out.println("Camino encontrado:");
        } else {
            System.out.println("No hay solución");
        }

        mostrar();
    }

    // MÉTODO RECURSIVO
    public static boolean resolver(int x, int y) {

        // Verificar límites
        if (x < 0 || y < 0 || x >= filas || y >= columnas)
            return false;

        // Si es pared o ya visitado
        if (laberinto[x][y] == 1 || laberinto[x][y] == 9)
            return false;

        // Si llegamos al final
        if (laberinto[x][y] == 3)
            return true;

        // Marcar camino correcto
        if (laberinto[x][y] == 0 || laberinto[x][y] == 2)
            laberinto[x][y] = 9;

        // Movimientos (recursividad)
        if (resolver(x + 1, y) ||   // abajo
            resolver(x, y + 1) ||   // derecha
            resolver(x - 1, y) ||   // arriba
            resolver(x, y - 1))     // izquierda
            return true;

        return false;
    }

    // Mostrar laberinto
    public static void mostrar() {
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                System.out.print(laberinto[i][j] + " ");
            }
            System.out.println();
        }
    }
    //El laberinto se resuelve mediante recursividad,
    //  donde el algoritmo explora diferentes caminos llamándose
    //  a sí mismo hasta encontrar la salida. Cada posición válida
    //  se marca con el valor 9 para indicar el camino correcto
    //  desde el punto inicial hasta el punto final
}