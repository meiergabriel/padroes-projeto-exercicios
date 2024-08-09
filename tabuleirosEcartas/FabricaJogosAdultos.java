

package tabuleirosEcartas;


public class FabricaJogosAdultos implements FabricaJogo {
    @Override
    public JogoTabuleiro criarJogoTabuleiro() {
        return new JogoTabuleiroAdulto();
    }

    @Override
    public JogoCartas criarJogoCartas() {
        return new JogoCartasAdulto();
    }
}
