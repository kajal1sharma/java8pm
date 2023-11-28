import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class JDBC {
    static final String url = "jdbc:mysql://localhost/college";
    static final String username = "root";
    static final String password ="root";

    static void createTableInDB(String tableName){
        try{
            Connection conn = DriverManager.getConnection(url, username, password);
            Statement st  = conn.createStatement();
            String sql ="create table "+tableName+" ( roll int not null, name varchar(100) not null)";
            st.execute(sql);
            // System.out.println(result);
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
}
