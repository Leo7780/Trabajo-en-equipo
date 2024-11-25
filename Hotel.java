package hotel.reserva;
import java.util.ArrayList;
import java.util.List;

class  Hotel extends Entidad {
    private String nombre;
    private String direccion;
    private List<Habitacion> habitaciones;
    private List<Reserva> reservas;

    public Hotel(int id, String nombre, String direccion) {
        super(id); // Llama al constructor de Entidad
        this.nombre = nombre;
        this.direccion = direccion;
        this.habitaciones = new ArrayList<>();
        this.reservas = new ArrayList<>();
    }

    public void agregarHabitacion(Habitacion habitacion) {
        habitaciones.add(habitacion);
    }

    public void listarHabitaciones() {
        System.out.println("Habitaciones:");
        for (Habitacion h : habitaciones) {
            System.out.println("ID: " + h.getId() + ", Tipo: " + h.getTipo() + ", Disponible: " + h.isDisponible());
        }
    }

    public Habitacion buscarHabitacionDisponible(int id) {
        for (Habitacion h : habitaciones) {
            if (h.getId() == id && h.isDisponible()) {
                return h;
            }
        }
        return null;
    }

    public Reserva crearReserva(String cliente, int idHabitacion) {
        Habitacion habitacion = buscarHabitacionDisponible(idHabitacion);
        if (habitacion != null) {
            habitacion.setDisponible(false); // Marca la habitación como ocupada
            Reserva reserva = new Reserva(reservas.size() + 1, cliente, habitacion);
            reservas.add(reserva);
            return reserva;
        } else {
            System.out.println("Habitación no disponible.");
            return null;
        }
    }

    public void listarReservas() {
        System.out.println("Reservas:");
        for (Reserva r : reservas) {
            System.out.println(r);
        }
    }
}
