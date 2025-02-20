public class Vehiculo {
    protected String tipo;
    protected String marca;
}

 class Moto extends Vehiculo {
    protected int cilindrada;
}

// Clase de prueba en otro paquete
 class PruebaVehiculo {
    public static void main(String[] args) {
        Vehiculo vehiculo = new Vehiculo();
        // Error de compilación: tipo y marca no son accesibles desde aquí
        System.out.println(vehiculo.tipo);
    }
}
