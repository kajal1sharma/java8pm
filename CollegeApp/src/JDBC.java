import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;


public class JDBC {
    static final String url = "jdbc:mysql://localhost/college";
    static final String username = "root";
    static final String password ="root";

    // Crud => create read update delete
    static void readFromDB(String table){
        try{
            Connection conn = DriverManager.getConnection(url, username, password);
            String query= "select * from "+table;
            Statement stm = conn.createStatement();
            ResultSet set=stm.executeQuery(query);

                while(set.next()){
                    
                    System.out.println(set.getInt(1));
                    System.out.println(set.getString(2));
                }

        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
    static void insertIntoDB(String table, int roll ,String name) {
        try{

            Connection conn = DriverManager.getConnection(url, username, password);
            String query = "insert into "+table+" (roll, name) values (?, ?)";
            PreparedStatement stm = conn.prepareStatement(query);
            // stm.setString(1, "roll");
           stm.setString(2, name);
            stm.setInt(1, roll);
            
            stm.execute();  
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
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
