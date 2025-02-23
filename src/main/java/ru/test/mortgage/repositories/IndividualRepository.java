package ru.test.mortgage.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.test.mortgage.models.IndividualEntity;

@Repository
public interface IndividualRepository extends JpaRepository<IndividualEntity, Long> {
}