import java.io.*;

public class Main {

    // variables globales
    static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    static PrintStream out = System.out;

    // metodos utilitarios mostrar y leer
    static String leerTexto()throws IOException{
        return in.readLine();
    }
    static void mostrarTexto(String msj){
        out.println(msj);
    }

    public static void main(String[] args) throws IOException {
        // aqui se se va definir los enlaces y elorden de los manejadores.
        Manejador3 nivel3 = new Manejador3();
        Manejador2 nivel2 = new Manejador2(nivel3);
        Manejador1 nivel1 = new Manejador1(nivel2);
        mostrarTexto("*** Bienvenido al sistema de soporte técnico ***");
        int opcion = -1;
        String solicitud;
        do {
            mostrarMenu();
            opcion = Integer.parseInt(leerTexto());
            switch (opcion){
                case 0:
                    mostrarTexto("Adios, Fue un gusto atenderle");
                    break;
                case 1:
                    solicitud = "nivel1";
                    nivel1.darSoporte(solicitud);
                    break;
                case 2:
                    solicitud = "nivel2";
                    nivel1.darSoporte(solicitud);
                    break;
                case 3:
                    solicitud = "nivel3";
                    nivel1.darSoporte(solicitud);
                    break;
                default:
                    mostrarTexto("Opcion invalida por favor confirme la opcion deseada");
                    break;
            }
        }while (opcion !=0);
    }
    static void mostrarMenu(){
        mostrarTexto("    ");
        mostrarTexto("   Las opciones a probar son: ");
        mostrarTexto("1. solicitud nivel 1 = respuesta automática con sugerencias básicas");
        mostrarTexto("2. solicitud nivel 2 = operador da sugerencias genericas del manual de usuario");
        mostrarTexto("3. solicitud nivel 3 = llamada pasa a un especialista del producto que si resuelve");
        mostrarTexto("0. Salir del programa");
        mostrarTexto("Por favor indicar con numero la opcion deseada");
    }

}// fin de la Clase