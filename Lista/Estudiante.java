package Lista;

public class Estudiante {
    private int matricula;
    private String nombre;
    private double promedio;

    public Estudiante(int matricula, String nombre, double promedio) {
        this.matricula = matricula;
        this.nombre = nombre;
        this.promedio = promedio;
    }

    public int getMatricula() { return matricula; }
    public String getNombre() { return nombre; }
    public double getPromedio() { return promedio; }

    @Override
    public String toString() {
        return "Matrícula: " + matricula + " | Nombre: " + nombre + " | Promedio: " + promedio;
    }
}