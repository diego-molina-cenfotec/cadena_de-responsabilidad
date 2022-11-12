public class Manejador3 implements ManejadorInterfase {
    private String solicitud = "nivel3";
    @Override
    public void darSoporte(String solicitud) {
        System.out.println("  ");
        System.out.println(" Ahora esta en el nivel 3 de ayuda, llamada con especialista.");
        System.out.println("==> Resultado:Este si resolvió");
    }
}
