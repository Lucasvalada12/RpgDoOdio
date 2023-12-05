package inventario;

import java.util.Scanner;
public class MenuInventario {

    public void exibirInvOpcoes() {

        Scanner scan = new Scanner(System.in);



        int opcao = 0;

        Inventario inventario = new Inventario();

        while (opcao != 4) {
            System.out.println("\n%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%\n");
            System.out.println("Você entrou no inventario, o que quer fazer?");
            System.out.println("[1]-Ver o seu inventario\n[2]-Adicionar itens\n[3]-Ver poções\n[4]-Sair");
            System.out.println("\n%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%\n");



            opcao = scan.nextInt();

            switch (opcao) {
                case 1:
                    inventario.mostrarInventario();
                    break;

                case 2:
                    System.out.println("Item adicionado");
                    inventario.adicionarEscudoDeAcoAoInventario();
                    inventario.adicionarChicoteAoInventario();
                    inventario.adicionarArcoDoCacadorAoInventario();

                    inventario.adicionarPocao(Pocao.PocaoDeCura());
                    inventario.adicionarPocao(Pocao.PocaoDeMana());

                    inventario.adicionarPocao(Pocao.PocaoResistenciaAoFogo());
                    break;

                case 3:
                    inventario.mostrarPocoes();
                    break;

                case 4:
                    System.out.println("Saindo do inventario...");
                    break;

                default:
                    System.out.println("Opção inválida. Tente novamente.");
                    break;
            }
            scan.nextLine();
        }
    }
}
