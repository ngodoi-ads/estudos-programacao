public class Produto {

    private String nome;
    private double preco;
    private int quantidadeEmEstoque;

    public Produto(String nome, double preco, int quantidadeEmEstoque){

        this.nome = nome;
        this.preco = preco;
        this.quantidadeEmEstoque = quantidadeEmEstoque;

    }

    public void exibirInformacoes(){

        System.out.println("Nome: " + nome);
        System.out.println("Preço: " + preco);
        System.out.println(
        "Quantidade em Estoque: " 
        + quantidadeEmEstoque);

    }

}
public class MainProduto {
    public static void main(String[] args){

        Produto produto1 =
        new Produto("Notebook",2500.00,10);

        Produto produto2 =
        new Produto("Smartphone",1500.00,20);


        produto1.exibirInformacoes();
        produto2.exibirInformacoes();


    }

}
