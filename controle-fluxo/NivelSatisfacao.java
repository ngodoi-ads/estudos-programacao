public class NivelSatisfacao {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite uma nota de satisfação (1 a 5): ");
        int nota = scanner.nextInt();

        switch (nota) {
            case 1:
                System.out.println("Muito insatisfeito");
                break;
            case 2:
                System.out.println("Insatisfeito");
                break;
            case 3:
                System.out.println("Neutro");
                break;
            case 4:
                System.out.println("Satisfeito");
                break;
            case 5:
                System.out.println("Muito satisfeito");
                break;
            default:
                System.out.println("Nota inválida. Digite um valor entre 1 e 5.");
        }

        scanner.close();
    }
}
