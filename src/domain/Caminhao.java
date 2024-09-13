package domain;

public class Caminhao extends Veiculo{
    private double capacidadeDeCarga;

    public Caminhao(String marca, String modelo, int ano, double capacidadeDeCarga) {
        super(marca, modelo, ano);
        this.capacidadeDeCarga = capacidadeDeCarga;
    }
    public double getCapacidadeDeCarga() {
        return capacidadeDeCarga;
    }
    public void setCapacidadeDeCarga(double capacidadeDeCarga) {
        this.capacidadeDeCarga = capacidadeDeCarga;
    }

    @Override
    public void exibirDetalhes() {
        System.out.println("\nDetalhes do caminhão:\n");
        super.exibirDetalhes();
        System.out.println("Capacidade de Carga: " + getCapacidadeDeCarga());
    }

    @Override
    public String mover(){
        return "O " + getMarca() + " " + getModelo() + " está transportando carga.\n";
    }
}
