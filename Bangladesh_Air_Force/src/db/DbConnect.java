/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package db;
import java.sql.*;
import javax.swing.JOptionPane;
/**
 *
 * @author Farhan Sadik Turjo
 */
public class DbConnect {
 public static Connection c;  
  public static Statement st;
  static {
      try{
          Class.forName("com.mysql.cj.jdbc.Driver");
             c = DriverManager.getConnection("jdbc:mysql://localhost:3306/air_force", "root", "cbd0293@");
             st = c.createStatement();
      }catch(Exception ex) {
            JOptionPane.showMessageDialog(null, "Entey Aleredy Exist!");
        }
  }
 
}
