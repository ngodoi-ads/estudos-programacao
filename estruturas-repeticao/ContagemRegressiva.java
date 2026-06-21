public class ContagemRegressiva {
    public static void main(String[] args) {
        int numero = 5; // valor inicial da contagem

        // Contagem regressiva usando do-while
        do {
            System.out.println("Número: " + numero);
            numero--;
        } while (numero >= 0);

        System.out.println("Fim da contagem!");
    }
}
