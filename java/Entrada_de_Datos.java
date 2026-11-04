import java.util.Scanner;

double doblar(double numero) {
    var resultado = numero * 2;
    return resultado;
}

double triplica(double valor) {
    var resultado = Math.pow(valor, 3);
    return resultado;
}

double pedirNumero() {
    System.out.print("Introduce un numero: ");
    var scanner = new Scanner(System.in);
    return scanner.nextDouble();
}

System.out.println("Empieza el programa");

var numUsuario = pedirNumero();

var resultadoDoble = doblar(numUsuario);
var resultadoTriple = triplica(numUsuario);

System.out.println(STR."El doble es: \{resultadoDoble}");
System.out.println(STR."El triple es: \{resultadoTriple}");