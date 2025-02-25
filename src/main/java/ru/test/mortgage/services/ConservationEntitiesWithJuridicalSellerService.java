package ru.test.mortgage.services;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.test.mortgage.repositories.DealRepository;
import ru.test.mortgage.repositories.IndividualRepository;
import ru.test.mortgage.repositories.JuridicalRepository;

@Data
@Service
@NoArgsConstructor
public class ConservationEntitiesWithJuridicalSellerService {

    private DealRepository dealRepository;

    private JuridicalRepository juridicalRepository;

    private IndividualRepository individualRepository;

    @Autowired
    public ConservationEntitiesWithJuridicalSellerService(DealRepository dealRepository, JuridicalRepository juridicalRepository, IndividualRepository individualRepository) {
        this.dealRepository = dealRepository;
        this.juridicalRepository = juridicalRepository;
        this.individualRepository = individualRepository;
    }
}
