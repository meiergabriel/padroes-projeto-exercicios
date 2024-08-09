package exercicios.fabricaDeVeiculos;

public class main {
    public static void main(String[] args) {
        FabricaVeiculo fabricaEletricos = new FabricaVeiculosEletricos();
        Carro carroEletrico = fabricaEletricos.criarCarro();
        Caminhao caminhaoEletrico = fabricaEletricos.criarCaminhao();

        carroEletrico.dirigir(); 
        caminhaoEletrico.transportar(); 

        FabricaVeiculo fabricaCombustao = new FabricaVeiculosCombustao();
        Carro carroCombustao = fabricaCombustao.criarCarro();
        Caminhao caminhaoCombustao = fabricaCombustao.criarCaminhao();

        carroCombustao.dirigir(); 
        caminhaoCombustao.transportar(); 
    }
}
