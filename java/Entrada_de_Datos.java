import java.util.Scanner;

public class Entrada_de_Datos {
    static double doblar(double numero) {
        var resultado = numero * 2;
        return resultado;
    }
    static double triplica(double valor) {
        var resultado = Math.pow(valor, 3);
        return resultado;
    }

    static double pedirNumero(Scanner scanner) {
        System.out.print("Introduce un numero: ");
        return scanner.nextDouble();
    }

    public static void main(String[] args) {
        System.out.println("Empieza el programa");

        try (var scanner = new Scanner(System.in)) {
            var numUsuario = pedirNumero(scanner);

            var resultadoDoble = doblar(numUsuario);
            var resultadoTriple = triplica(numUsuario);

            System.out.println("El doble es: " + resultadoDoble);
            System.out.println("El triple es: " + resultadoTriple);
        }
    }
}