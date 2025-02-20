// Paquete ejercicio3
public class Persona {
    private String nombre; // Privado, solo accesible dentro de la clase
    int edad; // Acceso por defecto, accesible dentro del paquete

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}


// Paquete ejercicio3
 class PruebaPersona {
    public static void main(String[] args) {
        Persona persona1 = new Persona();
        persona1.setNombre("Juan");
        System.out.println(persona1.getNombre());  // Funciona

        // Error de compilación: edad no es visible
        System.out.println(persona1.edad);
    }
}