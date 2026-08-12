public class main3 {
    public static void main(String[] args){
        String nombrePersona = "Alex";
        int edadPersonaA = 16;
        int nivelPersona = 12;
        boolean tieneMembresia = true;
        int modoseleccionado = 1;
        System.out.println("===Jugador===");
        System.out.println("Nombre: " + nombrePersona);
        System.out.println("Edad: " + edadPersonaA);
        System.out.println("Nivel: " + nivelPersona);
        System.out.println("Membreasia: " + tieneMembresia);
        System.out.println("Modo: " + modoseleccionado);
        System.out.println("===Datos===");

        switch (modoseleccionado){
            case 1:
                System.out.println("Modo Historia");
                break;
            case 2:
                System.out.println("Modo Competitivo");
                break;
            case 3:
                System.out.println("Modo Entretenamiento");
                break;


        }
        if (edadPersonaA >= 15 && nivelPersona >= 10 && tieneMembresia == true) {
            System.out.println("Acceso al modo: Autorizado");
        }else{
            System.out.println("Acceso al modo: Denegado");

        }



    }
}
