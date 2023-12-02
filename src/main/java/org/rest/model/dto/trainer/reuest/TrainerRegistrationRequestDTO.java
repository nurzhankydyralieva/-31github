package org.rest.model.dto.trainer.reuest;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class TrainerRegistrationRequestDTO {
    private String firstName;
    private String lastName;
//    private Specialization specialization;
}
