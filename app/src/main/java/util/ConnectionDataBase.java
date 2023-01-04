package util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ConnectionDataBase {

    public static final String DRIVER = "com.mysql.jdbc.Driver"; //especificando que vamos usar o jdbc do mysql
    public static final String URL = "jdbc:mysql://localhost:3306/db_todoapp"; //url do caminho da minha application até a minha database.
    public static final String USER = "root"; //user mysql
    public static final String PASS = "root"; //senha mysql

    public static Connection getConnection() { //metodo que vai retornar uma conexão, sem criar um objeto.
        try {
            Class.forName(DRIVER); //carregar o DRIVER (mysql)
            return DriverManager.getConnection(URL, USER, PASS); //parametros da conexão
        } catch (ClassNotFoundException | SQLException exception) {
            throw new RuntimeException("Erro na conexão com o Database", exception);
        }
    }

    public static void closeConnection(Connection connection) {
        try {
            if (connection != null) {
                connection.close();
            }
        } catch (SQLException exception) {
            throw new RuntimeException("Erro ao fechar a conexão com a Database");
        }
    }

    public static void closeConnection(Connection connection, PreparedStatement preparedStatement) {
        try {
            if (connection != null) {
                connection.close();
            }
            if (preparedStatement != null) {
                preparedStatement.close();
            }
        } catch (SQLException exception) {
            throw new RuntimeException("Erro ao fechar a conexão com a Database");
        }
    }

    public static void closeConnection(Connection connection, PreparedStatement preparedStatement, ResultSet resultSet) {
        try {
            if (connection != null) {
                connection.close();
            }
            if (preparedStatement != null) {
                preparedStatement.close();
            }
            if (resultSet != null) {
                resultSet.close();
            }
        } catch (SQLException exception) {
            throw new RuntimeException("Erro ao fechar a conexão com a Database");
        }
    }
}