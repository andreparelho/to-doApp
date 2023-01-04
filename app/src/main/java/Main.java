
import java.sql.Connection;
import util.ConnectionDataBase;



public class Main {
    public static void main(String[] args) {
        Connection connection = ConnectionDataBase.getConnection();
        ConnectionDataBase.closeConnection(connection);
    }
}
