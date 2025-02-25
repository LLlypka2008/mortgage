package ru.test.mortgage.DTO;

import lombok.Getter;
import org.springframework.stereotype.Component;
import java.math.BigDecimal;

/*
DTO сделки. Создается в контроллере и используется для создания DealEntity.
Содержит поля необходимые получить от пользователя.
 */

@Component
@Getter
public class DealDTO {

    private BigDecimal creditAmount;

    private BigDecimal initialPayment;

    private Integer creditMonth;


}
