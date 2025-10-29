import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean executando = true;

        while(executando) {

            int opcao = Menu.exibeMenu();

            executando = switch (opcao) {

                case 1 -> {

                    System.out.println("Digite o título: ");
                    String titulo = sc.nextLine();
                    System.out.println("Digite a descrição: ");
                    String Descricao = sc.nextLine();
                    System.out.println("Digite a data de entrega (yyyy-MM-dd):  ");
                    LocalDate dataEntrega = LocalDate.parse(sc.nextLine());
                    System.out.println("Cadastrar tarefa");

                    Tarefa novaTarefa = new Tarefa(titulo, Descricao, dataEntrega); //instância do objeto
                    System.out.println(novaTarefa);
                    yield true;
                }
                case 2 -> {
                    System.out.println("Listar tarefas pendentes");
                    yield true;
                }
                case 3 -> {
                    System.out.println("Buscar tarefa por título");
                    yield true;
                }
                case 4 -> {
                    System.out.println("Marcar tarefas como concluida");
                    yield true;
                }
                case 5 -> {
                    System.out.println("Remover uma Tarefa");
                    yield true;
                }
                case 0 -> false;
                default -> {
                    System.out.println("Opcao inválida");
                    yield true;
                }
            };
        }

    }
}
