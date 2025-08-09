package Capitulo_03;

public class InvoiceTest {
    public static void main(String[] args) {
        // Criando um objeto Invoice com valores positivos
        Invoice invoice1 = new Invoice("001", "Teclado Mecânico", 2, 250.00);
        System.out.println("Fatura 1:");
        System.out.println("Número: " + invoice1.getNumero());
        System.out.println("Descrição: " + invoice1.getDescricao());
        System.out.println("Quantidade: " + invoice1.getQuantidadeComprada());
        System.out.println("Preço unitário: R$" + invoice1.getPreco());
        System.out.println("Valor total da fatura: R$" + invoice1.getInvoiceAmount());
        System.out.println();

        // Criando um objeto Invoice com quantidade negativa
        Invoice invoice2 = new Invoice("002", "Mouse Gamer", -3, 180.00);
        System.out.println("Fatura 2 (quantidade negativa):");
        System.out.println("Valor total da fatura: R$" + invoice2.getInvoiceAmount());
        System.out.println();

        // Criando um objeto Invoice com preço negativo
        Invoice invoice3 = new Invoice("003", "Monitor", 2, -500.00);
        System.out.println("Fatura 3 (preço negativo):");
        System.out.println("Valor total da fatura: R$" + invoice3.getInvoiceAmount());
        System.out.println();

        // Modificando dados com setters
        invoice1.setQuantidadeComprada(3);
        invoice1.setPreco(200.00);
        System.out.println("Fatura 1 (modificada):");
        System.out.println("Nova quantidade: " + invoice1.getQuantidadeComprada());
        System.out.println("Novo preço unitário: R$" + invoice1.getPreco());
        System.out.println("Novo valor total: R$" + invoice1.getInvoiceAmount());
    }
}
