

public class Producto {
    String nombre;
    double precio;
    int stock;

    Producto(String nombre, double precio, int stock) {
        this.nombre = nombre;
        this.precio = precio;
        this.stock = stock;
    }

    void mostrarInfo() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Precio: " + precio);
        System.out.println("Stock: " + stock);
    }
}



class PruebaProducto {
    public static void main(String[] args) {
        Producto producto1 = new Producto("Laptop", 1000.0, 5);
        producto1.mostrarInfo();
    }
}
