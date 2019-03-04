/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mutugadingparts;
import java.sql.*;
import static java.awt.Frame.MAXIMIZED_BOTH;
/**
 *
 * @author HP
 */
public class MutuGadingParts {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//        Connection con;
//        // TODO code application logic here
//        try{
//            Class.forName("com.mysql.jdbc.Driver");
//            con=DriverManager.getConnection("jdbc:mysql://localhost:3306/mutugadingparts", "root", "");
//            System.out.println("Connection success at server "+con.getMetaData().getDatabaseProductName());
//        }
//        catch(Exception e){
//            System.out.println(e.getMessage());
//        }
        frmMain main = new frmMain();
        main.show();
        main.setExtendedState(MAXIMIZED_BOTH);
    }
    
}
