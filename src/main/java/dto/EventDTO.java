package dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;

public class EventDTO {
    private Long id;
    private Long userId;
    private String title;
    private String description;

    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd HH:mm:ss")
    private Date startTime;

    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd HH:mm:ss")
    private Date endTime;

    // Getters and Setters
}