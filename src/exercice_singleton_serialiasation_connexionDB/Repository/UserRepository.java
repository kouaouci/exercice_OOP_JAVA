package exercice_singleton_serialiasation_connexionDB.Repository;


import exercice_singleton_serialiasation_connexionDB.Connexion_DB;
import exercice_singleton_serialiasation_connexionDB.User;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public interface UserRepository extends IBaseRepository<User> {
      Connexion_DB connection=null;

    @Override
    public default List<User> getAll() throws SQLException {
        List<User> users = new ArrayList<> ();

        String query = "SELECT * FROM users";
        PreparedStatement stmt = connection.prepareStatement(query);
        ResultSet rs = stmt.executeQuery();
        while (rs.next()) {
            int id = (int) rs.getLong("id");
            String name = rs.getString("Name");
            String firstname = rs.getString("Firstname");
           LocalDate birthdate = LocalDate.parse(rs.getString("Birthdate"));
            users.add(new User(id, name,firstname ,birthdate));
        }

        return users;
    }

    @Override
    public default User insertUser(User user) throws SQLException {
        String query = "INSERT INTO users(Name, Firstname, Birthdate) VALUES(?, ?, ?)";
        PreparedStatement stmt = connection.prepareStatement(query);
        stmt.setString(1, user.getNom ());
        stmt.setString(2, user.getPrenom ());


        stmt.executeUpdate();
        return user;
    }

    @Override
    public default User updateUser(User user) throws SQLException {
        String query = "UPDATE users SET Name=?, Firstname=?, Birthdate=? WHERE id=?";
        PreparedStatement stmt = connection.prepareStatement(query);
        stmt.setString(1, user.getNom ());
        stmt.setString(2, user.getPrenom ());
        stmt.setDate(3, java.sql.Date.valueOf(user.getDateNaissance ()));
        stmt.setLong(4, user.getId());
        stmt.executeUpdate();
        return user;

    }

    @Override
    public default User deleteUser(User user) throws SQLException {
        String query = "DELETE FROM users WHERE id=?";
        PreparedStatement stmt = connection.prepareStatement(query);
        stmt.setLong(1, user.getId());
        stmt.executeUpdate();
        return user;
    }


}
