
package databaseconnection;


import java.sql.*;
import databaseconnection.ConnectionPackage.Connection;
/**
 *
 * @author Eric Alvarez
 */
public class DataBaseConnection {

    public static void main(String[] args) {
 
        Connection newConnection = new Connection(); 
        newConnection.Connection();
        
        //metodo crear usuario
        
        //newConnection.CreateUser();
        
        //metodo borrar usuario
        //newConnection.DeleteUser();
        
        //metodo actualizar usuario
        //newConnection.updateUser();
    }
}
