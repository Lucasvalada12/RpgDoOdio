import inventario.Inventario;
import inventario.MenuInventario;
import locais.taverna.Taverna;

import java.util.Scanner;

public class MenuPrincipal {
    Taverna t = new Taverna();
    Scanner ler = new Scanner(System.in);
    Inventario i = new Inventario();
    MenuInventario inv = new MenuInventario();
    Funcoes f = new Funcoes();
    boolean continuar = true;

    public int menu() {
        while (continuar) {
            System.out.println("---------------------------------------");
            System.out.println("Escolha a opçao desejada:");
            System.out.println("1 - ir a Taverna");
            System.out.println("2 - inventario");
            System.out.println("3 - ir para a arena");
            System.out.println("4 - Status dos personagens");
            System.out.println("5 - ir ao Fereiro");
            System.out.println("6 - Sair do jogo");
            System.out.println("---------------------------------------");
            int menus = ler.nextInt();

            switch (menus) {
                case 1:
                    t.MenuTaverna();
                    break;
                case 2:
                    inv.exibirInvOpcoes();

                    break;
                case 3:

                    break;
                case 4:
                f.mostrarStatus();
                    break;
                case 5:
                    break;
                case 6:
                    continuar=false;
                    break;
                default:

                    break;
            }

        }
        return menu();
    }
}