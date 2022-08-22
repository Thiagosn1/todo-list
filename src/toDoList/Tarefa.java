package toDoList;

import java.util.ArrayList;

public class Tarefa {

    private String nome;
    private String descricao;
    private String dataTermino;
    private String categoria;
    private String status;
    private int prioridade;


    static ArrayList<Tarefa> tarefas = new ArrayList<>();
    public Tarefa(String nome, String descricao, String dataTermino,
                  String categoria, String status, int prioridade) {
        this.nome = nome;
        this.descricao = descricao;
        this.dataTermino = dataTermino;
        this.categoria = categoria;
        this.status = status;
        this.prioridade = prioridade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getDataTermino() {
        return dataTermino;
    }

    public void setDataTermino(String dataTermino) {
        this.dataTermino = dataTermino;
    }


    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public int getPrioridade() {
        return prioridade;
    }

    public void setPrioridade(int prioridade) {
        this.prioridade = prioridade;
    }
}
