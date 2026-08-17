public class Mainn {
    public static void main(String[] args){
        System.out.println("Bienvenido a tech store");
        Producto cargador = new Producto("Cargador Iphone carga rapida", 100000, 100);
        Producto teclado = new Producto("Teclado mecanico", 35000, 20);
        Producto poleron = new Producto("Poleron de la U", 55000, 1000);
        cargador.mostrarInformacion();
        teclado.mostrarInformacion();
        poleron.mostrarInformacion();

        System.out.println("Ventas");
        cargador.vender(10);
        teclado.vender(15);
        poleron.vender(30);

        cargador.mostrarInformacion();
        teclado.mostrarInformacion();
        poleron.mostrarInformacion();
        System.out.println("Precio con IVA");
        double precioConIva = teclado.calcularPrecioConIVA();
        System.out.println("Precio con iva del teclado" + precioConIva);
        System.out.println("Compra normal");
        int cantidad2 = 3;
        double totalCompra = teclado.calcularPrecioFinal(2, 20);
        System.out.println("Cantidad: " + cantidad2);
        System.out.println("Total: " + totalCompra);
        System.out.println("Compra con descuento");
        double totalDescuento2 = teclado.calcularPrecioFinal(2, 30);
        System.out.println("Total con 30% de descuento");
        System.out.println("Fin del programa TESH STORE");



    }

}
