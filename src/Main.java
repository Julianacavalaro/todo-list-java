import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static java.awt.SystemColor.menu;

public class Main {
    public static void main(String[] args) {

        boolean executando = true;

        while(executando) {

            int opcao = Menu.exibeMenu();

            executando = switch (opcao) {
                case 1 -> {
                    System.out.println("Cadastrar tarefa");
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

        List<String> nomesAlunas = new ArrayList<>();
        nomesAlunas.add("Larissa");
        nomesAlunas.add("Geysa");

        for (String aluna : nomesAlunas) {
            System.out.println(aluna);
        }
    }
}
