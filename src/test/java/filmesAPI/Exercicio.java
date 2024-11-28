package filmesAPI;

import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Quando;
import io.cucumber.java.pt.Entao;

public class Exercicio {

    private boolean estouFeliz = false;

    @Dado("que eu estou com fome")
    public void estouComFome() {
        System.out.println("Estou com fome");
        estouFeliz = false;
    }

    @Quando("eu comer um pao de queijo")
    public void comerPaoDeQueijo() {
        System.out.println("Vou comer um pão de queijo");
        estouFeliz = true;
    }

    @Entao("eu ficarei feliz")
    public void euFicareiFeliz() {
        System.out.println("Eu ficarei feliz");
        assert estouFeliz;
    }
}