package model.Metodo;

import model.Classe.Tarefa;

import java.util.Comparator;
import java.util.Scanner;

import static model.Classe.Tarefa.tarefas;

public class AdicionaTarefa {
    static Scanner leitor = new Scanner(System.in);


    public static void adicionaTarefa() {
        System.out.print("Digite o nome da tarefa: ");
        String nome = leitor.nextLine();
        System.out.print("Digite a descrição da tarefa: ");
        String descricao = leitor.nextLine();
        System.out.print("Digite a data de termino da tarefa (DD//MM/AAAA): ");
        String dataTermino = leitor.nextLine();
        System.out.println();

        System.out.println("Categoria da tarefa");
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
        System.out.print("Qual é a prioridade da tarefa? ");
        int prioridade = leitor.nextInt();

        Tarefa tarefa = new Tarefa(nome, descricao, dataTermino, categoria, status, prioridade);
        tarefas.add(tarefa);
        tarefas.sort(Comparator.comparingInt(Tarefa::getPrioridade));

        System.out.println("Tarefa adicionada.");
        System.out.println();
    }
}
