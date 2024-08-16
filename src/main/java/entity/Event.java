package entity;

import java.util.Date;

public class Event {
    private Long id; // 이벤트 ID
    private Long userId; // 사용자 ID
    private String title; // 이벤트 제목
    private String description; // 이벤트 설명
    private Date startTime; // 시작 시간
    private Date endTime; // 종료 시간
    private String password; // 이벤트 비밀번호
    private Date createdAt; // 등록 시간
    private Date updatedAt; // 수정 시간

    // 기본 생성자
    public Event() {
    }

    // 모든 필드를 초기화하는 생성자
    public Event(Long id, Long userId, String title, String description, Date startTime, Date endTime, String password, Date createdAt, Date updatedAt) {
        this.id = id;
        this.userId = userId;
        this.title = title;
        this.description = description;
        this.startTime = startTime;
        this.endTime = endTime;
        this.password = password;
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

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Date getStartTime() {
        return startTime;
    }

    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    public Date getEndTime() {
        return endTime;
    }

    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
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