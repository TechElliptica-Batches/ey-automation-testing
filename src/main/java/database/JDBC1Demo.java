package database;

import java.sql.*;

public class JDBC1Demo {
    public static void main(String[] args) {
// JDBC -
        // connect with database - done
        // statement creation  -
        // get result set and iterate it
        Connection conn = null;
        try{
            String connectionString = "jdbc:mysql://localhost:3306/ey-training";
            String username = "ey-training_user";
            String password = "ey-training_pass";

            conn = DriverManager.getConnection(connectionString, username, password);
            String sqlQuery = "SELECT * FROM `employee` WHERE EMPDESIGNATION = 'MANAGER'";

            Statement stmt = conn.createStatement();
            ResultSet re = stmt.executeQuery(sqlQuery);
// cursor process
            while(re.next()){
                System.out.print(re.getString("EMPID") + " - ");
                System.out.print(re.getString("EMPNAME")+ " - ");
                System.out.print(re.getString("EMPDESIGNATION")+ " - ");
                System.out.println();
            }
        }catch(Exception e){
            e.printStackTrace();
        }finally {
            if(conn != null) {
                try {
                    conn.close();
                } catch (SQLException e) {
                    throw new RuntimeException(e);
                }
            }
        }


    }
}
