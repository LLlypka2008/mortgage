package ru.test.mortgage.contollers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import ru.test.mortgage.models.DealEntity;
import ru.test.mortgage.models.IndividualEntity;
import ru.test.mortgage.models.JuridicalEntity;
import ru.test.mortgage.repositories.DealRepository;
import ru.test.mortgage.repositories.IndividualRepository;
import ru.test.mortgage.repositories.JuridicalRepository;

@RestController
@RequestMapping("/mortgage")
public class Controller {

    @Autowired
    private DealRepository dealRepository;

    @Autowired
    private IndividualRepository individualRepository;

    @Autowired
    private JuridicalRepository juridicalRepository;

    @PostMapping("/juridical")
    String postDealJuridicalSeller(@RequestBody DealEntity dealEntity, IndividualEntity buyer, JuridicalEntity seller) {
        dealRepository.saveAndFlush(dealEntity);
        individualRepository.saveAndFlush(buyer);
        juridicalRepository.saveAndFlush(seller);
        //TODO переписать что буду возвращать response entity
        return "Juridical";
    }

    @PostMapping("/individual")
    String postDealIndividualSeller(@RequestBody DealEntity dealEntity, IndividualEntity buyer, IndividualEntity seller) {
        dealRepository.saveAndFlush(dealEntity);
        individualRepository.saveAndFlush(buyer);
        individualRepository.saveAndFlush(seller);
        //TODO переписать что буду возвращать response entity
        return "Individual";
    }

    @GetMapping("/api")
    ResponseEntity<DealEntity> getApi() {

        return new ResponseEntity<DealEntity>(HttpStatusCode.valueOf(200));
    }

    @GetMapping("/get")
    ResponseEntity<DealEntity> getFirst() {
        DealEntity dealEntity = dealRepository.findById(1l).get();
        return new ResponseEntity<>(dealEntity, HttpStatusCode.valueOf(200));
    }
}