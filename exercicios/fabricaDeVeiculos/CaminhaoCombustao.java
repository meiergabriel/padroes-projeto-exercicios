package exercicios.fabricaDeVeiculos;

public class CaminhaoCombustao implements Caminhao{
    @Override   
    public void transportar() {
        System.out.println("Caminhão a combustão transportando...");
    }
}