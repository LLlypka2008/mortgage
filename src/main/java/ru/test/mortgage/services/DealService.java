package ru.test.mortgage.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.test.mortgage.models.DealEntity;
import ru.test.mortgage.repositories.DealRepository;

import java.math.BigDecimal;
import java.util.Date;

@Service
public class DealService {
    @Autowired
    DealRepository dealRepository;


    public DealEntity createDealEntity() {
        DealEntity deal = new DealEntity();
        deal.setCreditAmount(new BigDecimal(100));
        deal.setCreditMonth(1);
        deal.setDealAmount(new BigDecimal(100));
        deal.setInitialPayment(new BigDecimal(200));
        deal.setDateOfSubmission(new Date(System.currentTimeMillis()));
        System.out.printf("Создана сущность для сохранения в базу %S", deal);
        System.out.printf("Сохраняю сущность %S в репозиторий", dealRepository.saveAndFlush(deal));
        return deal;
    }
}
