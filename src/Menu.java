import java.util.Scanner;

public class Menu {

    static int  exibeMenu() {

        System.out.println("====MENU====");
        System.out.println("1- Casdastrar tarefa");
        System.out.println("2- Listar tarefas pendentes");
        System.out.println("3- Buscar tarefa por título");
        System.out.println("4- Marcar tarefas como concluida");
        System.out.println("5- Remover uma Tarefa");
        System.out.println("0- Sair do programa");
        System.out.println();
        System.out.println("Digite uma opção: ");
        Scanner sc = new Scanner(System.in);
        int opcao = sc.nextInt();
        System.out.println("A opcao escolhida foi " + opcao);
        return opcao;

    }
}
