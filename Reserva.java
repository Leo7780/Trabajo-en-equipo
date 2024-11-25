package hotel.reserva;

class Reserva extends Entidad {
    private String cliente;
    private Habitacion habitacion;

    public Reserva(int id, String cliente, Habitacion habitacion) {
        super(id); // Llama al constructor de Entidad
        this.cliente = cliente;
        this.habitacion = habitacion;
    }

    public String getCliente() {
        return cliente;
    }

    public Habitacion getHabitacion() {
        return habitacion;
    }

    @Override
    public String toString() {
        return "Reserva ID: " + getId() + ", Cliente: " + cliente + ", Habitación ID: " + habitacion.getId();
    }
}

