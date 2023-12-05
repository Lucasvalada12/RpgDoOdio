import classes.*;
import java.util.Scanner;

public class Funcoes {
    Scanner ler = new Scanner(System.in);
    Jogador jogador = new Jogador();

    public void escolherClasse() {
        System.out.println("Escolha o seu personagem:");
        System.out.println("[1] - Cavaleiro");
        System.out.println("[2] - Mago");
        System.out.println("[3] - Clerigo");
        System.out.println("[4] - Arqueira");
        System.out.println("[5] - Ladino");

        int classe = ler.nextInt();
        Personagens personagemEscolhido = null;

        switch (classe) {
            case 1:
                Cavaleiro cavaleiro = new Cavaleiro();
                jogador.escolherPersonagem(cavaleiro);
                personagemEscolhido = cavaleiro;
                System.out.println("Você escolheu o Cavaleiro!");
                break;
            case 2:
                Mago mago = new Mago();
                jogador.escolherPersonagem(mago);
                personagemEscolhido = mago;
                System.out.println("Você escolheu o Mago!");
                break;
            case 3:
                Clerigo clerigo = new Clerigo();
                jogador.escolherPersonagem(clerigo);
                personagemEscolhido = clerigo;
                System.out.println("Você escolheu o Clerigo!");
                break;
            case 4:
                Arqueira arqueira = new Arqueira();
                jogador.escolherPersonagem(arqueira);
                personagemEscolhido = arqueira;
                System.out.println("Você escolheu a Arqueira!");
                break;
            case 5:
                Ladino ladino = new Ladino();
                jogador.escolherPersonagem(ladino);
                personagemEscolhido = ladino;
                System.out.println("Você escolheu o Ladino!");
                break;
            default:
                System.out.println("Opção inválida!");
                break;
        }
        jogador.setPersonagemEscolhido(personagemEscolhido);
    }

    public void mostrarStatus() {
        Personagens personagemEscolhido = jogador.getPersonagemEscolhido();

        if (personagemEscolhido != null) {
            System.out.println("Status do personagem escolhido:");
            System.out.println("Nome: " + personagemEscolhido.getNome());
            System.out.println("Vida: " + personagemEscolhido.getVida());
            System.out.println("Ataque: " + personagemEscolhido.getAtaque());
            System.out.println("Defesa: " + personagemEscolhido.getArmadura());
            // Adicione outros atributos relevantes do personagem
        } else {
            System.out.println("Você ainda não escolheu um personagem.");
        }
    }
}
