package toDoList;

import java.util.Scanner;

import static toDoList.Tarefa.tarefas;

public class RemoveTarefa {
    static Scanner leitor = new Scanner(System.in);

    public static void removeTarefa() {
        if (tarefas.isEmpty()) {
            System.out.println("Não há tarefas para serem removidas");
            System.out.println();
        } else {
            System.out.print("Digite o nome da tarefa que quer remover: ");
            String nome = leitor.nextLine();
            for (Tarefa tarefa : tarefas) {
                if (tarefa.getNome().equals(nome)) {
                    tarefas.remove(tarefa);
                    System.out.println("Tarefa removida!");
                    System.out.println();
                }
            }
        }
    }
}
