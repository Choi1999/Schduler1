package entity;

import java.util.Date;

public class Schedule {
    private Long id; // 일정 ID
    private Long userId; // 사용자 ID
    private Long eventId; // 이벤트 ID
    private String activity; // 활동
    private Date scheduledTime; // 예약 시간
    private String password; // 일정 비밀번호
    private Date createdAt; // 등록 시간
    private Date updatedAt; // 수정 시간

    // 기본 생성자
    public Schedule() {
    }

    // 모든 필드를 초기화하는 생성자
    public Schedule(Long id, Long userId, Long eventId, String activity, Date scheduledTime, String password, Date createdAt, Date updatedAt) {
        this.id = id;
        this.userId = userId;
        this.eventId = eventId;
        this.activity = activity;
        this.scheduledTime = scheduledTime;
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

    public Long getEventId() {
        return eventId;
    }

    public void setEventId(Long eventId) {
        this.eventId = eventId;
    }

    public String getActivity() {
        return activity;
    }

    public void setActivity(String activity) {
        this.activity = activity;
    }

    public Date getScheduledTime() {
        return scheduledTime;
    }

    public void setScheduledTime(Date scheduledTime) {
        this.scheduledTime = scheduledTime;
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