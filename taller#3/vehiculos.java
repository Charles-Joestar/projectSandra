// vehiculos/Vehiculo.java
// Paquete vehiculos


class Vehiculos {
    String tipo; // Propiedad con acceso por defecto (paquete)
}

 class Moto extends Vehiculo {
    // ... (otros atributos o métodos específicos de Moto)
}




 class PruebaVehiculo {
    
    public static void main(String[] args) {
        Vehiculo vehiculo1 = new Vehiculo();
        Moto moto1 = new Moto();

        // Error de compilación: tipo no es visible
        System.out.println(vehiculo1);
    }
}