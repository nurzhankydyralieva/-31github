package org.rest.model.entity;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.rest.model.enums.TrainingType;

import java.util.Date;
import java.util.Set;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name = "training")
public class Training {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "training_id")
    private Integer id;
    @ManyToOne
    @JoinColumn(name = "trainee_id")
    private Trainee traineeId;
    @ManyToOne
    @JoinColumn(name = "trainer_id")
    private Trainer trainerId;
    @Column(name = "training_name")
    private String trainingName;
    @Enumerated(EnumType.STRING)
    @Column(name = "training_type")
    private Set<TrainingType> trainingType;
    @Column(name = "training_date")
    private Date trainingDate;
    @Column(name = "training_duration")
    private Number trainingDuration;
}
