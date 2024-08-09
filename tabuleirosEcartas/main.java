package tabuleirosEcartas;

public class main {
    public static void main(String[] args) {
        FabricaJogo fabricaAdultos = new FabricaJogosAdultos();
        Cliente clienteAdultos = new Cliente(fabricaAdultos);
        clienteAdultos.jogar();

        FabricaJogo fabricaInfantis = new FabricaJogosInfantis();
        Cliente clienteInfantis = new Cliente(fabricaInfantis);
        clienteInfantis.jogar();
    }
}
