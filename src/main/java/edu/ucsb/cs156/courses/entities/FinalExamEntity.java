package edu.ucsb.cs156.courses.entities;

import java.time.LocalDateTime;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity(name = "final_exams") // NOTE: Do we need to change this?
public class FinalExamEntity {
    @Id private String quarterYYYYQEnrollCd;
    private Boolean hasFinals;
    private String comments;
    private LocalDateTime finalExamStart;
    private LocalDateTime finalExamEnd;
}
