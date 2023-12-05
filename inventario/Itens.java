package inventario;

import java.util.ArrayList;

public class Itens {
    private String nome;
    private int dano;

    public Itens(String nome, int dano) {
        this.nome = nome;
        this.dano = dano;
    }

    public String getNome() {
        return nome;
    }

    public int getDano() {
        return dano;
    }



    // Métodos para criar itens e voltar os valores deles
    public static Itens criarAdaga() {
        return new Itens("Adaga", 3);
    }

    public static Itens criarArco() {
        return new Itens("Arco", 2);
    }

    public static Itens criarArcoDoCacador() {
        return new Itens("Arco do caçador", 4);
    }

    public static Itens criarCajado() {
        return new Itens("Cajado", 2);
    }

    public static Itens criarCetroDeCura() {
        return new Itens("Cetro de cura", 60);
    }

    public static Itens criarChicote() {
        return new Itens("Chicote", 2);
    }

    public static Itens criarCimitarra() {
        return new Itens("Cimitarra", 4);
    }

    public static Itens criarClava() {
        return new Itens("Clava", 21);
    }

    public static Itens criarEspadaCurta() {
        return new Itens("Espada Curta", 4);
    }

    public static Itens criarEspadaLonga() {
        return new Itens("Espada Longa", 4);
    }

    public static Itens criarLaminaSombria() {
        return new Itens("Lâmina Sombria", 2);
    }

    public static Itens criarLanca() {
        return new Itens("Lança", 2);
    }

    public static Itens criarLancaDeAlma() {
        return new Itens("Lança de alma", 2);
    }

    public static Itens criarMarretaElemental() {
        return new Itens("Marreta elemental", 34);
    }

    public static Itens criarMarteloLeve() {
        return new Itens("Martelo leve", 90);
    }

    public static Itens criarMijolnir() {
        return new Itens("Mijolnir", 45);
    }

    public static Itens criarTridente() {
        return new Itens("Tridente", 23);
    }

    public static Itens criarArmaduraCotaDeMalha() {
        return new Itens("Armadura cota de malha", 89);
    }

    public static Itens criarArmaduraDeCouro() {
        return new Itens("Armadura de couro", 34);
    }

    public static Itens criarArmaduraDePlaca() {
        return new Itens("Armadura de Placa", 93);
    }

    public static Itens criarEscudoDeAco() {
        return new Itens("Escudo de aço", 32);
    }

    public static Itens criarEscudoDeObsidiana() {
        return new Itens("Escudo de Obsidiana", 34);
    }

    public static Itens criarEscudoMadeira() {
        return new Itens("Escudo de madeira", 23);
    }
}
