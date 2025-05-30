import java.util.Scanner;

public class ConvierteMoneda {

    public static void convierte (String monedaBase, String monedaTarget, ConsultaMoneda consulta, Scanner lectura) {
        double cantidad;
        double cantidadConvertida;

        Monedas monedas = consulta.buscarMoneda(monedaBase, monedaTarget);
        System.out.println("El cambio válido para hoy es " + monedaBase + " = " + monedas.conversion_rate() + " " + monedaTarget);
        System.out.println("Ingresa la cantidad " + monedaBase);
        cantidad = Double.parseDouble(lectura.nextLine());
        cantidadConvertida = cantidad * monedas.conversion_rate();
        System.out.println(cantidad + " " + monedaBase + " = " + cantidadConvertida + " " + monedas.target_code());
    }
    public static void convertirOtraMoneda(ConsultaMoneda consulta, Scanner lectura) {
        System.out.println("Ingresa el código de la moneda base:");
        String monedaBase = lectura.nextLine().toUpperCase();
        System.out.println("Ingresa la moneda que deseas cambiar: ");
        String monedaObjetivo = lectura.nextLine().toUpperCase();
        convierte(monedaBase, monedaObjetivo, consulta, lectura);
    }
}