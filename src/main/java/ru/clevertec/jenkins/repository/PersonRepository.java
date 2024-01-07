package ru.clevertec.jenkins.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.clevertec.jenkins.entity.Person;

public interface PersonRepository extends JpaRepository<Person, Long> {

}
