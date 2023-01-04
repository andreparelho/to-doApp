package model;

import java.util.Date;

public class Projeto {
    private int projetoID;
    private String nome;
    private String descricao;
    private Date dataCriacao;
    private Date dataAtt;

    public Projeto(int projetoID, String nome, String descricao, Date dataCriacao, Date dataAtt) {
        this.projetoID = projetoID;
        this.nome = nome;
        this.descricao = descricao;
        this.dataCriacao = dataCriacao;
        this.dataAtt = dataAtt;
    }

    public Projeto() {
        this.dataCriacao = new Date();
        this.dataAtt = new Date();
    }

    @Override
    public String toString() {
        return "Projeto{" +
                "projetoID=" + projetoID +
                ", nome='" + nome + '\'' +
                ", descricao='" + descricao + '\'' +
                ", dataCriacao=" + dataCriacao +
                ", dataAtt=" + dataAtt +
                '}';
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
