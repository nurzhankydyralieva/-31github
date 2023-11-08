package org.example.model;

import lombok.Builder;

@Builder
public class Trainer {
    private Long id;
    private String name;

    public Trainer() {
    }

    public Trainer(Long id) {
        this.id = id;
    }

    public Trainer(Long id, String name) {
        this.id = id;
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Trainer{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
