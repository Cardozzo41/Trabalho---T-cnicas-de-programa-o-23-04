import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        SaldoBancario usuario1 = new SaldoBancario();
        char opcao, opcao2, escolha;
        int criarSenha, senha;

        //DIGITANDO AS INFORMAÇÕES
        System.out.print("Digite Seu Primeiro Nome: ");
        usuario1.nome = sc.nextLine();
        System.out.print("Digite Seu Sobrenome: ");
        usuario1.sobreNome = sc.nextLine();
        System.out.print("Cria a Sua Senha: ");
        criarSenha = sc.nextInt();

        System.out.println();
        System.out.print("Olá " + usuario1.nome +" "+ usuario1.sobreNome + ", Gostaria de Ver Seu Saldo Bancário ? (S/N) ");
        escolha = Character.toUpperCase(sc.next().charAt(0));

        if (escolha == 'S'){

            while (escolha == 'S'){

                System.out.print("Digite a Sua Senha: ");
                senha = sc.nextInt();

                if (senha == criarSenha){

                    while (senha == criarSenha){
                        System.out.println();
                        System.out.println(usuario1.toString());
                        System.out.println();

                        //REALIZANDO ALGUM DEPOSITO
                        System.out.print("Gostaria de realizar algum deposito ? (S/N) ");
                        opcao = Character.toUpperCase(sc.next().charAt(0));

                        while (opcao == 'S') {
                            System.out.print("Digite a Quantia: ");
                            double quantia = sc.nextDouble();
                            usuario1.depositoQuantia(quantia);

                            System.out.print("Gostaria de realizar outro depósito? (S/N) ");
                            opcao = Character.toUpperCase(sc.next().charAt(0));
                        }

                        System.out.println();
                        System.out.println(usuario1.toString());
                        System.out.println();

                        //REALIZANDO ALGUM SAQUE
                        System.out.print("Gostaria de realizar algum saque ? (S/N) ");
                        opcao2 = Character.toUpperCase(sc.next().charAt(0));

                        while (opcao2 == 'S'){
                            System.out.print("Digite a Quantia: ");
                            double quantia2 = sc.nextDouble();
                            usuario1.saqueQuantia(quantia2);

                            System.out.print("Gostaria de realizar outro saque? (S/N) ");
                            opcao2 = Character.toUpperCase(sc.next().charAt(0));
                        }

                        System.out.println();
                        System.out.println(usuario1.toString());
                        System.out.println();

                        System.out.print("Se desejar realizar outra operação digite a senha novamente, se não digite 1 e aperta(Enter): ");
                        senha = sc.nextInt();
                        System.out.println();

                    }
                } else{
                    System.out.println("Senha incorreta, Digite novamente: ");
                }

            }

        }else {
            System.out.println("Até a Proxima " + usuario1.nome +" "+ usuario1.sobreNome);
        }

        sc.close();
    }
}
class SaldoBancario{
    String nome;
    String sobreNome;
    double saldoDaConta;

    public double depositoQuantia(double valor){
        saldoDaConta += valor;
        return saldoDaConta;
    }

    public double saqueQuantia(double valor2){
        saldoDaConta -= valor2;
        return saldoDaConta;
    }

    public String toString(){
        return nome +" "+ sobreNome + ", O Salda da sua Conta é de: R$ " + String.format("%.2f", saldoDaConta);
    }

}