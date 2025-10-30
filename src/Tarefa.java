import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Tarefa {
    Scanner sc = new Scanner(System.in);
    private String titulo;
    private String descricao;
    private LocalDate dataEntrega;
    private boolean concluida;

    public Tarefa() {
    }

    public Tarefa(String titulo, String descricao, LocalDate dataEntrega) {
        this.titulo = titulo;
        this.descricao = descricao;
        this.dataEntrega = dataEntrega;
    }
    Tarefa addTarefa() {
        System.out.println("Digite o título: ");
        String titulo = sc.nextLine();
        System.out.println("Digite a descrição: ");
        String descricao = sc.nextLine();
        System.out.println("Digite a data de entrega (yyyy-MM-dd):  ");
        LocalDate dataEntrega = LocalDate.parse(sc.nextLine());
        System.out.println("Cadastrar tarefa");

        return new Tarefa(titulo,descricao,dataEntrega);
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public LocalDate getDataEntrega() {
        return dataEntrega;
    }

    public void setDataEntrega(LocalDate dataEntrega) {
        this.dataEntrega = dataEntrega;
    }

    public boolean isConcluida() {
        return concluida;
    }

    public void setConcluida(boolean concluida) {
        this.concluida = concluida;
    }

    @Override
    public String toString() {
        return "Tarefa{" +
                "titulo='" + titulo + '\'' +
                ", descricao='" + descricao + '\'' +
                ", dataEntrega=" + dataEntrega +
                ", concluida=" + concluida +
                '}';
    }
}
