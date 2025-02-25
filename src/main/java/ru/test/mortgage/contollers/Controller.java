package ru.test.mortgage.contollers;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.test.mortgage.DTO.DealDTO;
import ru.test.mortgage.DTO.IndividualDTO;
import ru.test.mortgage.DTO.JuridicalDTO;

@RestController
@RequestMapping("/mortgage")
public class Controller {


    @PostMapping("/juridical")
    String postDealJuridicalSeller(@RequestBody DealDTO deal, IndividualDTO buyer, JuridicalDTO seller) {

        //TODO переписать что буду возвращать response entity
        return "Juridical";
    }

    @PostMapping("/individual")
    String postDealIndividualSeller(@RequestBody DealDTO deal, IndividualDTO buyer, IndividualDTO seller) {

        //TODO переписать что буду возвращать response entity
        return "Individual";
    }
}