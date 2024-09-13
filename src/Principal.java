import domain.Caminhao;
import domain.Carro;
import domain.Moto;
import domain.Onibus;

public class Principal {
    public static void main(String[] args) {
        Principal principal = new Principal();
        Carro carro = new Carro("Chevrolet","Onix", 2023, 4);
        Moto moto = new Moto("Yamaha", "FZ15 ABS", 2024, 400);
        Caminhao caminhao = new Caminhao("Mercedez Benz", "Actros", 2022, 13500.00);
        Onibus onibus = new Onibus("Scania", "Citywide", 2022, 60);

        principal.imprimeDetalhes(carro, moto, caminhao, onibus);
        principal.imprimeMovimentos(carro, moto, caminhao, onibus);

    }

    private void imprimeDetalhes(Carro carro, Moto moto, Caminhao caminhao, Onibus onibus){
        carro.exibirDetalhes();
        moto.exibirDetalhes();
        caminhao.exibirDetalhes();
        onibus.exibirDetalhes();
    }

    private void imprimeMovimentos(Carro carro, Moto moto, Caminhao caminhao, Onibus onibus){
        System.out.println(carro.mover());
        System.out.println(moto.mover());
        System.out.println(caminhao.mover());
        System.out.println(onibus.mover());

    }
}