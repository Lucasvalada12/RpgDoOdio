package inventario;

import inventario.Itens;

import java.util.ArrayList;

public class Inventario {

    ArrayList<Itens> itensInventario = new ArrayList<>();


    public void addItemInventario(Itens item){
        itensInventario.add(item);
    }

    public void adicionarPocao(Pocao pocao) {
        addItemInventario(pocao);
    }

    public void mostrarInventario() {
        System.out.println("Os seus itens são:");
        for (Itens item : itensInventario) {
            if (item instanceof Pocao) {
                Pocao pocao = (Pocao) item;
                System.out.println("Nome: " + pocao.getNome() + ", Efeito: " + pocao.getDano() + ", Duração de turnos: " + pocao.getDuracaoPorPartida());
            } else {
                System.out.println(item.getNome() + ", Efeito adicional: " + item.getDano());
            }
        }
    }

    public void mostrarPocoes(){
        System.out.println("Você tem as seguintes Poções:");
        for (Itens item : itensInventario) {
            if (item instanceof Pocao) {
                Pocao pocao = (Pocao) item;
                System.out.println("Nome: " + pocao.getNome() + ", Efeito: " + pocao.getDano() + ", Duração de turnos: " + pocao.getDuracaoPorPartida());
            }
        }
    }




    // Métodos para adicionar itens específicos ao inventário
    public void adicionarAdagaAoInventario() {
        addItemInventario(Itens.criarAdaga());
    }

    public void adicionarArcoAoInventario() {
        addItemInventario(Itens.criarArco());
    }

    public void adicionarArcoDoCacadorAoInventario() {
        addItemInventario(Itens.criarArcoDoCacador());
    }

    public void adicionarCajadoAoInventario() {
        addItemInventario(Itens.criarCajado());
    }

    public void adicionarCetroDeCuraAoInventario() {
        addItemInventario(Itens.criarCetroDeCura());
    }

    public void adicionarChicoteAoInventario() {
        addItemInventario(Itens.criarChicote());
    }

    public void adicionarCimitarraAoInventario() {
        addItemInventario(Itens.criarCimitarra());
    }

    public void adicionarClavaAoInventario() {
        addItemInventario(Itens.criarClava());
    }

    public void adicionarEspadaCurtaAoInventario() {
        addItemInventario(Itens.criarEspadaCurta());
    }

    public void adicionarEspadaLongaAoInventario() {
        addItemInventario(Itens.criarEspadaLonga());
    }

    public void adicionarLaminaSombriaAoInventario() {
        addItemInventario(Itens.criarLaminaSombria());
    }

    public void adicionarLancaAoInventario() {
        addItemInventario(Itens.criarLanca());
    }

    public void adicionarLancaDeAlmaAoInventario() {
        addItemInventario(Itens.criarLancaDeAlma());
    }

    public void adicionarMarretaElementalAoInventario() {
        addItemInventario(Itens.criarMarretaElemental());
    }

    public void adicionarMarteloLeveAoInventario() {
        addItemInventario(Itens.criarMarteloLeve());
    }

    public void adicionarMijolnirAoInventario() {
        addItemInventario(Itens.criarMijolnir());
    }

    public void adicionarTridenteAoInventario() {
        addItemInventario(Itens.criarTridente());
    }

    public void adicionarArmaduraCotaDeMalhaAoInventario() {
        addItemInventario(Itens.criarArmaduraCotaDeMalha());
    }

    public void adicionarArmaduraDeCouroAoInventario() {
        addItemInventario(Itens.criarArmaduraDeCouro());
    }

    public void adicionarArmaduraDePlacaAoInventario() {
        addItemInventario(Itens.criarArmaduraDePlaca());
    }

    public void adicionarEscudoDeAcoAoInventario() {
        addItemInventario(Itens.criarEscudoDeAco());
    }

    public void adicionarEscudoDeObsidianaAoInventario() {
        addItemInventario(Itens.criarEscudoDeObsidiana());
    }

    public void adicionarEscudoMadeiraAoInventario() {
        addItemInventario(Itens.criarEscudoMadeira());
    }



    public static void adicionarPocaoDeCuraAoInventario(Inventario inventario) {
        inventario.adicionarPocao(Pocao.PocaoDeCura());
    }

    public static void adicionarPocaoDeManaAoInventario(Inventario inventario) {
        inventario.adicionarPocao(Pocao.PocaoDeMana());
    }

    public static void adicionarPocaoDeInvisibilidadeAoInventario(Inventario inventario) {
        inventario.adicionarPocao(Pocao.PocaoDeInvisibilidade());
    }

    public static void adicionarPocaoResistenciaAoFogoAoInventario(Inventario inventario) {
        inventario.adicionarPocao(Pocao.PocaoResistenciaAoFogo());
    }

    public static void adicionarPocaoVenenoAoInventario(Inventario inventario) {
        inventario.adicionarPocao(Pocao.PocaoVeneno());
    }
}