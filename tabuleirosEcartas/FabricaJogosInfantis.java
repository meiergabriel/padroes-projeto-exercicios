

package tabuleirosEcartas;


public class FabricaJogosInfantis implements FabricaJogo {
    @Override
    public JogoTabuleiro criarJogoTabuleiro() {
        return new JogoTabuleiroInfantil();
    }

    @Override
    public JogoCartas criarJogoCartas() {
        return new JogoCartasInfantil();
    }
}
