package ru.test.mortgage.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.test.mortgage.models.DealEntity;

@Repository
public interface DealRepository extends JpaRepository<DealEntity, Long> {
}