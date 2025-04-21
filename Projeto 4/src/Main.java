import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Seu salário: ");
        double salario = scanner.nextDouble();

        System.out.println("Digite o valor gasto com alimentação: ");
        double alimentacao = scanner.nextDouble();

        System.out.println("Digite o valor gasto com transporte: ");
        double transporte = scanner.nextDouble();

        System.out.println("Digite o valor gasto com lazer: ");
        double lazer = scanner.nextDouble();

        System.out.println("Digite o valor gasto com outros: ");
        double outros = scanner.nextDouble();


        double totalGastos = alimentacao + transporte + lazer + outros;
        double total = salario - totalGastos;

        System.out.println("O total dos seus gastos é: R$ " + totalGastos);
        System.out.println("O total que lhe resta é: " + total);

        scanner.close();
    }
}