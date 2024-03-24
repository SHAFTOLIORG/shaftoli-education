package uz.shaftoli.education.entity;


import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import lombok.*;

@Entity(name = "lesson")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
public class Lesson  extends BaseEntity{
    @ManyToOne
    private Module module;
    private Integer number;
    private String title;
    private String content;
}
