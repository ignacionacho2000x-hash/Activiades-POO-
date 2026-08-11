public class Main {
    public static void main(String[] args) {
        System.out.println("====Tipos de datos====");
        int edad = 43;
        double estatura = 1.51;
        char iniciar = 'C';
        boolean trabajadora = true;
        String nombre = "Claudia Mansilla";
        System.out.println("====Tipos de datos====");

        System.out.println("Nombre: " + nombre);
        System.out.println("edad: " + edad);
        System.out.println("estatura: " + estatura);
        System.out.println("inicial: " + iniciar);
        System.out.println("¿Es trabajadora: " + trabajadora);

        System.out.println("====Operadores====");
        int numero1 = 12;
        int numero2 = 6;

        System.out.println("suma: " + (numero1 + numero2) );
        System.out.println("resta: " + (numero1 - numero2) );
        System.out.println("multiplicacion: " + (numero1 * numero2) );
        System.out.println("division: " + (numero1 / numero2) );
        System.out.println("modulo: " + (numero1 % numero2) );

        double divisionDecimal = 12.0 / 6.0;
        System.out.println("division: " + (divisionDecimal) );

        System.out.println("====Comparacion====");
        int edadPersona = 20;
        System.out.println(edadPersona > 18);
        System.out.println(edadPersona < 18);
        System.out.println(edadPersona <= 18);
        System.out.println(edadPersona != 18);

        System.out.println("====Operaciones Logicos====");
        boolean tieneDinero = true;
        boolean productoDisponible = false;

        boolean puedeComprar = tieneDinero || productoDisponible;
        //boolean negacion = !puedeComprar;
        System.out.println("Puede Comprar: " + puedeComprar);//

        System.out.println("====Precedencia====");
        int resultado = 10 + 5 * 2;
        int resultado2 = (10 + 5) *2;
        System.out.println("Resultado 1 sin parentesis: "+ resultado);
        System.out.println("Resultado 2 con parentesis: "+ resultado2);

        System.out.println("====Asisgnacion====");

        int saldo = 1000;
        //asignar
        saldo = saldo + 2000;

        saldo+= 2000;

        System.out.println("Saldo: " + saldo);

        System.out.println("====Incrementacion y Designacion====");
        int vidas = 3;
        //incrementar vidas + 1
        vidas++;
        System.out.println("Vidas: "+ vidas);

        System.out.println("====Sistema de compra====");
        String cliente = "Diego";
        int edadCompra = 18;
        double saldoCliente = 50000;
        double precioProducto = 35990;
        boolean disponibleProducto = true;

        //Metodos = Funciones
        //Calcular el dinero restante
        double saldoRestante = saldoCliente - precioProducto;

        boolean tieneSaldoSufiente = saldoCliente >= precioProducto;

        boolean mayorEdad = edadCompra >=18;

        boolean puedeRealizarCompra = mayorEdad && tieneSaldoSufiente && disponibleProducto;

        System.out.println("Puede Comprar?: "+ puedeRealizarCompra);











    }
}
