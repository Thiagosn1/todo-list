package toDoList;

import java.util.Scanner;

import static toDoList.AdicionaTarefa.adicionaTarefa;
import static toDoList.AtualizaTarefa.atualizaTarefa;
import static toDoList.RemoveTarefa.removeTarefa;
import static toDoList.ListaTarefas.*;

public class Main {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        boolean rodar = true;

        while (rodar) {

            int opcao;

            System.out.println("-----------------------------");
            System.out.println("          TODO LIST          ");
            System.out.println();
            System.out.println("1 - LISTA DE TAREFAS");
            System.out.println("2 - ADICIONAR TAREFA");
            System.out.println("3 - ATUALIZAR TAREFA");
            System.out.println("4 - REMOVER TAREFA");
            System.out.println("5 - LISTAR TAREFAS POR CATEGORIA");
            System.out.println("6 - LISTAR TAREFAS POR STATUS");
            System.out.println("7 - LISTAR TAREFAS POR PRIORIDADE");
            System.out.println("8 - SAIR");
            System.out.println("-----------------------------");
            System.out.println();

            System.out.print("Escolha uma das opções do menu! ");
            opcao = leitor.nextInt();
            System.out.println();

            switch (opcao) {
                case 1:
                    listaTarefas();
                    break;
                case 2:
                    adicionaTarefa();
                    break;
                case 3:
                    atualizaTarefa();
                    break;
                case 4:
                    removeTarefa();
                    break;
                case 5:
                    listaPorCategoria();
                    break;
                case 6:
                    listaPorStatus();
                    break;
                case 7:
                    listaPorPrioridade();
                    break;
                case 8:
                    rodar = false;
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Erro! Opção inválida");
                    break;
            }
        }
    }
}
