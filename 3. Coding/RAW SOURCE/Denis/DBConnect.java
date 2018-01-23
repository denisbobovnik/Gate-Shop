import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnect {
	public static Connection getConnection() {
	    try {
			return DriverManager.getConnection("jdbc:mysql://localhost:3306/gateShop?autoReconnect=true&useSSL=false&useUnicode=true&characterEncoding=utf-8", "root", "F3RI");
		} catch (SQLException e) {
			e.printStackTrace();
		}
	    return null;
	}
}
