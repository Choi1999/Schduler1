package entity;

import jakarta.persistence.*;


import java.util.Date;

public class User {
    private Long id; // 사용자 ID
    private String username; // 사용자 이름
    private String password; // 비밀번호
    private String email; // 이메일
    private Date createdAt; // 등록 시간
    private Date updatedAt; // 수정 시간

    // 기본 생성자
    public User() {
    }

    // 모든 필드를 초기화하는 생성자
    public User(Long id, String username, String password, String email, Date createdAt, Date updatedAt) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.email = email;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
    }

    // Getters and Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    public Date getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(Date updatedAt) {
        this.updatedAt = updatedAt;
    }
}