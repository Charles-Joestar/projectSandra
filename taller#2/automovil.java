public class Coche {
     // Propiedades privadas
     private String marca;
     private String modelo;
     private int velocidadMaxima;
 
     // Constructor por defecto
     public Coche() {
         this.marca = "Desconocido";
         this.modelo = "Desconocido";
         this.velocidadMaxima = 0;
     }
 
     // Constructor parametrizado
     public Coche(String marca, String modelo, int velocidadMaxima) {
         this.marca = marca;
         this.modelo = modelo;
         this.velocidadMaxima = velocidadMaxima;
     }
 
     // Métodos getter y setter para acceder a las propiedades (opcional)
     public String getMarca() {
         return marca;
     }
 
     public void setMarca(String marca) {
         this.marca = marca;
     }
 
     public String getModelo() {
         return modelo;
     }
 
     public void setModelo(String modelo) {
         this.modelo = modelo;
     }
 
     public int getVelocidadMaxima() {
         return velocidadMaxima;
     }
 
     public void setVelocidadMaxima(int velocidadMaxima) {
         this.velocidadMaxima = velocidadMaxima;
     }
 
     // Método para acelerar el coche
     public void acelerar(int incremento) {
         if (incremento > 0) {
             velocidadMaxima += incremento;
             System.out.println("El coche ha acelerado. Nueva velocidad máxima: " + velocidadMaxima + " km/h");
         } else {
             System.out.println("El incremento debe ser positivo.");
         }
     }
 
     @Override
     public String toString() {
         return "Coche [Marca=" + marca + ", Modelo=" + modelo + ", Velocidad Máxima=" + velocidadMaxima + " km/h]";
     }
    
}
