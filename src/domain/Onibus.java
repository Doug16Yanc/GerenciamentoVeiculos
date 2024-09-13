package domain;

public class Onibus extends Veiculo{
    private int numeroDeAssentos;

    public Onibus(String marca, String modelo, int ano, int numeroDeAssentos) {
        super(marca, modelo, ano);
        this.numeroDeAssentos = numeroDeAssentos;
    }

    public int getNumeroDeAssentos() {
        return numeroDeAssentos;
    }

    public void setNumeroDeAssentos(int numeroDeAssentos) {
        this.numeroDeAssentos = numeroDeAssentos;
    }

    @Override
    public void exibirDetalhes() {
        System.out.println("\nDetalhes do ônibus:\n");
        super.exibirDetalhes();
        System.out.println("Numero de Assentos: " + getNumeroDeAssentos());
    }


    @Override
    public String mover(){
        return "O " + getMarca() + " " + getModelo() + " está transportando passageiros.\n";
    }
}
