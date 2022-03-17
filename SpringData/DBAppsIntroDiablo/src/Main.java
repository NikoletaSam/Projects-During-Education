import java.sql.*;
import java.util.Properties;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws SQLException {
        Scanner scanner = new Scanner(System.in);

        Properties properties = new Properties();
        properties.setProperty("user", "root");
        properties.setProperty("password", "");

        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/diablo", properties);

        PreparedStatement preparedStatement = connection.prepareStatement("SELECT u.first_name, u.last_name, count(ug.game_id) AS `games_count`\n" +
                "FROM users AS u\n" +
                "JOIN users_games AS ug ON u.id = ug.user_id\n" +
                "where u.user_name = ?\n" +
                "GROUP BY u.id");

        String username = scanner.nextLine();
        preparedStatement.setString(1, username);

        ResultSet result = preparedStatement.executeQuery();

        if (result.next()){
            String firstName = result.getString("first_name");
            String lastName = result.getString("last_name");
            int numOfGames = result.getInt("games_count");

            System.out.println("User: " + username + "\n" + firstName + " " + lastName + " has played " + numOfGames + " games");
        } else {
            System.out.println("No such user exists");
        }
        connection.close();
    }
}
