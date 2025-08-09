package Capitulo_03;

import java.util.Scanner;

public class HealthProfileTest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Coleta de dados do usuário
        System.out.print("Nome: ");
        String nome = input.nextLine();

        System.out.print("Sobrenome: ");
        String sobrenome = input.nextLine();

        System.out.print("Sexo: ");
        String sexo = input.nextLine();

        System.out.print("Dia de nascimento: ");
        int dia = input.nextInt();

        System.out.print("Mês de nascimento: ");
        int mes = input.nextInt();

        System.out.print("Ano de nascimento: ");
        int ano = input.nextInt();

        System.out.print("Altura (em metros): ");
        double altura = input.nextDouble();

        System.out.print("Peso (em kg): ");
        double peso = input.nextDouble();

        // Criação do objeto
        Date dataNascimento = new Date(dia, mes, ano);
        HealthProfile perfil = new HealthProfile(nome, sobrenome, sexo, dataNascimento, altura, peso);

        // Instancia HeartRates dentro do HealthProfile (corrigindo possível erro)
        perfil.setDate(dataNascimento); // garante que data está atualizada
        perfil.heartRates = new HeartRates(nome, sobrenome, dataNascimento);

        // Exibindo informações
        System.out.println("\n--- PERFIL DE SAÚDE ---");
        perfil.healthProfileDisplay();

        // Tabela de IMC
        System.out.println("\n--- TABELA DE VALORES IMC ---");
        System.out.println("IMC                 Categoria");
        System.out.println("Abaixo de 18.5      Abaixo do peso");
        System.out.println("18.5 - 24.9         Peso normal");
        System.out.println("25.0 - 29.9         Sobrepeso");
        System.out.println("30.0 ou mais        Obesidade");

        input.close();
    }
}
