import java.util.Scanner;

class Novela {
    private String titulo;
    private String autor;
    private int numeroPaginas;

    // Constructor por defecto
    public Novela() {
        this.titulo = "Título Desconocido";
        this.autor = "Autor Desconocido";
        this.numeroPaginas = 0;
    }

    // Constructor parametrizado
    public Novela(String titulo, String autor, int numeroPaginas) {
        this.titulo = titulo;
        this.autor = autor;
        this.numeroPaginas = numeroPaginas;
    }

    @Override
    public String toString() {
        return "Novela [Título=" + titulo + ", Autor=" + autor + ", Número de páginas=" + numeroPaginas + "]";
    }
}

class Banco {
    private String numeroCuenta;
    private double saldo;
    private String tipoCuenta;

    // Constructor por defecto
    public Banco() {
        this.numeroCuenta = "000000000";
        this.saldo = 0.0;
        this.tipoCuenta = "Ahorro";
    }

    // Constructor parametrizado con dos parámetros
    public Banco(String numeroCuenta, String tipoCuenta) {
        this.numeroCuenta = numeroCuenta;
        this.saldo = 0.0;
        this.tipoCuenta = tipoCuenta;
    }

    // Constructor sobrecargado con tres parámetros
    public Banco(String numeroCuenta, double saldo, String tipoCuenta) {
        this.numeroCuenta = numeroCuenta;
        this.saldo = saldo;
        this.tipoCuenta = tipoCuenta;
    }

    @Override
    public String toString() {
        return "Banco [Número de Cuenta=" + numeroCuenta + ", Saldo=" + saldo + ", Tipo de Cuenta=" + tipoCuenta + "]";
    }
}

class Alumno {
    private String nombre;
    private int edad;
    private String curso;

    // Constructor por defecto
    public Alumno() {
        this.nombre = "Desconocido";
        this.edad = 0;
        this.curso = "No asignado";
    }

    // Constructor con dos parámetros (nombre y edad)
    public Alumno(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
        this.curso = "No asignado";
    }

    // Constructor con todos los parámetros
    public Alumno(String nombre, int edad, String curso) {
        this.nombre = nombre;
        this.edad = edad;
        this.curso = curso;
    }

    @Override
    public String toString() {
        return "Alumno [Nombre=" + nombre + ", Edad=" + edad + ", Curso=" + curso + "]";
    }
}

public class ProyectoIntegrador {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ingresar detalles de la Novela
        System.out.println("Ingrese los detalles de la Novela:");
        System.out.print("Título: ");
        String tituloNovela = scanner.nextLine();
        System.out.print("Autor: ");
        String autorNovela = scanner.nextLine();
        System.out.print("Número de páginas: ");
        int paginasNovela = scanner.nextInt();
        scanner.nextLine(); // Consumir el salto de línea
        Novela novela = new Novela(tituloNovela, autorNovela, paginasNovela);

        // Ingresar detalles del Banco
        System.out.println("\nIngrese los detalles del Banco:");
        System.out.print("Número de Cuenta: ");
        String numeroCuenta = scanner.nextLine();
        System.out.print("Saldo: ");
        double saldoCuenta = scanner.nextDouble();
        scanner.nextLine(); // Consumir el salto de línea
        System.out.print("Tipo de Cuenta: ");
        String tipoCuenta = scanner.nextLine();
        Banco banco = new Banco(numeroCuenta, saldoCuenta, tipoCuenta);

        // Ingresar detalles del Alumno
        System.out.println("\nIngrese los detalles del Alumno:");
        System.out.print("Nombre: ");
        String nombreAlumno = scanner.nextLine();
        System.out.print("Edad: ");
        int edadAlumno = scanner.nextInt();
        scanner.nextLine(); // Consumir el salto de línea
        System.out.print("Curso: ");
        String cursoAlumno = scanner.nextLine();
        Alumno alumno = new Alumno(nombreAlumno, edadAlumno, cursoAlumno);

        // Mostrar detalles de los objetos utilizando toString()
        System.out.println("\nDetalles ingresados:");
        System.out.println(novela);
        System.out.println(banco);
        System.out.println(alumno);

        scanner.close();
    }
}