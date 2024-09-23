package Services;

import Domains.*;
import Domains.abstracts.Operacion;

import java.io.*;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean continuar = true;

        while (continuar) {
            try {
                System.out.println("Seleccione la operación a realizar:");
                System.out.println("1. Sumar");
                System.out.println("2. Restar");
                System.out.println("3. Multiplicar");
                System.out.println("4. Dividir");
                System.out.println("5. Potencia");
                System.out.println("6. Leer número desde archivo");
                System.out.println("0. Salir");

                int opcion = scanner.nextInt();

                if (opcion == 0) {
                    continuar = false;
                    System.out.println("Gracias por usar la calculadora.");
                    break;
                }

                if (opcion == 6) {
                    System.out.print("Ingrese el nombre del archivo (con extensión): ");
                    String archivo = scanner.next();
                    leerNumeroDesdeArchivo(archivo);
                    continue;
                }

                System.out.print("Ingrese el primer número: ");
                double num1 = scanner.nextDouble();
                System.out.print("Ingrese el segundo número: ");
                double num2 = scanner.nextDouble();

                Operacion operacion = null;

                switch (opcion) {
                    case 1:
                        operacion = new Suma(num1, num2);
                        break;
                    case 2:
                        operacion = new Resta(num1, num2);
                        break;
                    case 3:
                        operacion = new Multiplicacion(num1, num2);
                        break;
                    case 4:
                        operacion = new Division(num1, num2);
                        break;
                    case 5:
                        operacion = new Potencia(num1, num2);
                        break;
                    default:
                        throw new InputMismatchException("Opción no válida.");
                }

                double resultado = operacion.calcular();
                System.out.println("Resultado: " + resultado);

            } catch (ArithmeticException e) {
                System.out.println("Error: " + e.getMessage());
            } catch (FileNotFoundException e) {
                System.out.println("Error: Archivo no encontrado.");
            } catch (InputMismatchException e) {
                System.out.println("Error: Entrada inválida. Ingrese un número.");
                scanner.next();
            } catch (Exception e) {
                System.out.println("Error inesperado: " + e.getMessage());
            }
        }

        scanner.close();
    }

    public static void leerNumeroDesdeArchivo(String nombreArchivo) throws FileNotFoundException {
        File archivo = new File(nombreArchivo);
        Scanner lector = new Scanner(archivo);

        if (lector.hasNextDouble()) {
            double numero = lector.nextDouble();
            System.out.println("Número leído desde archivo: " + numero);
        } else {
            System.out.println("El archivo no contiene un número válido.");
        }

        lector.close();
    }
}
