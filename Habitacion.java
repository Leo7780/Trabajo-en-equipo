package hotel.reserva;

class Habitacion extends Entidad {
    private String tipo;
    private boolean disponible;

    public Habitacion(int id, String tipo) {
        super(id); // Llama al constructor de Entidad
        this.tipo = tipo;
        this.disponible = true; // Disponible por defecto
    }

    public String getTipo() {
        return tipo;
    }

    public boolean isDisponible() {
        return disponible;
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }
}

