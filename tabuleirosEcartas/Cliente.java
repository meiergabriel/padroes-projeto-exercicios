package tabuleirosEcartas;

public class Cliente {
private FabricaJogo fabricaJogo;

    public Cliente(FabricaJogo fabrica) {
        this.fabricaJogo = fabrica;
    }

    public void jogar() {
        JogoTabuleiro jogoTabuleiro = fabricaJogo.criarJogoTabuleiro();
        jogoTabuleiro.jogar();

        JogoCartas jogoCartas = fabricaJogo.criarJogoCartas();
        jogoCartas.embaralhar();
}
}