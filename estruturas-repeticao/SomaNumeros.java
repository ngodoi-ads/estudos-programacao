public class SomaNumeros {
    public static void main(String[] args) {
        int contador = 1;
        int soma = 0;

        // Soma dos números de 1 a 10 usando while
        while (contador <= 10) {
            soma += contador;
            contador++;
        }

        System.out.println("A soma dos números de 1 a 10 é: " + soma);
    }
}
