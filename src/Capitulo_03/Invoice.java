package Capitulo_03;

public class Invoice {
    private String numero;
    private String descricao;
    private int quantidadeComprada;
    private double preco;

    public Invoice(String numero, String descricao, int quantidadeComprada, double preco) {
        this.numero = numero;
        this.descricao = descricao;
        this.quantidadeComprada = quantidadeComprada;
        this.preco = preco;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getQuantidadeComprada() {
        return quantidadeComprada;
    }

    public void setQuantidadeComprada(int quantidadeComprada) {
        this.quantidadeComprada = quantidadeComprada;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public double getInvoiceAmount(){
        double total = quantidadeComprada * preco;
        if (total < 0){
            return 0;
        }
        return total;
    }
}
