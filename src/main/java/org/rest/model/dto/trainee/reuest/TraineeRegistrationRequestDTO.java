package org.rest.model.dto.trainee.reuest;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class TraineeRegistrationRequestDTO {
    private String firstName;
    private String lastName;
    private Date dateOfBirth;
    private String address;
}