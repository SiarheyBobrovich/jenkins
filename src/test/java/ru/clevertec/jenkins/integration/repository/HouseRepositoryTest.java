package ru.clevertec.jenkins.integration.repository;

import lombok.RequiredArgsConstructor;
import org.junit.jupiter.api.Test;
import org.springframework.test.context.jdbc.Sql;
import ru.clevertec.jenkins.entity.House;
import ru.clevertec.jenkins.entity.Person;
import ru.clevertec.jenkins.integration.IntegrationTest;
import ru.clevertec.jenkins.repository.HouseRepository;

import java.util.List;
import java.util.UUID;

@IntegrationTest
@RequiredArgsConstructor
@Sql(scripts = "classpath:db/2_data.sql")
public class HouseRepositoryTest {

    private final HouseRepository houseRepository;

    @Test
    void save() {
        Person ownerTenant1 = Person.builder()
                .uuid(UUID.randomUUID())
                .name("Сергей")
                .surname("Бобрович")
                .build();

        Person ownerTenant2 = Person.builder()
                .uuid(UUID.randomUUID())
                .name("Дарья")
                .surname("Бобрович>")
                .build();

        Person tenant3 = Person.builder()
                .uuid(UUID.randomUUID())
                .name("Павел")
                .surname("Бобрович>")
                .build();

        House minsk = House.builder()
                .city("Минск")
                .address("Какая-то улица, какой-то дом")
                .owners(List.of(ownerTenant1, ownerTenant2))
                .tenants(List.of(ownerTenant1, ownerTenant2, tenant3))
                .build();

        House house = houseRepository.saveAndFlush(minsk);

        System.out.println("******HOUSE******");
        System.out.println(house);
        System.out.println("******OWNERS******");
        house.getOwners().forEach(System.out::println);
        System.out.println("******TENANTS******");
        house.getTenants().forEach(System.out::println);
    }
}
