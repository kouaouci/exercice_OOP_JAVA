package exercice_singleton;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.sql.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Properties;


public class Connexion_DB {
    private static Connexion_DB instance = null;
    private Connection conn;
     private Connexion_DB() throws IOException,SQLException,ClassNotFoundException{
         Properties props= new Properties ();
         FileInputStream str = new FileInputStream ("./src/exercice_singleton/db.properties");
         props.load(str);
         str.close();
         Class.forName(props.getProperty("DB_DRIVER_CLASS"));
         String url = props.getProperty("DB_HOST");
         String user = props.getProperty("DB_USERNAME");
         String password = props.getProperty("DB_PASSWORD");

         conn = DriverManager.getConnection(url, user, password);
     }
    public PreparedStatement prepareStatement(String sql) throws SQLException {
        return conn.prepareStatement(sql);
    }

    public static Connexion_DB getInstance() throws SQLException, IOException, ClassNotFoundException {
        if (instance == null) {
            instance = new Connexion_DB ();
        }
        return instance;
    }

    public void close() throws SQLException {
        conn.close();
    }







}
