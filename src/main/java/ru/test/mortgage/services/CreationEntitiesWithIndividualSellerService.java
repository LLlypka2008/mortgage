package ru.test.mortgage.services;

import org.springframework.stereotype.Service;
import ru.test.mortgage.DTO.DealDTO;
import ru.test.mortgage.DTO.IndividualDTO;
import ru.test.mortgage.models.TemporaryObjectWithIndividualSeller;

@Service
public class CreationEntitiesWithIndividualSellerService {

    private TemporaryObjectWithIndividualSeller model;

    public TemporaryObjectWithIndividualSeller createModel(DealDTO dealDTO,
                                                           IndividualDTO seller,
                                                           IndividualDTO buyer) {

        return new TemporaryObjectWithIndividualSeller();
    }

}
