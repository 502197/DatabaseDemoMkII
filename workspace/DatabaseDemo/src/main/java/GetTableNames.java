import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.ResultSet;
import java.sql.SQLException;


public class GetTableNames {
	static String   catalog          = null;
	static String   schemaPattern    = null;
	static String   tableNamePattern = null;
	static String[] types            = null;


	public static void main(String[] args) {

		try(Connection conn=SakilaConnection.connect();){
		
			DatabaseMetaData databaseMetaData = conn.getMetaData();
			ResultSet result = databaseMetaData.getTables(
				     		   catalog, schemaPattern, tableNamePattern, types );

				//get table names
				while(result.next()) {
				    String tableName = result.getString(3);
				    System.out.println("table names\t" + tableName);
				}
				
				//get catalog names : database name
				//result.absolute(1);   //if 0 -> sqle! can not be 0
				//while(result.next()) {
				//    String tableName = result.getString(1);
				//    System.out.println("catalog names\t" + tableName);
				//}
		}catch(SQLException sqle){
			sqle.printStackTrace();
		}

	}

}
