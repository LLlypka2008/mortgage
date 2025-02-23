package ru.test.mortgage.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.test.mortgage.models.JuridicalEntity;

@Repository
public interface JuridicalRepository extends JpaRepository<JuridicalEntity, Long> {
}