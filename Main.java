
import inventario.Inventario;
import java.util.Scanner;
public class Main {
    public static void main(String[] args){

        Funcoes f = new Funcoes();
        MenuPrincipal m = new MenuPrincipal();
        Inventario i = new Inventario();
        System.out.println("ola aventureiros,  bem vindos a eldorian!");
        System.out.println();

        f.escolherClasse();
        m.menu();

        //i.inventario();




    }
}