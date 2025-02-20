public abstract class Estudiante {

    
    private String nombre;
    private int edad;
    private String curso;

    // Constructor por defecto que asigna valores genéricos
    public Estudiante() {
        this.nombre = "Nombre Genérico";
        this.edad = 18; 
        this.curso = "Curso Genérico";
    }

    // Constructor que acepta como parámetros el nombre y la edad
    public Estudiante(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
        this.curso = "Curso Genérico";
    }

    // Constructor que acepta todos los parámetros y utiliza 'this()'
    public Estudiante(String nombre, int edad, String curso) {
        this(nombre, edad); 
        this.curso = curso; 
    }

    
    
}
