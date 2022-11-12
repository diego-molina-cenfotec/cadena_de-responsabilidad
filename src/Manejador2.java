public class Manejador2 implements ManejadorInterfase{
    private String nivel = "nivel2";
    private ManejadorInterfase siguienteManejador;

    public Manejador2(ManejadorInterfase siguiente) {
        this.siguienteManejador = siguiente;
    }

    @Override
    public void darSoporte(String solicitud) {
        System.out.println("  ");
        System.out.println("Ahora se encuentra en ayuda nivel 2");
        System.out.println("la solicitud recibida es  " + solicitud);
        System.out.println("El operador da posible soluciones genericas del manual");
        if (nivel.equals(solicitud)){
            System.out.println("==> Resultado: La solicitud fue resuelta con una de las opciones de ayuda nivel 2.");
        }else{
            System.out.println("==> Resultado: No se resolvió con ninguna de las ayudar dadas por el operador de ayuda nivel 2. Solicitud pasa a nivel 3");
            siguienteManejador.darSoporte(solicitud);
        }

    }
}
