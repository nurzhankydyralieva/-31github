package org.rest.model.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "trainee")
public class Trainee extends User {
    //    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    @Column(name = "trainee_id")
//    private Long id;
    @Column(name = "date_of_birth")
    @Temporal(TemporalType.DATE)
    private Date dateOfBirth;
    @Column(name = "address")
    private String address;
    @ManyToMany(fetch = FetchType.EAGER, mappedBy = "trainees")
    private List<Trainer> trainers;
    @OneToMany(fetch = FetchType.EAGER)
    @JoinTable(
            name = "trainee_training",
            joinColumns = @JoinColumn(name = "trainee_id"),
            inverseJoinColumns = @JoinColumn(name = "training_id")
    )
    private List<Training> trainings;

    public Trainee(Long id, String firstName, String lastName, String userName, String password, Boolean isActive, String criteria, Boolean isAssigned, Date dateOfBirth, String address, List<Trainer> trainers, List<Training> trainings) {
        super(id, firstName, lastName, userName, password, isActive, criteria, isAssigned);
        this.dateOfBirth = dateOfBirth;
        this.address = address;
        this.trainers = trainers;
        this.trainings = trainings;
    }
}
