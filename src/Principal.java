
import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String menu = """
                
                BIENVENIDOS AL CONVERSOR DE MONEDAS!
                ^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^
                1-Convertir de USD (Dolares) => a EUR (EUROS).
                2-Convertir de EUR (EUROS) => a USD (Dolares).
                3-Convertir de USD (Dolares) => a ARS (Peso Argentino).
                4-Convertir de ARS (Peso Argentino) => a USD (Dolares).
                5-Convertir de USD (Dolares) => a BOB (Peso Boliviano).
                6-Convertir de BOB (Peso Boliviano) => a USD (Dolares).
                7-Convertir de USD (Dolares) => a COP (Peso Colombiano).
                8-Convertir de COP (Peso Colombiano) => a USD (Dolares).
                9-Convertir de USD (Dolares) => a DOP (Peso Dominicano).
                10-Convertir de DOP (Peso Dominicano) => a USD (Dolares).
                11-Salir
                """;

        int opcion;
        int seguir;
        do {
            System.out.println(menu);
            System.out.println("Elija la opcion deseada: ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    convertirMoneda("USD", "EUR", scanner);
                    System.out.println("Quiere seguir convirtiendo? ");
                    System.out.println("1-si");
                    System.out.println("2-no");
                    seguir = scanner.nextInt();
                    if (seguir == 1) {
                        break;
                    } else {
                        opcion = 11;
                        break;
                    }
                case 2:
                    convertirMoneda("EUR", "USD", scanner);
                    System.out.println("Quiere seguir convirtiendo? ");
                    System.out.println("1-si");
                    System.out.println("2-no");
                    seguir = scanner.nextInt();
                    if (seguir == 1) {
                        break;
                    } else {
                        opcion = 11;
                        break;
                    }
                case 3:
                    convertirMoneda("USD", "ARS", scanner);
                    System.out.println("Quiere seguir convirtiendo? ");
                    System.out.println("1-si");
                    System.out.println("2-no");
                    seguir = scanner.nextInt();
                    if (seguir == 1) {
                        break;
                    } else {
                        opcion = 11;
                        break;
                    }
                case 4:
                    convertirMoneda("ARS", "USD", scanner);
                    System.out.println("Quiere seguir convirtiendo? ");
                    System.out.println("1-si");
                    System.out.println("2-no");
                    seguir = scanner.nextInt();
                    if (seguir == 1) {
                        break;
                    } else {
                        opcion = 11;
                        break;
                    }
                case 5:
                    convertirMoneda("USD", "BOB", scanner);
                    System.out.println("Quiere seguir convirtiendo? ");
                    System.out.println("1-si");
                    System.out.println("2-no");
                    seguir = scanner.nextInt();
                    if (seguir == 1) {
                        break;
                    } else {
                        opcion = 11;
                        break;
                    }
                case 6:
                    convertirMoneda("BOB", "USD", scanner);
                    System.out.println("Quiere seguir convirtiendo? ");
                    System.out.println("1-si");
                    System.out.println("2-no");
                    seguir = scanner.nextInt();
                    if (seguir == 1) {
                        break;
                    } else {
                        opcion = 11;
                        break;
                    }
                case 7:
                    convertirMoneda("USD", "COP", scanner);
                    System.out.println("Quiere seguir convirtiendo? ");
                    System.out.println("1-si");
                    System.out.println("2-no");
                    seguir = scanner.nextInt();
                    if (seguir == 1) {
                        break;
                    } else {
                        opcion = 11;
                        break;
                    }
                case 8:
                    convertirMoneda("COP", "USD", scanner);
                    System.out.println("Quiere seguir convirtiendo? ");
                    System.out.println("1-si");
                    System.out.println("2-no");
                    seguir = scanner.nextInt();
                    if (seguir == 1) {
                        break;
                    } else {
                        opcion = 11;
                        break;
                    }
                case 9:
                    convertirMoneda("USD", "DOP", scanner);
                    System.out.println("Quiere seguir convirtiendo? ");
                    System.out.println("1-si");
                    System.out.println("2-no");
                    seguir = scanner.nextInt();
                    if (seguir == 1) {
                        break;
                    } else {
                        opcion = 11;
                        break;
                    }
                case 10:
                    convertirMoneda("DOP", "USD", scanner);
                    System.out.println("Quiere seguir convirtiendo? ");
                    System.out.println("1-si");
                    System.out.println("2-no");
                    seguir = scanner.nextInt();
                    if (seguir == 1) {
                        break;
                    } else {
                        opcion = 11;
                        break;
                    }
                case 11:
                    System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
                    System.out.println(" ");
                    System.out.println("GRACIAS POR USAR NUESTRO CONVERSOR DE MONEDAS");
                    System.out.println(" ");
                    System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
                    break;
                default:
                    System.out.println("Opción no válida, por favor elija una opción del menú.");
            }
        } while (opcion != 11);
        System.out.println("===================================================");
        System.out.println(" ");
        System.out.println("GRACIAS POR UTILIZAR NUESTRO CONVERSOR DE MONEDAS");
        System.out.println(" ");
        System.out.println("==================================================");

        scanner.close();
    }

    private static void convertirMoneda(String baseCode, String targetCode, Scanner scanner) {
        System.out.println("Ingrese el monto total a convertir: ");
        double amount = scanner.nextDouble();
        Conversion conversion = new Conversion(baseCode, targetCode, amount);
        try {
            double result = conversion.convert();
            System.out.println(amount + " " + baseCode + " son " + result + " " + targetCode);
            System.out.println("********************************************************************");
            System.out.println("SU MONEDA A SIDO CONVERTIDA A LA OPCION DESEADA!");
            System.out.println("********************************************************************");
        } catch (IOException | InterruptedException | InputMismatchException e) {
            System.out.println("Error al realizar la conversión: " + e.getMessage());
        }
    }
}