
package databaseconnection.ConnectionPackage;
import java.sql.*;

/**
 *
 * @author Eric Alvarez
 */
public class Connection {

        private String dataBaseName ="usuarios";
        private String connectionUrl ="jdbc:mysql://localhost:3306/";
        private String user ="root";
        private String password="root";

    public Connection() {
    };
    
    public void Connection(){
        try{    
            //create conection
            java.sql.Connection NewConnection = DriverManager.getConnection(connectionUrl+dataBaseName,user,password);
            
            //create Statement
            Statement NewStatement = NewConnection.createStatement();
            
            //SQL
            ResultSet newResultset = NewStatement.executeQuery("SELECT * FROM user");
            
            //
            while(newResultset.next()){
                System.out.println(" Nombre: " +newResultset.getString("Nombre") +" "+ " Apellido: " + newResultset.getString("Apellido")+" "+ " CC: " +newResultset.getString("CC") +" "+"Eps: " + newResultset.getString("Eps") );
            }
            
            
        }catch(Exception e){
            System.out.println(e);
        }  

    
    };
    
    
      public void CreateUser(){
        try{    
            //create conection
            java.sql.Connection NewConnection = DriverManager.getConnection(connectionUrl+dataBaseName,user,password);
            
            //create Statement
            Statement NewStatement = NewConnection.createStatement();
            
            //SQL

            String sqlInstruction = "INSERT INTO USER (Nombre,Apellido,CC,Eps) VALUES ('Andres' , 'alvarez' , '1061048375', 'sura')";
            
           NewStatement.executeUpdate(sqlInstruction);
            
            
;            
            //
           
            
            
        }catch(Exception e){
            System.out.println(e);
        }  

    
    };
      
      
      public void DeleteUser(){
      
           try{    
            //create conection
            java.sql.Connection NewConnection = DriverManager.getConnection(connectionUrl+dataBaseName,user,password);
            
            //create Statement
            Statement NewStatement = NewConnection.createStatement();
            
            //SQL

            String sqlInstruction = "DELETE FROM USER WHERE CC='[1061048375]'";
            
            NewStatement.executeUpdate(sqlInstruction);
            
            System.out.println("dato eliminado correctamente");
            //
           
            
            
        }catch(Exception e){
            System.out.println(e);
        }  

      
      };
    
      
      public void updateUser(){
      
           try{    
            //create conection
            java.sql.Connection NewConnection = DriverManager.getConnection(connectionUrl+dataBaseName,user,password);
            
            //create Statement
            Statement NewStatement = NewConnection.createStatement();
            
            //SQL

            String sqlInstruction = "UPDATE USER SET Nombre='Eric' WHERE CC='1061048375'" ;
            
            NewStatement.executeUpdate(sqlInstruction);
            
            System.out.println("dato actualizado  correctamente");
            //
           
            
            
        }catch(Exception e){
            System.out.println(e);
        }  
          
      };
}
