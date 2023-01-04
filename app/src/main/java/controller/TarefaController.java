package controller;

import model.Tarefa;
import util.ConnectionDataBase;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class TarefaController {
    public void save(Tarefa tarefa) throws SQLException { //vamos receber e salvar os dados que estão no objeto
        String sql = "INSERT INTO tb_tarefa " +
                "(projetoID, " +
                "nome_tarefa, " +
                "descricao_tarefa," +
                "status_tarefa, " +
                "observacao_tarefa, " +
                "prazo, " +
                "data_criacao, " +
                "data_att) " +
                "VALUES (?, ?, ?, ?, ?, ?, ?, ?)";
        Connection connection = null;
        PreparedStatement preparedStatement = null;

        try {
            connection = ConnectionDataBase.getConnection();
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setInt(1, tarefa.getProjetoID());
            preparedStatement.setString(2, tarefa.getNome());
            preparedStatement.setString(3, tarefa.getDescricao());
            preparedStatement.setBoolean(4, tarefa.getStatus());
            preparedStatement.setString(5, tarefa.getObservacoes());
            preparedStatement.setDate(6,  new java.sql.Date(tarefa.getPrazo().getTime()));
            preparedStatement.setDate(7,  new java.sql.Date(tarefa.getDataCriacao().getTime()));
            preparedStatement.setDate(8,  new java.sql.Date(tarefa.getDataAtt().getTime()));
            preparedStatement.execute();
        } catch (Exception exception) {
            throw new RuntimeException("Erro ao salvar a tarefa" + exception.getMessage(), exception);
        } finally {
            ConnectionDataBase.closeConnection(connection, preparedStatement);
        }
    }

    public void update(Tarefa tarefa) throws SQLException { //vamos atualizar os dados do objeto
        String sql = "UPDATE tb_tarefa SET " +
                "nome_tarefa = ?," +
                "descricao_tarefa = ?," +
                "status_tarefa = ?," +
                "observacao_tarefa = ?," +
                "prazo = ?," +
                "data_criacao = ?," +
                "data_att = ?" +
                "WHERE tarefaID = ?";
        Connection connection = null;
        PreparedStatement preparedStatement = null;

        try {
            connection = ConnectionDataBase.getConnection(); //Conexão com o Database
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, tarefa.getNome());
            preparedStatement.setString(2, tarefa.getDescricao());
            preparedStatement.setBoolean(3, tarefa.getStatus());
            preparedStatement.setString(4, tarefa.getObservacoes());
            preparedStatement.setDate(5,  new java.sql.Date(tarefa.getPrazo().getTime()));
            preparedStatement.setDate(6,  new java.sql.Date(tarefa.getDataCriacao().getTime()));
            preparedStatement.setDate(7,  new java.sql.Date(tarefa.getDataAtt().getTime()));
            preparedStatement.setInt(8, tarefa.getTarefaID());
            preparedStatement.execute();
        } catch (Exception exception) {
            throw new RuntimeException("Erro ao atualizar a tarefa" + exception.getMessage(), exception);
        } finally {
            ConnectionDataBase.closeConnection(connection, preparedStatement);
        }
    }

    public void removeById(int tarefaID) throws SQLException {
        String sql = "DELETE FROM tb_tarefa WHERE tarefaID = ?";
        Connection connection = null;
        PreparedStatement preparedStatement = null;

        try {
            connection = ConnectionDataBase.getConnection();
            preparedStatement = connection.prepareStatement(sql); //objeto que prepara o comando sql
            preparedStatement.setInt(1, tarefaID); //setar o valor numerico no = ?, substituir o valor ? pelo Id da Tarefa.
            preparedStatement.execute();
        } catch (Exception exception) {
            throw new RuntimeException("Erro ao deletar a tarefa" + exception.getMessage(), exception);
        } finally {
            ConnectionDataBase.closeConnection(connection, preparedStatement); //bloco que sempre sera inicializado
        }
    }

    public List<Tarefa> getAll(int projetoID) { //listar todas as tarefas
        String sql = "SELECT * FROM tb_tarefa WHERE projetoID = ?";
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;
        List<Tarefa> tarefas = new ArrayList<Tarefa>();

        try {
            connection = ConnectionDataBase.getConnection();
            preparedStatement = connection.prepareStatement(sql); //objeto que prepara o comando sql
            preparedStatement.setInt(1, projetoID); //setar o valor numerico no = ?, substituir o valor ? pelo Id da Tarefa.
            resultSet = preparedStatement.executeQuery(); //variavel que vai guardar a resposta do db

            while (resultSet.next()) { //laço de repeticão para percorrer todos os valores do ResultSet (equanto houver valores)
                Tarefa tarefa = new Tarefa();

                tarefa.setTarefaID(resultSet.getInt("tarefaID"));
                tarefa.setProjetoID(resultSet.getInt("projetoID"));
                tarefa.setNome(resultSet.getString("nome_tarefa"));
                tarefa.setDescricao(resultSet.getString("descricao_tarefa"));
                tarefa.setStatus(resultSet.getBoolean("status_tarefa"));
                tarefa.setObservacoes(resultSet.getString("observacao_tarefa"));
                tarefa.setPrazo(resultSet.getDate("prazo"));
                tarefa.setDataCriacao(resultSet.getDate("data_criacao"));
                tarefa.setDataAtt(resultSet.getDate("data_att"));
                tarefas.add(tarefa);
            }
        } catch (Exception exception) {
            throw new RuntimeException("Erro ao buscar a tarefa" + exception.getMessage(), exception);
        } finally {
            ConnectionDataBase.closeConnection(connection, preparedStatement, resultSet);
        }
        return tarefas;
    }
}
