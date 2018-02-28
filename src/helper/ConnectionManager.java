package helper;

import java.io.File;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class ConnectionManager {

    public static Connection newConnection = createConnection();

    private static Connection createConnection() {
        File homedir = new File(System.getProperty("user.dir"));
        File filePath = new File(homedir, "/resource/library.db");
        Connection newConnection = null;

        try {
            Class.forName("org.sqlite.JDBC");
            newConnection = DriverManager.getConnection(
                    "jdbc:sqlite:" + filePath.getPath());
        } catch (Exception e) {
            System.err.println(e.getClass().getName() + ": " + e.getMessage());
            System.exit(1);
        }
        return newConnection;
    }

    public static void closeConnection(Connection newConnection) {
        try{
            newConnection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }
}
