public class Main2 {

    public static void main(String[] args) {

        //clase 2 Estructuras de control
        //Condicionales IF

        //almacenar la edad

        int edad = 20;
        System.out.println("=======Estructura IF=======");

        // IF evalua true o false = 0 o 1
        //Si es true se ejecuta, si no, no muestra nada

        if(edad >= 18){
            System.out.println("La persona es mayor de edad");
        }

        //if else
        System.out.println("==========Estructura if else=========");

        int edadCliente = 16;

        if(edadCliente >= 18){
            System.out.println("La persona es mayor de edad");
        }else{
            System.out.println("La persona es menor de edad");
        }

        System.out.println("=========Condiciones combinadas=======");
        int edadUsusario = 22;
        boolean tieneEntrada = true;
        // &&= AND
        if(edadUsusario >= 18 && tieneEntrada){
            System.out.println("Puede ingresar al concierto");
        }else{
            System.out.println("No cumple con los requisitos");
        }

        System.out.println("=======Else-if======");
        double nota = 5.5;
        if(nota >= 6.0){
            System.out.println("Excelente");
        }else if(nota >= 5.0){
            System.out.println("Bueno");
        }else if (nota >= 4.0){
            System.out.println("Aprovado");
        }else{
            System.out.println("Lo siento, reprobaste");
        }

        System.out.println("=====switch=====");

        int opcion =2;

        //switch = compara un valor con diferentes casos

        switch(opcion){

            case 1:
                System.out.println("Crear Usuario");
                break;

            case 2:
                System.out.println("Buscar usuario");
                break;
            case 3:
                System.out.println("Eliminar ususario");
                break;

            case 4:
                System.out.println("Salir del menú");
                break;

            default:
                System.out.println("Opcion invalida, escoge un numero por favor");
        }

        System.out.println("=======Operador ternario=====");

        int edadPersonaTernario = 25;
        //OPERADOR TERNARIO = permite generar una operacion condicional en una sola linea
        //Operador ternario funciona con ? => IF  : => ELSE
        String mensajeEdad = edadPersonaTernario >= 18 ? "Mayor de edad" : "Menor de edad";

        System.out.println("Operador ternario " + mensajeEdad);

        System.out.println("=======Caso practico======");

        //Control de acceso

        String nombrePersona = "Camila";
        int edadPersonaC = 17;
        double altura = 1.65;
        boolean tieneEntradaAtraccion = true;
        int tipoEntrada = 2;
        System.out.println("Nombre: " + nombrePersona);
        System.out.println("Edad Persona: " + edadPersonaC);
        System.out.println("Altura: " + altura);

        //tipo de entrada

        switch (tipoEntrada){

            case 1:
                System.out.println("Entrada general");
                break;
            case 2:
                System.out.println("Entradas VIP");
                break;
            case 3:
                System.out.println("Entrada para estudiante");
                break;
            default:
                System.out.println("Entrada desconocida");

        }

        //Validacion de acceso

        //Revisamos si tiene entrada

        if(!tieneEntradaAtraccion){
            System.out.println("Acceso rechazado, no tiene su entrada");
        }else if(edadPersonaC < 12){
            System.out.println("Acceso rechazado, no cumple con la edad minima");
        }else if(altura < 1.40){
            System.out.println("Acceso rechazado, no cumple con la altura minima");
        }else{
            System.out.println("Acceso autorizado!");
        }



    }
}