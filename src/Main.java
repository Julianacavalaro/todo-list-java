import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean executando = true;
        Tarefa novaTarefa = new Tarefa(); //instância do objeto
        List<Tarefa> listaTarefas = new ArrayList<>();
        List<Tarefa> listaTarefasPendentes = new ArrayList<>();
        List<Tarefa> listarPorTitulo = new ArrayList<>();
        List<Tarefa> listaTarefasConcluidas = new ArrayList<>();

        while (executando) {

            int opcao = Menu.exibeMenu();

            executando = switch (opcao) {

                case 1 -> {

                    var tarefa = novaTarefa.addTarefa();
                    System.out.println(tarefa);
                    listaTarefas.add(tarefa);

                    yield true;
                }
                case 2 -> {
                    System.out.println("Listar tarefas pendentes");
                    for (Tarefa tarefa : listaTarefas) {
                        if (!tarefa.isConcluida()) {
                            listaTarefasPendentes.add(tarefa);
                        }
                    }
                    System.out.println(listaTarefasPendentes);
                    yield true;
                }
                case 3 -> {
                    System.out.println("Buscar tarefa por título");
                    System.out.println("Digite o título para buscar: ");
                    String titulo = sc.nextLine();
                    for (Tarefa tarefa : listaTarefas) {
                        if (tarefa.getTitulo().equals(titulo)) {
                            listarPorTitulo.add(tarefa);
                        }
                    }
                    System.out.println(listarPorTitulo);
                    yield true;
                }
                case 4 -> {
                    System.out.println("Marcar tarefas como concluida");
                    System.out.println("Digite o título para marcar como concluida: ");
                    String titulo = sc.nextLine();
                    for (Tarefa tarefa : listaTarefas) {
                        if (tarefa.getTitulo().equals(titulo)) {
                            tarefa.setConcluida(true);
                            listaTarefasPendentes.remove(tarefa);
                            listaTarefasConcluidas.add(tarefa);
                        }
                    }
                    System.out.println(listaTarefasConcluidas);
                    yield true;
                }
                case 5 -> {
                    System.out.println("Remover uma Tarefa");
                    System.out.println("Digite o título para remover uma tarefa: ");
                    String titulo = sc.nextLine();
                    listaTarefas.removeIf(tarefa -> tarefa.getTitulo().equalsIgnoreCase(titulo));
                    listaTarefasPendentes.removeIf(tarefa -> tarefa.getTitulo().equalsIgnoreCase(titulo));
                    System.out.println("Todas as tarefas com esse título foram removidas.");
                    yield true;
                }
                case 0 -> {
                    System.out.println("Sair");
                    yield false;
                }
                default -> {
                    System.out.println("Opcao inválida");
                    yield true;
                }
            };
        }

    }
}
