package org.rest.model.dto.trainer.response;

import com.epam.xstack.model.entity.Trainee;
import com.epam.xstack.model.entity.TrainingType;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class GetTrainerProfileResponseDTO {
    private String firstName;
    private String lastName;
    private TrainingType specialization;
    private Boolean isActive;
    private List<Trainee> trainees;
}


