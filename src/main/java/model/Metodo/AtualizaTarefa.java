package model.Metodo;

import model.Classe.Tarefa;

import java.util.Scanner;

import static model.Classe.Tarefa.tarefas;

public class AtualizaTarefa {
    static Scanner leitor = new Scanner(System.in);

    public static void atualizaTarefa() {
        if (tarefas.isEmpty()) {
            System.out.println("Lista de tarefas está vazia.");
            System.out.println();
        } else {
            System.out.print("Digite o nome da tarefa que deseja atualizar: ");
            String nome = leitor.nextLine();
            System.out.println();
            for (Tarefa tarefa : tarefas) {
                if (tarefa.getNome().equals(nome)) {
                    System.out.print("Digite o novo nome da tarefa: ");
                    String nomeNovo = leitor.nextLine();
                    System.out.print("Digite a descrição da tarefa: ");
                    String descricao = leitor.nextLine();
                    System.out.print("Digite a data de termino da tarefa (DD//MM/AAAA): ");
                    String dataTermino = leitor.nextLine();
                    System.out.println();

                    System.out.print("Categoria da tarefa");
                    System.out.println("Pessoal");
                    System.out.println("Trabalho");
                    System.out.println("Estudos");
                    System.out.print("Qual é a categoria da tarefa? ");
                    String categoria = leitor.nextLine();
                    System.out.println();

                    System.out.println("Status da tarefa");
                    System.out.println("Todo (Fazer)");
                    System.out.println("Doing (Fazendo)");
                    System.out.println("Done (Feito");
                    System.out.print("Qual é o status da tarefa? ");
                    String status = leitor.nextLine();
                    System.out.println();

                    System.out.println("Prioridade da tarefa");
                    System.out.println("1 - Urgente");
                    System.out.println("2 - Alta");
                    System.out.println("3 - Normal");
                    System.out.println("4 - Baixa");
                    System.out.println("5 - Mínima");
                    System.out.print("Qual é a prioridade da tarefa? (1-5) ");
                    int prioridade = leitor.nextInt();

                    tarefa.setNome(nomeNovo);
                    tarefa.setDescricao(descricao);
                    tarefa.setDataTermino(dataTermino);
                    tarefa.setCategoria(categoria);
                    tarefa.setStatus(status);
                    tarefa.setPrioridade(prioridade);

                    System.out.println("Tarefa atualizada.");
                    System.out.println();
                }
            }
        }
    }
}
