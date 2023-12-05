package classes;

public class Jogador {
    private Personagens personagemEscolhido;

    public void escolherPersonagem(Personagens personagem) {
        this.personagemEscolhido = personagem;
    }

    public Personagens getPersonagemEscolhido() {
        return personagemEscolhido;
    }

    public void setPersonagemEscolhido(Personagens personagemEscolhido) {
    }

}