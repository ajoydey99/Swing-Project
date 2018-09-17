import java.sql.*;
import javax.swing.*;

public class JavaConnect 
{
    public static Connection connectDB()
    {
        Connection conn=null;
        String driver="org.sqlite.JDBC";
        String dburl="jdbc:sqlite:database/library.db";
        try
        {
            Class.forName(driver);
            conn = DriverManager.getConnection(dburl);
            return conn;
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, e);
            return null;
        }
    }
}
