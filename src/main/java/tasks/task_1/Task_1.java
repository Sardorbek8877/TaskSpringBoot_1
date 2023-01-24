package tasks.task_1;

import java.sql.*;

public class Task_1 {

    private String url = "jdbc:postgresql://localhost:5432/computer_db";
    private String dbUser = "postgres";
    private String dbPassword = "123";

    public void getProducts(){
        try {
            Connection connection = DriverManager.getConnection(url, dbUser, dbPassword);
            String query = "select * from product;";
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()){

                String maker = resultSet.getString("maker");
                String model = resultSet.getString("model");
                String type = resultSet.getString("type");

                System.out.println("Maker = '" + maker + '\'' + ", model = '" + model + '\'' + ", type = '" + type + "'");
            }

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
