package Capitulo_03;

public class DateTest {
    public static void main(String[] args) {
        // Criando dois objetos Date
        Date data1 = new Date(9, 8, 2025);
        Date data2 = new Date(1, 1, 2000);

        // Exibindo as datas iniciais
        System.out.print("Data 1: ");
        data1.displayDate();
        System.out.println();

        System.out.print("Data 2: ");
        data2.displayDate();
        System.out.println();

        // Alterando os valores da data 1
        data1.setDia(10);
        data1.setMes(12);
        data1.setAno(2030);

        // Alterando os valores da data 2
        data2.setDia(25);
        data2.setMes(4);
        data2.setAno(1995);

        // Exibindo as datas atualizadas
        System.out.println("\nDatas atualizadas:");
        System.out.print("Data 1: ");
        data1.displayDate();
        System.out.println();

        System.out.print("Data 2: ");
        data2.displayDate();
        System.out.println();
    }
}
