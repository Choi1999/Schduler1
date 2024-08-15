package dto;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
public class ScheduleDTO {
    private Long id;
    private Long userId;
    private Long eventId;
    private String activity;

    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd HH:mm:ss")
    private Date scheduledTime;

    // Getters and Setters
}