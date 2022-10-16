package Service;

import java.sql.*;

public class DataBase {
    public static String getConfirmationCodeFromDB(String email) throws SQLException {
        String confirmationCode = null;

        Connection connection = DriverManager.getConnection("jdbc:postgresql://nagwa-readers.cmmuo3lde4yu.us-east-1.rds.amazonaws.com/NagwaReaders-UserManagement-Beta", "postgres", "wJieVx5H7Y4EVzl8D5BZ");
        Statement statement = connection.createStatement();
        String Query = "select \"EmailConfirmationCode\" from public.\"User\" where \"Email\" = " + email;
        ResultSet resultSet =  statement.executeQuery(Query);

        while (resultSet.next()){
            System.out.println("Confirmation Code: "+ resultSet.getString("EmailConfirmationCode"));
            confirmationCode = resultSet.getString("EmailConfirmationCode");
        }

        resultSet.close();
        statement.close();
        connection.close();

        return confirmationCode;

    }

    public static void main(String[] args) throws SQLException {
        getConfirmationCodeFromDB("'mahrous@gmail.com'");
    }




}