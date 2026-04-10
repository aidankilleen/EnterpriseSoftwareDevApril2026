package ie.pt;

import java.sql.*;

public class SqliteHelloWorld {

    public static void main(String[] args) throws SQLException {
        System.out.println("SQLite Test");

        String url = "jdbc:sqlite:C:\\work\\training\\java\\users.db";
        Connection conn = DriverManager.getConnection(url);
        Statement stmt = conn.createStatement();
        String sql = "SELECT * FROM users";

        ResultSet rs = stmt.executeQuery(sql);
        while (rs.next()) {
            System.out.println(rs.getString("name"));
        }
        rs.close();
        stmt.close();
        conn.close();

    }
}
