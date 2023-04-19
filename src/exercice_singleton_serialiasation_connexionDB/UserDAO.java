package exercice_singleton_serialiasation_connexionDB;

import java.sql.*;

public class UserDAO {
   // la connexion a la base de donneé bdtest
    static final String DB_URL= "jdbc:mysql//localhost/bdtest";
    static final String USER= "root";
    static final String  password= "karima2803!";
    static final String QUERY ="SELECT id, nom, prenom, age";
    //Query pour update
      //  static final String QUERY = "SELECT id, nom, prenom, age FROM user";
    public static void main(String[]args){
     //CRUD READ
     //open connection to datbases
     try(Connection conn = DriverManager.getConnection (DB_URL,USER,password  );
         Statement stmt = conn.createStatement ();
         ResultSet rs = stmt.executeQuery ( QUERY );
     ) { // Extract data form result set
      while(rs.next ()){
       //Retrieve by column name
       System.out.println ("ID:" + rs.getInt ( "id" ));
       System.out.println (",Nom:"+rs.getString ( "nom" ));
       System.out.println (",Prenom:" + rs.getString ( "prenom" ));
       System.out.println (",Age:"+rs.getInt ( "age" ));
      }
     } catch (SQLException e) {
      e.printStackTrace ();
     }
     /* WRITE
    // try(Connection conn = DriverManager.getConnection (DB_URL,USER,password  );
      //   Statement stmt = conn.createStatement ();
        // ResultSet rs = stmt.executeQuery ( QUERY );
    // ) { // Execute a query
      //System.out.println("Inserting records into the table...");
     // String sql = "INSERT INTO Registration VALUES (100, 'Zara', 'Ali', 18)";
      //stmt.executeUpdate(sql);
      //sql = "INSERT INTO Registration VALUES (101, 'Mahnaz', 'Fatma', 25)";
      /*stmt.executeUpdate(sql);
      sql = "INSERT INTO Registration VALUES (102, 'Zaid', 'Khan', 30)";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Registration VALUES(103, 'Sumit', 'Mittal', 28)";
      stmt.executeUpdate(sql);
      System.out.println("Inserted records into the table...");
     } catch (SQLException e) {
      e.printStackTrace();*/


     /*UPDATE
     // Open a connection
     try(Connection conn = DriverManager.getConnection(DB_URL, USER, password);
         Statement stmt = conn.createStatement();
     ) {
      String sql = "UPDATE Registration " +
              "SET age = 30 WHERE id in (100, 101)";
      stmt.executeUpdate(sql);
      ResultSet rs = stmt.executeQuery(QUERY);
      while(rs.next()){
       //Display values
       System.out.print("ID: " + rs.getInt("id"));
       System.out.print(", Age: " + rs.getInt("age"));
       System.out.print(", First: " + rs.getString("nom"));
       System.out.println(", Last: " + rs.getString("prenom"));
      }
      rs.close();
     } catch (SQLException e) {
      e.printStackTrace();
     }*/


     /*DELETE
     // Open a connection
     try(Connection conn = DriverManager.getConnection(DB_URL, USER, password);
         Statement stmt = conn.createStatement();
     ) {
      String sql = "DELETE FROM Registration " +
              "WHERE id = 101";
      stmt.executeUpdate(sql);
      ResultSet rs = stmt.executeQuery(QUERY);
      while(rs.next()){
       //Display values
       System.out.print("ID: " + rs.getInt("id"));
       System.out.print(", Age: " + rs.getInt("age"));
       System.out.print(", First: " + rs.getString("first"));
       System.out.println(", Last: " + rs.getString("last"));
      }
      rs.close();
     } catch (SQLException e) {
      e.printStackTrace();
     }

    }*/


}
}