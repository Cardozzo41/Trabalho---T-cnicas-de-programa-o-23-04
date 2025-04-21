import java.util.Scanner;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        //Ate 1.518,00 tax = 7,5%
        //De 1.518,00 ate  2.793,00 tax = 9%
        //de 2.793,00 ate 4.190,00 tax = 12%
        //De  4.190,00 em diante tax = 14%

        Funcionario clt = new Funcionario();

        System.out.print("Digite seu Salario:");
        clt.salario = sc.nextDouble();
        double porcent;


        if (clt.salario <= 1518){
            porcent = 7.5;
        } else if (clt.salario > 1518 && clt.salario <= 2793) {
            porcent = 9;
        } else if (clt.salario > 2793 && clt.salario <= 4190) {
            porcent = 12;
        }else {
            porcent = 14;
        }

        clt.totalApagar(porcent);

        System.out.printf("Taxa a ser paga: %.2f%n", clt.result);
        System.out.printf("Total a receber: %.2f%n", clt.resultado());
        sc.close();
    }
}
class Funcionario{
    double salario;
    double result;

    public double totalApagar(double taxa){
        return result = salario * taxa / 100;
    }

    public double resultado(){
        return result = salario - result;
    }
}