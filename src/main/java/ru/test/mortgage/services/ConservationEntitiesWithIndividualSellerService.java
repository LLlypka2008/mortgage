package ru.test.mortgage.services;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.test.mortgage.repositories.DealRepository;
import ru.test.mortgage.repositories.IndividualRepository;

@Data
@Service
@NoArgsConstructor
public class ConservationEntitiesWithIndividualSellerService {

    private DealRepository dealRepository;

    private IndividualRepository individualRepository;

    @Autowired
    public ConservationEntitiesWithIndividualSellerService(DealRepository dealRepository, IndividualRepository individualRepository) {
        this.dealRepository = dealRepository;
        this.individualRepository = individualRepository;
    }
}
