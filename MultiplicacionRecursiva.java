public class MultiplicacionRecursiva {

    // función recursiva
    public static int multiplicar(int a, int b) {

        // caso base
        if (b == 0) {
            return 0;
        }

        // llamada recursiva (suma repetida)
        return a + multiplicar(a, b - 1);
    }

    public static void main(String[] args) {

        int num1 = 3;
        int num2 = 4;

        int resultado = multiplicar(num1, num2);

        System.out.println("Resultado: " + resultado);
    }
}