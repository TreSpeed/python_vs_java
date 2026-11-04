public class Main {
    static double doblar(double numero) {
        var resultado = numero * 2;
        return resultado;
    }


    static double triplica(double valor) {
        var resultado = Math.pow(valor, 3);
        return resultado;
    }

    public static void main(String[] args) {
        System.out.println("Empieza el programa");
        var multiplica = doblar(5);
        System.out.println(multiplica);
    }
}