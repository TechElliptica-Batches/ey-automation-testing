package day2;

public class DBConnection {
    public static void main(String[] args) {
//        SQLConnection c = SQLConnection.getConnection();
//        c.connectMeToDatabase();

        for(int i = 1; i <= 1000000 ; i++) {
            SQLConnection conn = SQLConnection.getConnection();
            System.out.println(conn);
        }
    }
}

// singleton design pattern
class SQLConnection{

    // create your constructor private
    // make a static object
    // return that object from static method

    private static SQLConnection conn = new SQLConnection();
    private SQLConnection(){
       // System.out.println("Create object of sql connection");
    }

    public static SQLConnection getConnection(){
        return conn;
    }

   public void connectMeToDatabase(){
       System.out.println("sql connected");
   }

}