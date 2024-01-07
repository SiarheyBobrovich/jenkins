package ru.clevertec.jenkins.entity.listener;

import jakarta.persistence.PostPersist;
import jakarta.persistence.PrePersist;
import jakarta.persistence.PreUpdate;
import ru.clevertec.jenkins.entity.House;

import java.util.Objects;
import java.util.UUID;

public class HouseEntityListener {

    @PreUpdate
    public void preUpdate(House house) {
        setTenants(house);
    }

    @PrePersist
    public void prePersist(House house) {
        house.setUuid(UUID.randomUUID());
    }

    @PostPersist
    public void postPersist(House house) {
        setTenants(house);
    }

    private void setTenants(House house) {
        house.getTenants().stream()
                .filter(person -> person.getResidency() == null || !Objects.equals(person.getResidency().getId(), house.getId()))
                .forEach(person -> person.setResidency(house));
    }
}
