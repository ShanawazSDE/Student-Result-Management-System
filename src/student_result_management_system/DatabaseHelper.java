/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package student_result_management_system;
import java.sql.*;
import javax.swing.JOptionPane;
/**
 *
 * @author Feroz
 */
public class DatabaseHelper {
     public static final String url = "jdbc:mysql://localhost:3306/student_result_management_system";
    public static final String user = "root";
    public static final String password = "mySqlLqsym";
    private static Connection connection = null;
    private static Statement statement = null;
    
//    public static Statement getConnectionStatement(){
//        if(statement == null){
//            try {
//                
//                connection = DriverManager.getConnection(url, user, password);
//                statement = connection.createStatement();
//            } catch (Exception e) {
//               // JOptionPane.showMessageDialog(null,"unable to connect to database" );
//             e.printStackTrace();
//            }
//           
//        }
//        return statement;
//    }
    
        public static Connection getConnection(){
        if(connection == null){
            try {
                
                connection = DriverManager.getConnection(url, user, password);
                //statement = connection.createStatement();
            } catch (Exception e) {
               // JOptionPane.showMessageDialog(null,"unable to connect to database" );
             e.printStackTrace();
            }
           
        }
        return connection;
    }
}
