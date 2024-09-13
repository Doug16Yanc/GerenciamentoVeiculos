package domain;

public class Carro extends Veiculo{
    private int quantidadeDePortas;

    public Carro(String marca, String modelo, int ano, int quantidadeDePortas) {
        super(marca, modelo, ano);
        this.quantidadeDePortas = quantidadeDePortas;
    }

    public int getQuantidadeDePortas() {
        return quantidadeDePortas;
    }

    public void setQuantidadeDePortas(int quantidadeDePortas) {
        this.quantidadeDePortas = quantidadeDePortas;
    }

    @Override
    public void exibirDetalhes(){
        System.out.println("\nDetalhes do carro:\n");
        super.exibirDetalhes();
        System.out.println("Quantidade de portas: " + getQuantidadeDePortas());
    }

    @Override
    public String mover(){
        return "\nO " + getMarca() + " " + getModelo() + " está acelerando na estrada.\n";
    }
}
