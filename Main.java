package hotel.reserva;


import java.util.Scanner;

// Clase principal para ejecutar el sistema de gestión de reservas
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Crear el hotel
        Hotel hotel = new Hotel(1, "Hotel Central", "Av. Principal 123");

        // Agregar habitaciones al hotel
        hotel.agregarHabitacion(new Habitacion(101, "Simple"));
        hotel.agregarHabitacion(new Habitacion(102, "Doble"));
        hotel.agregarHabitacion(new Habitacion(103, "Suite"));

        boolean continuar = true;

        while (continuar) {
            System.out.println("\n--- Sistema de Gestión de Reservas ---");
            System.out.println("1. Listar habitaciones");
            System.out.println("2. Crear una reserva");
            System.out.println("3. Listar reservas");
            System.out.println("4. Salir");
            System.out.print("Seleccione una opción: ");

            int opcion = scanner.nextInt();
            scanner.nextLine(); // Limpiar buffer

            switch (opcion) {
                case 1:
                    hotel.listarHabitaciones();
                    break;

                case 2:
                    System.out.print("Ingrese el nombre del cliente: ");
                    String cliente = scanner.nextLine();

                    System.out.print("Ingrese el ID de la habitación: ");
                    int idHabitacion = scanner.nextInt();

                    Reserva nuevaReserva = hotel.crearReserva(cliente, idHabitacion);
                    if (nuevaReserva != null) {
                        System.out.println("Reserva creada: " + nuevaReserva);
                    }
                    break;

                case 3:
                    hotel.listarReservas();
                    break;

                case 4:
                    continuar = false;
                    System.out.println("Gracias por usar el sistema.");
                    break;

                default:
                    System.out.println("Opción no válida. Intente de nuevo.");
            }
        }

        scanner.close();
    }
}
