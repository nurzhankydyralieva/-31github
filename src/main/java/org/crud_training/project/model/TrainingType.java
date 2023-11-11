package org.crud_training.project.model;

public class TrainingType {
    private Integer id;
    private String name;

    public TrainingType() {
    }

    public TrainingType(Integer id, String name) {
        this.id = id;
        this.name = name;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
