package Ejercicio1y2;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        CalculadoraA operaciones = new CalculadoraA();
        int vueltas = 0;

        while (vueltas < 5) {
            System.out.print("Por favor ingrese el primer número: ");
            int primerNumero = scanner.nextInt();
            System.out.print("Ahora ingrese el segundo número: ");
            int segundoNumero = scanner.nextInt();
            System.out.print("¿Qué operación desea realizar? (+, -, *, /): ");
            char operacion = scanner.next().charAt(0);

            double resultado = 0;
            boolean operacionElegidaCorrectamente = true;

            if (operacion == '+') {
                resultado = operaciones.constructorQueSuma(primerNumero, segundoNumero);
            } else if (operacion == '-') {
                resultado = operaciones.constructorQueResta(primerNumero, segundoNumero);
            } else if (operacion == '*') {
                resultado = operaciones.constructorQueMultiplica(primerNumero, segundoNumero);
            } else if (operacion == '/') {
                resultado = operaciones.constructorQueDivide(primerNumero, segundoNumero);
            } else {
                System.out.println("Operación inválida");
                operacionElegidaCorrectamente = false;
            }

            if (operacionElegidaCorrectamente) {
                System.out.println("Resultado de la operación: " + resultado);
                if (resultado < 0) {
                    System.out.println("EL RESULTADO FUE NEGATIVO");
                } else if (resultado >= 0 && resultado < 10000) {
                    System.out.println("RESULTADO DENTRO DE LOS LÍMITES REQUERIDOS.");
                } else {
                    System.out.println("Error!! Resultado muy grande");
                }
            }

            vueltas++;
        }
        scanner.close();
    }
}