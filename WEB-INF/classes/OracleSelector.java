import java.sql.SQLException;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.ResultSet;
import bean.Bean;	

interface Selector{
	public Bean getSelect(int number,String tableName);
	public void createConnector();
}
public class OracleSelector implements Selector{
	Connection cn = null;
	Statement st=null;
	ResultSet rs=null;
	Bean bn=null;
	
	public void createConnector(){
		cn = new OracleConnector().getConnection();
	
	} 
	
	public Bean getSelect(int number,String tableName){
		try{
			String sql="select gaku_title,gaku_text,gaku_uri from "+tableName+" where gaku_no="+number;
			System.out.println(sql);
			st=cn.createStatement();
			bn = new Bean();
			
			rs=st.executeQuery(sql);
			
			rs.next();
			
			bn.setTitle(rs.getString(1));
			bn.setText(rs.getString(2));
			bn.setImagePath(rs.getString(3));
			
		}catch(SQLException e){
			e.printStackTrace();
		}
		
		return bn;
	}
}