package org.rest.model.dto.trainee.response;

import com.epam.xstack.model.entity.Trainer;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class UpdateTrainee_sTrainerListResponseDTO {
    private List<Trainer> trainers;
}
