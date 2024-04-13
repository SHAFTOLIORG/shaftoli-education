package uz.rivoj.education.dto.response;

import lombok.*;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
@ToString
public class TutorsPageResponse {
    private List<ChatResponse> chats;
}
