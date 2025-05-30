import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner lectura = new Scanner(System.in);
        ConsultaMoneda consulta = new ConsultaMoneda();
        int opcion =0;
        while (opcion != 8){
            System.out.println("***********************************\n" +
                    "Conversor de Monedas\n\n" +
                    "Escribe el número de la opción que quieres convertir\n\n" +
                        "1.Dolar a Peso Argentino\n" +
                        "2.Peso Argentino a Dolar\n" +
                        "3.Dolar a Real Brasilero\n" +
                        "4.Real Brasilero a Dolar\n" +
                        "5.Dolar a Peso Chileno\n" +
                        "6.Peso Chileno a Dolar\n" +
                        "7.Convertir a otra moneda\n" +
                        "8.Salir");

            opcion = lectura.nextInt();
            lectura.nextLine();

            switch (opcion){
                case 1:
                    ConvierteMoneda.convierte("USD", "ARS", consulta, lectura);
                    break;
                case 2:
                    ConvierteMoneda.convierte("ARS", "USD", consulta, lectura);
                    break;
                case 3:
                    ConvierteMoneda.convierte("UDS", "BRL", consulta, lectura);
                    break;
                case 4:
                    ConvierteMoneda.convierte("BRL", "USD", consulta, lectura);
                    break;
                case 5:
                    ConvierteMoneda.convierte("USD", "CLP", consulta, lectura);
                    break;
                case 6:
                    ConvierteMoneda.convierte("CLP", "USD", consulta, lectura);
                    break;
                case 7:
                    ConvierteMoneda.convertirOtraMoneda(consulta, lectura);
                    break;
                case 8:
                    System.out.println("El programa finalizó con éxito");
                    break;
                default:
                    System.out.println("Opción no válida");
                    break;
            }
        }
    }
}