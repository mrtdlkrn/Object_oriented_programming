package Logic;
import java.sql.*;
import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Statement;
import javax.swing.JOptionPane;

public class Baglanti 
{
    static Connection conn;
    static Statement stat;
    
    static ResultSet yap()
    {
        ResultSet rs=null;
         try 
        {
            conn=(Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/hastane_otomasyonu_db","root","");
            stat=(Statement) conn.createStatement();
            rs=stat.executeQuery("select * from kullanici");
        } catch (Exception e) 
             {
                 JOptionPane.showMessageDialog(null, "Veri Tabanı Bağlantısı Sağlanamadı!  Hata:\n"+e, "Warning", JOptionPane.WARNING_MESSAGE);
             }
        return rs;
    }
    
    static ResultSet sorgula(String sql_sorgu)
    {
        ResultSet rs=null;
         try 
        {
            rs=stat.executeQuery(sql_sorgu);
        } catch (SQLException e) 
             {
                 e.printStackTrace();
             }
        return rs;
    }
    
    static void ekle(String sql_sorgu)
    {
        try
        {
            stat.executeUpdate(sql_sorgu);
        }catch(SQLException e)
            {
                e.printStackTrace();
            }
    }
    
    static void guncelle(String sql_sorgu)
    {
        try
        {
            stat.executeUpdate(sql_sorgu);
        }catch(SQLException e)
            {
                e.printStackTrace();
            }
    }
    
    static void sil(String sql_sorgu)
    {
        try
        {
            stat.executeUpdate(sql_sorgu);
        }catch(SQLException e)
            {
                e.printStackTrace();
            }
    }
}
