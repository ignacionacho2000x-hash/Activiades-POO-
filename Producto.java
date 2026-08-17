public class Producto {
        private String nombre;
        private double precio;
        private int stock;

        public Producto(String nombre,double precio,int stock){
            this.nombre = nombre;
            this.precio = precio;
            this.stock = stock;


        }
        public void mostrarInformacion(){
            System.out.println("--------Producto--------");
            System.out.println("Nombre" + nombre);
            System.out.println("Precio" + precio);
            System.out.println("Stock" + stock);
        }
        public void vender(int cantidad){
            if(cantidad <= stock) {
                stock -= cantidad;
                System.out.println("Venta realizada: " + cantidad + "unidad(es)");
            }else {
                System.out.println("El stock es insuficiente");

            }

        }
        public double calcularPrecioConIVA(){
            double precioConIva = precio* 1.19;
            return precioConIva;


        }
        public double calcularPrecioFinal(int cantidad, double descuento){
            double total = precio * cantidad;
            double montoDescuento = total * descuento/ 100;
            double totalConDescuento = total - montoDescuento;
            return totalConDescuento;
        }
}
