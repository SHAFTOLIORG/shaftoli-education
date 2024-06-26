package uz.rivoj.education.dto.response;

import lombok.*;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@Builder
@ToString
public class LessonPageResponse {
    private String source;
    private String cover;
    private TeacherResponse teacher;
    private List<CommentResponse> comments;
    private List<AttendanceResponse> attendances;
}
