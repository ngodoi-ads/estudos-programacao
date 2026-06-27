public class Carro {

    String marca;
    String modelo;
    int ano;

    // Construtor padrão
    public Carro(){

        marca = "Desconhecida";
        modelo = "Desconhecido";
        ano = 0;

    }

    // Construtor com dois parâmetros
    public Carro(String marca, String modelo){

        this.marca = marca;
        this.modelo = modelo;
        this.ano = 2024;

    }

    // Construtor com três parâmetros
    public Carro(String marca, String modelo, int ano){

        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;

    }

    public void exibirDetalhes(){

        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Ano: " + ano);

    }

}
