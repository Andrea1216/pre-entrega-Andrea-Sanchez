import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<Producto> productos = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        int opcion;
        do {
            System.out.println("\n--- MENÚ ---");
            System.out.println("1. Agregar producto");
            System.out.println("2. Mostrar productos");
            System.out.println("3. Salir");
            System.out.print("Elija una opción: ");
            opcion = sc.nextInt();
            sc.nextLine();  // limpiar buffer

            switch (opcion) {
                case 1 -> {
                    System.out.print("Nombre del producto: ");
                    String nombre = sc.nextLine();

                    System.out.print("Precio: ");
                    double precio = sc.nextDouble();

                    System.out.print("Cantidad en stock: ");
                    int stock = sc.nextInt();

                    productos.add(new Producto(nombre, precio, stock));
                    System.out.println("✅ Producto agregado correctamente.");
                }

                case 2 -> {
                    System.out.println("\n--- LISTA DE PRODUCTOS ---");
                    if (productos.isEmpty()) {
                        System.out.println("No hay productos registrados.");
                    } else {
                        for (Producto p : productos) {
                            System.out.println(p);
                        }
                    }
                }

                case 3 -> System.out.println("👋 Saliendo...");
                default -> System.out.println("Opción inválida.");
            }

        } while (opcion != 3);

        sc.close();
    }
}
