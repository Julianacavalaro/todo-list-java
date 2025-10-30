import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
     //   Scanner sc = new Scanner(System.in);
        boolean executando = true;
        List<Tarefa> listaTarefas = new ArrayList<>();
        List<Tarefa> listaTarefasPendentes = new ArrayList<>();
        while(executando) {

            int opcao = Menu.exibeMenu();

            executando = switch (opcao) {

                case 1 -> {
                    Tarefa novaTarefa = new Tarefa(); //instância do objeto
                    var tarefa = novaTarefa.addTarefa();
                    System.out.println(tarefa);
                    listaTarefas.add(tarefa);

                    yield true;
                }
                case 2 -> {
                    System.out.println("Listar tarefas pendentes");
                    for(Tarefa tarefa : listaTarefas){
                            if(!tarefa.isConcluida()){
                                listaTarefasPendentes.add(tarefa);
                            }
                    }
                    System.out.println(listaTarefasPendentes);
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
                case 0 -> {
                    System.out.println(listaTarefas);
                       yield  false;
                }
                default -> {
                    System.out.println("Opcao inválida");
                    yield true;
                }
            };
        }

    }
}
