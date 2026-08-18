public class ReservaMain{
    private String producto;
    private double precio;
    private int cantidadDisponible;

    public ReservaMain(String producto, double precio, int cantidadDisponible) {
        this.producto = producto;
        this.precio = precio;
        this.cantidadDisponible = cantidadDisponible;
    }
    public void mostrarInformacion() {
        System.out.println("Producto: " + producto);
        System.out.println("Precio: " + precio);
        System.out.println("Stock: " + cantidadDisponible);
    }

    public void reservar(int cantidad) {
        if (cantidad <= 0) {
            System.out.println("Error: La cantidad a reservar debe ser mayor a 0.");
            return;
        }
        if (cantidad > cantidadDisponible) {
            System.out.println("Error: No hay suficiente stock disponible.");
            return;
        }
        cantidadDisponible -= cantidad;
        System.out.println("Reserva realizada con éxito.");
        System.out.println("Stock restante: " + cantidadDisponible);
    }
    public double calcularTotal(int cantidad) {
        return precio * cantidad;
    }
    public double calcularTotal(int cantidad, double porcentajeDescuento) {
        double totalBase = calcularTotal(cantidad);
        double descuento = totalBase * (porcentajeDescuento / 100);
        return totalBase - descuento;
    }
}