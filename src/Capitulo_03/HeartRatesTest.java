package Capitulo_03;

import java.util.Scanner;

public class HeartRatesTest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Coleta de informações
        System.out.print("Digite o primeiro nome: ");
        String nome = input.nextLine();

        System.out.print("Digite o sobrenome: ");
        String sobrenome = input.nextLine();

        System.out.print("Digite o dia de nascimento (1-31): ");
        int dia = input.nextInt();

        System.out.print("Digite o mês de nascimento (1-12): ");
        int mes = input.nextInt();

        System.out.print("Digite o ano de nascimento (ex: 2000): ");
        int ano = input.nextInt();

        // Criando o objeto Date e HeartRates
        Date dataNascimento = new Date(dia, mes, ano);
        HeartRates pessoa = new HeartRates(nome, sobrenome, dataNascimento);

        // Exibindo as informações
        pessoa.heartsToDisplay();


        input.close();
    }
}
