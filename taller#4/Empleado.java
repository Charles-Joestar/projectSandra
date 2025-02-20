public class Empleado {
    protected String nombre;
    protected double salario;

    // ... constructores y otros métodos
}

 class Gerente extends Empleado {
    protected String departamento;

    public void mostrarInformacion() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Salario: " + salario);
        System.out.println("Departamento: " + departamento);
    }
}
