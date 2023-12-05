package inventario;

import inventario.Itens;

public class Pocao extends Itens {

    private int duracaoPorPartida;
    private String efeito;
    private int cura;

    public Pocao(String nome, int efeitoDano, int duracaoPorPartida) {
        super(nome, efeitoDano);
        this.duracaoPorPartida = duracaoPorPartida;
    }

    public int getDuracaoPorPartida() {
        return duracaoPorPartida;
    }


    public Pocao(String nome, int cura, String efeito) {
        super(nome, 0); // O dano de uma poção é 0
        this.cura = cura;
        this.efeito = efeito;
    }

    public int getCura() {
        return cura;
    }

    public String getEfeito() {
        return efeito;
    }


    public static Pocao PocaoDeCura() {
        return new Pocao("Poção de Cura", 23, 2);
    }

    public static Pocao PocaoDeMana() {
        return new Pocao("Poção de Mana", 23, 2);
    }

    public static Pocao PocaoDeInvisibilidade() {
        return new Pocao("Poção de Invisibilidade", 23, 1);
    }

    public static Pocao PocaoResistenciaAoFogo() {
        return new Pocao("Poção Resistência ao Fogo", 63, 9);
    }

    public static Pocao PocaoVeneno() {
        return new Pocao("Poção Veneno", 46, 3);
    }

}