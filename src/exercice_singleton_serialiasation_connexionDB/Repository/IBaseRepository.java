package exercice_singleton_serialiasation_connexionDB.Repository;

import exercice_singleton_serialiasation_connexionDB.User;

import java.sql.SQLException;
import java.util.List;

public interface IBaseRepository <T>{

    // recuperer la liste des utilisateur
    List<T> getAll() throws SQLException;
   // recuperer un utlisateur avec son ID
    T getById(Long id) throws SQLException;

    User getById(int id) throws SQLException;

    // inserer un user
    T insertUser(T user) throws SQLException;
    // update un user avec son id
    T updateUser(T user) throws SQLException;
    // delete un user avec son id
    T deleteUser(T user) throws SQLException;

}
