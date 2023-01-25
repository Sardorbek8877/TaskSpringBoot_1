package tasks.task_4;

import java.sql.*;
import java.util.HashSet;

public class Task4 {

    private String url = "jdbc:postgresql://localhost:5432/computer_db";
    private String dbUser = "postgres";
    private String dbPassword = "123";
    public void addProduct( Product product){
        try {
            Connection connection = DriverManager.getConnection(url, dbUser, dbPassword);

            if (checkProduct(product)){
                String query = "{call add_product(?,?,?)}";
                CallableStatement callableStatement = connection.prepareCall(query);
                callableStatement.setString(1, product.getMaker());
                callableStatement.setString(2, product.getModel());
                callableStatement.setString(3, product.getType());
                callableStatement.executeUpdate();
                System.out.println("Product added!");
            }
            else {
                System.out.println("There is already a product with this model");
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    private boolean checkProduct(Product product){
        HashSet<String> models = getModels();
        int count = 0;
        for ( String element : models ){
            if(element.equals(product.getModel())){
                count++;
            }
        }
        return count == 0;
    }

    private HashSet<String> getModels(){
        try {
            Connection connection = DriverManager.getConnection(url, dbUser, dbPassword);
            HashSet<String> models = new HashSet<>();
            String query = "select model from product;";
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()){
                String model = resultSet.getString("model");
                models.add(model);
            }
            return models;


        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
