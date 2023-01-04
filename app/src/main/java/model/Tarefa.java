package model;

import java.util.Date;

public class Tarefa {
    
    private int tarefaID;
    private int projetoID;
    private String nome;
    private String descricao;
    private Boolean status;
    private String observacoes;
    private Date prazo;
    private Date dataCriacao;
    private Date dataAtt;

    public Tarefa(int tarefaID, int projetoID, String nome, String descricao, Boolean status, String observacoes, Date prazo, Date dataCriacao, Date dataAtt) {
        this.tarefaID = tarefaID;
        this.projetoID = projetoID;
        this.nome = nome;
        this.descricao = descricao;
        this.status = status;
        this.observacoes = observacoes;
        this.prazo = prazo;
        this.dataCriacao = dataCriacao;
        this.dataAtt = dataAtt;
    }

    public Tarefa() {
        this.dataCriacao = new Date();
        this.dataAtt = new Date();
        this.prazo = new Date();
        this.status = true;
    }

    @Override
    public String toString() {
        return "Tarefa{" +
                "tarefaID=" + tarefaID +
                ", projetoID=" + projetoID +
                ", nome='" + nome + '\'' +
                ", descricao='" + descricao + '\'' +
                ", status=" + status +
                ", observacoes='" + observacoes + '\'' +
                ", prazo=" + prazo +
                ", dataCriacao=" + dataCriacao +
                ", dataAtt=" + dataAtt +
                '}';
    }

    public int getTarefaID() {
        return tarefaID;
    }

    public void setTarefaID(int tarefaID) {
        this.tarefaID = tarefaID;
    }

    public int getProjetoID() {
        return projetoID;
    }

    public void setProjetoID(int projetoID) {
        this.projetoID = projetoID;
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

    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }

    public String getObservacoes() {
        return observacoes;
    }

    public void setObservacoes(String observacoes) {
        this.observacoes = observacoes;
    }

    public Date getPrazo() {
        return prazo;
    }

    public void setPrazo(Date prazo) {
        this.prazo = prazo;
    }

    public Date getDataCriacao() {
        return dataCriacao;
    }

    public void setDataCriacao(Date dataCriacao) {
        this.dataCriacao = dataCriacao;
    }

    public Date getDataAtt() {
        return dataAtt;
    }

    public void setDataAtt(Date dataAtt) {
        this.dataAtt = dataAtt;
    }
}
