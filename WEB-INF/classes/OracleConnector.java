import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

interface Connector{
	public Connection getConnection();
}
public class OracleConnector implements Connector{
	private Connection cn=null;
	
	public OracleConnector(){
		try{
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			cn=DriverManager.getConnection("jdbc:oracle:thin:@172.19.253.32:1521:orcl","FUK","fuku");
			
		}catch(ClassNotFoundException e){
			e.printStackTrace();
		}catch(SQLException e){
			e.printStackTrace();
		}
	}
	public Connection getConnection(){
		return cn;
	}
	public void closeConnection(){
		try{
			cn.close();
		}catch(SQLException e){
			e.printStackTrace();
		}
	}
}