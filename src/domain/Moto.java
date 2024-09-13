package domain;

public class Moto extends Veiculo{
    private int cilindradas;

    public Moto(String marca, String modelo, int ano, int cilindradas) {
        super(marca, modelo, ano);
        this.cilindradas = cilindradas;
    }
    public int getCilindradas() {
        return cilindradas;
    }
    public void setCilindradas(int cilindradas) {
        this.cilindradas = cilindradas;
    }

    @Override
    public void exibirDetalhes() {
        System.out.println("\nDetalhes da moto:\n");
        super.exibirDetalhes();
        System.out.println("Cilindradas: " + getCilindradas());
    }


    @Override
    public String mover(){
        return "A " + getMarca() + " " + getModelo() + " está ziguezagueando pelo trânsito.\n";
    }
}
