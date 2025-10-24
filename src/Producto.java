public class Producto {
    private static int contador = 1;  // Genera IDs automáticos

    private int id;
    private String nombre;
    private double precio;
    private int cantidadStock;

    public Producto(String nombre, double precio, int cantidadStock) {
        this.id = contador++;
        this.nombre = nombre;
        this.precio = precio;
        this.cantidadStock = cantidadStock;
    }

    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public int getCantidadStock() {
        return cantidadStock;
    }

    @Override
    public String toString() {
        return String.format("ID: %d | Nombre: %s | Precio: $%.2f | Stock: %d",
                id, nombre, precio, cantidadStock);
    }
}
