package toDoList;

import java.util.Scanner;

import static toDoList.Tarefa.tarefas;

public class ListaTarefas {

    static Scanner leitor = new Scanner(System.in);

    public static void listaTarefas() {
        if (tarefas.isEmpty()) {
            System.out.println("Lista de tarefas está vázia.");
            System.out.println();
        } else {
            System.out.println("LISTA DE TAREFAS");
            System.out.println();
            for(Tarefa tarefa : tarefas) {
                System.out.println("Nome: " + tarefa.getNome());
                System.out.println("Descrição: " + tarefa.getDescricao());
                System.out.println("Data de Vencimento: " + tarefa.getDataTermino());
                System.out.println("Categoria: " + tarefa.getCategoria());
                System.out.println("Status: " + tarefa.getStatus());
                System.out.println("Prioridade: " + tarefa.getPrioridade());
                System.out.println();
            }
        }
    }

    public static void listaPorCategoria() {
        if (tarefas.isEmpty()) {
            System.out.println("Lista de tarefas está vázia.");
            System.out.println();
        } else {
            System.out.println("Categorias:");
            System.out.println("Pessoal");
            System.out.println("Trabalho");
            System.out.println("Estudos");
            System.out.print("Deseja listar por qual categoria? ");
            String categoria = leitor.nextLine();
            for (Tarefa tarefa : tarefas) {
                if (tarefa.getCategoria().equals(categoria)) {
                    System.out.println("Nome: " + tarefa.getNome());
                    System.out.println("Descrição: " + tarefa.getDescricao());
                    System.out.println("Data de Vencimento: " + tarefa.getDataTermino());
                    System.out.println("Categoria: " + tarefa.getCategoria());
                    System.out.println("Status: " + tarefa.getStatus());
                    System.out.println("Prioridade: " + tarefa.getPrioridade());
                    System.out.println();
                }
            }
        }
    }

    public static void listaPorStatus() {
        if (tarefas.isEmpty()) {
            System.out.println("Lista de tarefas está vázia.");
            System.out.println();
        } else {
            System.out.println("Listar por status");
            System.out.println("Todo (Fazer)");
            System.out.println("Doing (Fazendo)");
            System.out.println("Done (Feito");
            System.out.print("Deseja listar por qual status? ");
            String status = leitor.nextLine();
            for (Tarefa tarefa : tarefas) {
                if (tarefa.getStatus().equals(status)) {
                    System.out.println("Nome: " + tarefa.getNome());
                    System.out.println("Descrição: " + tarefa.getDescricao());
                    System.out.println("Data de Vencimento: " + tarefa.getDataTermino());
                    System.out.println("Categoria: " + tarefa.getCategoria());
                    System.out.println("Status: " + tarefa.getStatus());
                    System.out.println("Prioridade: " + tarefa.getPrioridade());
                    System.out.println();
                }
            }
        }
    }

    public static void listaPorPrioridade() {
        if (tarefas == null || tarefas.isEmpty()) {
            System.out.println("Lista de tarefas está vazia.");
            System.out.println();
        } else {
            System.out.println("Listar por prioridade");
            System.out.println("1 - Urgente");
            System.out.println("2 - Alta");
            System.out.println("3 - Normal");
            System.out.println("4 - Baixa");
            System.out.println("5 - Mínima");
            System.out.println("Deseja listar por qual prioridade? ");
            int prioridade = leitor.nextInt();
            for (Tarefa tarefa : tarefas) {
                if (tarefa.getPrioridade() >= prioridade) {
                    System.out.println("Nome: " + tarefa.getNome());
                    System.out.println("Descrição: " + tarefa.getDescricao());
                    System.out.println("Data de Vencimento: " + tarefa.getDataTermino());
                    System.out.println("Categoria: " + tarefa.getCategoria());
                    System.out.println("Status: " + tarefa.getStatus());
                    System.out.println("Prioridade: " + tarefa.getPrioridade());
                    System.out.println();
                }
            }
        }
    }
}
