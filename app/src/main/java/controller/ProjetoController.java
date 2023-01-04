package controller;

import model.Projeto;
import util.ConnectionDataBase;

import java.sql.*;

import java.util.ArrayList;
import java.util.List;

public class ProjetoController {
    public void save(Projeto projeto) {
        String sql = "INSERT INTO tb_projeto (" +
                "nome_projeto, " +
                "descricao, " +
                "data_criacao, " +
                "data_att) " +
                "VALUES (?, ?, ?, ?)";
        Connection connection = null;
        PreparedStatement preparedStatement = null;

        try {
            connection = ConnectionDataBase.getConnection();
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, projeto.getNome());
            preparedStatement.setString(2, projeto.getDescricao());
            preparedStatement.setDate(3, new java.sql.Date(projeto.getDataCriacao().getTime()));
            preparedStatement.setDate(4, new java.sql.Date(projeto.getDataAtt().getTime()));
            preparedStatement.execute();
        } catch (Exception exception) {
            throw new RuntimeException("Erro ao salvar o projeto" + exception.getMessage(), exception);
        } finally {
            ConnectionDataBase.closeConnection(connection, preparedStatement);
        }
    }

    public void update(Projeto projeto) {
        String sql = "UPDATE tb_projeto SET " +
                "nome_projeto = ?, " +
                "descricao = ?, " +
                "data_criacao = ?, " +
                "data_att = ?" +
                "WHERE projetoID = ?";
        Connection connection = null;
        PreparedStatement preparedStatement = null;

        try {
            connection = ConnectionDataBase.getConnection();
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, projeto.getNome());
            preparedStatement.setString(2, projeto.getDescricao());
            preparedStatement.setDate(3, new java.sql.Date(projeto.getDataCriacao().getTime()));
            preparedStatement.setDate(4, new java.sql.Date(projeto.getDataAtt().getTime()));
            preparedStatement.setInt(5, projeto.getProjetoID());
            preparedStatement.execute();
        } catch (Exception exception) {
            throw new RuntimeException("Erro ao atualizar o projeto" + exception.getMessage(), exception);
        } finally {
            ConnectionDataBase.closeConnection(connection, preparedStatement);
        }
    }

    public void removeById(int projetoID) {
        String sql = "DELETE FROM tb_projeto WHERE projetoID = ?";
        Connection connection = null;
        PreparedStatement preparedStatement = null;

        try {
            connection = ConnectionDataBase.getConnection();
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setInt(1, projetoID);
            preparedStatement.execute();
        } catch (Exception exception) {
            throw new RuntimeException("Erro ao deletar o projeto." + exception.getMessage(), exception);
        } finally {
            ConnectionDataBase.closeConnection(connection, preparedStatement);
        }
    }

    public List<Projeto> getAll() {
        String sql = "SELECT * FROM tb_projeto";
        List<Projeto> projetos = new ArrayList<Projeto>();
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;

        try {
            connection = ConnectionDataBase.getConnection();
            preparedStatement = connection.prepareStatement(sql);
            resultSet = preparedStatement.executeQuery();

            while (resultSet.next()) {
                Projeto projeto = new Projeto();

                projeto.setProjetoID(resultSet.getInt("projetoID"));
                projeto.setNome(resultSet.getString("nome_projeto"));
                projeto.setDescricao(resultSet.getString("descricao"));
                projeto.setDataCriacao(resultSet.getDate("data_criacao"));
                projeto.setDataAtt(resultSet.getDate("data_att"));
                projetos.add(projeto);
            }
        } catch (Exception exception) {
            throw new RuntimeException("Erro ao buscar a tabela" + exception.getMessage(), exception);
        } finally {
            ConnectionDataBase.closeConnection(connection, preparedStatement, resultSet);
        }
        return projetos;
    }
}
