import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Conn {
    Connection c;
    Statement s ;
    public Conn(){
        try{
            Class.forName("com.mysql.jdbc.driver");
            c= DriverManager.getConnection("jdbc:mysql:///cbs1","root","Arshadm@7");
            s=c.createStatement();
        }catch(Exception e){
            System.out.println(e);
        }
    }
}
