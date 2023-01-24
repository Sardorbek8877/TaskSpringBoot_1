package tasks.task_3;

import java.sql.*;

public class Task_3 {

    private String url = "jdbc:postgresql://localhost:5432/computer_db";
    private String dbUser = "postgres";
    private String dbPassword = "123";

    public void pc_info(){
        try {
            Connection connection = DriverManager.getConnection(url, dbUser, dbPassword);
            String query = "select maker, model, price from pc join product using(model);";
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()){

                String maker = resultSet.getString("maker");
                String model = resultSet.getString("model");
                String price = resultSet.getString("price");
                System.out.println("Maker = '" + maker + '\'' + ", model = '" + model + '\'' + ", price = '" + price + "'");

            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public void laptop_info(){
        try {
            Connection connection = DriverManager.getConnection(url, dbUser, dbPassword);
            String query = "select maker, model, price from laptop join product using (model)";
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()){

                String maker = resultSet.getString("maker");
                String model = resultSet.getString("model");
                String price = resultSet.getString("price");
                System.out.println("Maker = '" + maker + '\'' + ", model = '" + model + '\'' + ", price = '" + price + "'");
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public void printer_info(){
        try {
            Connection connection = DriverManager.getConnection(url, dbUser, dbPassword);
            String query = "select maker, model, price from printer join product using(model);";
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()){
                String maker = resultSet.getString("maker");
                String model = resultSet.getString("model");
                String price = resultSet.getString("price");
                System.out.println("Maker = '" + maker + '\'' + ", model = '" + model + '\'' + ", price = '" + price + "'");
            }

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
