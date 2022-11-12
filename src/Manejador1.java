public class Manejador1 implements ManejadorInterfase {

     private final String nivel = "nivel1";
     private ManejadorInterfase siguienteManejador;

    public Manejador1 (ManejadorInterfase siguiente){
        this.siguienteManejador = siguiente;
    }

    @Override
    public void darSoporte(String solicitud) {
        System.out.println("  ");
        System.out.println("Se encuentra en ayuda nivel 1");
        System.out.println("la solicitud recibida es  " + solicitud);
        System.out.println("las posibles soluciondes son: a) conectar equipo, b)desconectar y conectar, c) presionar boton encendido");
        if (nivel.equals(solicitud)){
            System.out.println("==> Resultado: La solicitud fue resuelta con una de las opciones de ayuda nivel 1.");
        }else{
            System.out.println("==> Resultado: No se resolvió con la ayuda nivel 1. Solicitud pasa a nivel 2");
            siguienteManejador.darSoporte(solicitud);
        }
    }

}
