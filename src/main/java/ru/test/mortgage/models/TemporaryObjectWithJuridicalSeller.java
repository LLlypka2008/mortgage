package ru.test.mortgage.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

@Data
@Component
@NoArgsConstructor
@AllArgsConstructor
public class TemporaryObjectWithJuridicalSeller {

    private DealEntity deal;

    private JuridicalEntity seller;

    private IndividualEntity buyer;

}