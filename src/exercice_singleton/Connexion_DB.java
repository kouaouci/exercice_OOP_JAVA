package exercice_singleton;
import java.sql.*;
import java.awt.*;
import java.sql.Connection;
import java.sql.DriverManager;


public class Connexion_DB {
    static final String DB_URL = "jdbc:mysql://localhost/bdtest";
    static final String USER = "root";
    static final String PASS = "karima2803!";
    static final String QUERY = "SELECT id, nom, prenom, age FROM user";

    public static void main(String[] args) {
        EventQueue.invokeLater ( new Runnable () {
            public void run() {
                // Le code à exécuter est à insérer ici.

                /*
                 *  Informations de connexion, pour connecter l'application
                 *  à la BDD
                 */
                String BDD = "votreBaseDeDonnée";
                String url = "jdbc:mysql://localhost:3306/ bdtest";
                String user = "root";
                String passwd = "karima2803!";
                /*
                 *  On vérifie bien que la connexion avec la base de données
                 *  s'effectue sans aucun problème.
                 */
                try {
                    Class.forName("com.mysql.jdbc.Driver");
                    Connection conn = DriverManager.getConnection(url, user, passwd);
                    System.out.println("Connecter");
                } catch (Exception e){
                    e.printStackTrace();
                    System.out.println("Erreur");
                    System.exit(0);
                }

            }
        } );
    }





}
