package jm.task.core.jdbc.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Util {
    // реализуйте настройку соеденения с БД
    static String userName = "root";
    static String password = "nikneim";
    static String connectionURL = "jdbc:mysql://localhost:3306/test";
  public static Connection getConnection(){
      Connection connection = null;
      try {
          Class.forName("com.mysql.cj.jdbc.Driver");
          connection = DriverManager.getConnection(connectionURL,userName,password);
         // System.out.println("connection OK");
      } catch (ClassNotFoundException | SQLException e) {
          throw new RuntimeException(e);

      }
      return connection;
  }
}
