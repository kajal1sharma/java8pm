
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;


public class JDBC {
    static final String url = "jdbc:mysql://localhost/user";
    static final String username = "root";
    static final String password ="root";

    // Crud => create read update delete
    static void deleteFromDB(String table, int id){
         try{

            Connection conn = DriverManager.getConnection(url, username, password);
            String query = "delete from "+table+" where roll = ?";
            PreparedStatement stm = conn.prepareStatement(query);
           
            stm.setInt(1, id);
            stm.execute();  
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
    static void updateInDB(String table, String updatedname, int id){
         try{

            Connection conn = DriverManager.getConnection(url, username, password);
            String query = "update "+table+" set name = ? where roll= ? ";
            PreparedStatement stm = conn.prepareStatement(query);
           
            stm.setString(1, updatedname);
            stm.setInt(2, id);
           
            
            stm.execute();  
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
    static void readFromDB(String table, String username1, String password1){
        try{
            Connection conn = DriverManager.getConnection(url, username, password);
            String query= "select * from "+table+" where username = ? and password = ? ;";            
            PreparedStatement stm = conn.prepareStatement(query);
            // stm.setString(1, "roll");
            stm.setString(2, password1);
            stm.setString(1, username1);
            ResultSet set=stm.executeQuery();
            // if(set.getFetchSize()==0){
            //     System.out.println("no such user found");
            //     return;
            // }
            // if(set==null){
            //     System.out.println("no such user found");
            //     return;
            // }
                while(set.next()){
                    
                    System.out.println(set.getString(1));
                    System.out.println(set.getString(2));
                }

        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
    static void insertIntoDB(String table, String username1 ,String password1) {
        try{

            Connection conn = DriverManager.getConnection(url, username, password);
            String query = "insert into "+table+" (username, password) values (?, ?)";
            PreparedStatement stm = conn.prepareStatement(query);
            // stm.setString(1, "roll");
           stm.setString(2, password1);
            stm.setString(1, username1);
            
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
