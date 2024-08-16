package service;

import entity.User;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public abstract class UserServiceImpl implements UserService {
    private String jdbcURL = "jdbc:mysql://localhost:3306/Scheduler"; // DB URL
    private String jdbcUsername = "root"; // DB 사용자 이름
    private String jdbcPassword = "asdf123"; // DB 비밀번호

    @Override
    public User loginByEmail(String email, String password) {
        User user = null;
        String sql = "SELECT * FROM users WHERE email = ? AND password = ?"; // SQL 쿼리

        try (Connection connection = DriverManager.getConnection(jdbcURL, jdbcUsername, jdbcPassword);
             PreparedStatement preparedStatement = connection.prepareStatement(sql)) {

            preparedStatement.setString(1, email);
            preparedStatement.setString(2, password);
            ResultSet resultSet = preparedStatement.executeQuery();

            if (resultSet.next()) {
                user = new User();
                user.setEmail(resultSet.getString("email"));
                user.setPassword(resultSet.getString("password"));
                // 필요한 다른 필드들도 설정합니다.
            }
        } catch (Exception e) {
            e.printStackTrace(); // 예외 처리
        }
        return user; // 인증 성공 시 사용자 객체 반환
    }

    @Override
    public void registerUser(User user) {
        String sql = "INSERT INTO users (email, password) VALUES (?, ?)";
        try (Connection connection = DriverManager.getConnection(jdbcURL, jdbcUsername, jdbcPassword);
             PreparedStatement preparedStatement = connection.prepareStatement(sql)) {

            preparedStatement.setString(1, user.getEmail());
            preparedStatement.setString(2, user.getPassword());
            preparedStatement.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace(); // 예외 처리
        }
    }
}