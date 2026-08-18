public class MainReservaCN{
    public static void main(String[] args){
        System.out.println("Reserva 1");
        ReservaMain producto1 = new ReservaMain("Teclado Mecanico", 50.0,10);
        producto1.mostrarInformacion();
        System.out.println("Total (3 unidades): $" + producto1.calcularTotal(3));
        System.out.println("Total con 10% desc: $" + producto1.calcularTotal(3,10));
        producto1.reservar(0);
        producto1.reservar(15);
        producto1.reservar(3);
        System.out.println();
        System.out.println("Reserva 2");
        ReservaMain producto2 = new ReservaMain("Mouse Inalámbrico", 25.0, 5);

        producto2.mostrarInformacion();
        producto2.reservar(2);
    }
}
