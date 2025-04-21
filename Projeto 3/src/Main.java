import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        String x;
        double y;

        System.out.println("Olá, sou um algoritimo que vai ajudar você a programar-se financeiramente.");
        System.out.println("Qual o seu primeiro nome?");
        Scanner sc = new Scanner(System.in);
        x = sc.next();
        System.out.println("Qual a sau renda mensal em R$ "+ x + "?");
        y = sc.nextDouble();
        System.out.println("Aqui vai uma ideia de planejamento:");
        System.out.println("Reserva de emergencia: " + y*6);
        System.out.println("Não estrapole os gastos e economize ate atingir esse valor guardado.");
        System.out.println("Gastos essênciais: "+ y/2);
        System.out.println("Garanta que seus gastos essênciais fiquem dentro desse valor.");
        System.out.println("Para o lazer: "+ y*0.3);
        System.out.println("Usufrua desse valor des de que tenha pagado as contas!");
        System.out.println("Por fim, para que o futuro seja melhor, faremos investimentos.");
        System.out.println(x + " dedique em torno de 20% aos investimentos: "+ y*0.2);
        System.out.println("Invista em conhecimento, em ações, imooveis, entre outras coisas que podem te retornar futuramente.");


        sc.close();
    }
}