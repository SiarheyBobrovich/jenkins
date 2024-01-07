package ru.clevertec.jenkins.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.clevertec.jenkins.entity.House;

public interface HouseRepository extends JpaRepository<House, Long> {

}
