package CONEXION;



import java.sql.*;
import javax.swing.JOptionPane;

/**
 *
 * @author DELL
 */
public class CONECTAR {
    Connection conectar=null;
    
    public Connection conectar(){
     try  {
         Class.forName("com.mysql.jdbc.Driver");
         conectar=DriverManager.getConnection("jdbc:mysql://localhost:3306/tecno_stor","root","");
         JOptionPane.showMessageDialog(null,"conexion exitosa","conectar",JOptionPane.INFORMATION_MESSAGE);
     } catch(ClassNotFoundException |SQLException e){
         JOptionPane.showMessageDialog(null,"sin conexion"+e,"conectar",JOptionPane.ERROR_MESSAGE);
             }
     return conectar;
    }

   
     
    
}
