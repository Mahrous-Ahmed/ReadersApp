package Service;

import java.sql.*;
import java.util.HashMap;
import java.util.Hashtable;

public class DataBase {
    static Connection connection;
    static Statement statement ;
    public static void makeConnection() throws SQLException {
         connection = DriverManager.getConnection("jdbc:postgresql://nagwa-readers.cmmuo3lde4yu.us-east-1.rds.amazonaws.com/NagwaReaders-UserManagement-Beta", "postgres", "wJieVx5H7Y4EVzl8D5BZ");
         statement = connection.createStatement();

    }
    public static void closeConnection() throws SQLException {
        statement.close();
        connection.close();


    }
    public static String getConfirmationCodeFromDB(String email) throws SQLException {
        String confirmationCode = null;
        makeConnection();

        String Query = "select \"EmailConfirmationCode\" from public.\"User\" where \"Email\" = " + email;
        ResultSet resultSet =  statement.executeQuery(Query);

        while (resultSet.next()){
            System.out.println("Confirmation Code: "+ resultSet.getString("EmailConfirmationCode"));
            confirmationCode = resultSet.getString("EmailConfirmationCode");
        }

        resultSet.close();
        closeConnection();
        return confirmationCode;

    }


    public static  Hashtable<String , String> getUserIdentifier(String email) throws SQLException {
        Hashtable<String , String> hashtable = new Hashtable<String , String >();


        makeConnection();

        String Query = "select \"UserIdentifier\" , \"Language\" from public.\"User\" where \"Email\" = " + email;
       System.out.println(Query);
        ResultSet resultSet =  statement.executeQuery(Query);

        while (resultSet.next()){

            hashtable.put("UserIdentifier" , resultSet.getString("UserIdentifier"));
            hashtable.put("Language" , resultSet.getString("Language"));

            System.out.println("getUserIdentifier: "+ hashtable.get("UserIdentifier"));
            System.out.println("getUserIdentifier: "+ hashtable.get("Language"));

        }

        resultSet.close();
        closeConnection();

        return hashtable;

    }





    public static void main(String[] args) throws SQLException {
        getConfirmationCodeFromDB("'mahrous@gmail.com'");
        getUserIdentifier("'mahrous@gmail.com'");
    }




}