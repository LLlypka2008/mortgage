package ru.test.mortgage.DTO;

import lombok.Getter;
import org.springframework.stereotype.Component;

/*
DTO физ. лица. Создается в контроллере и используется для создания IndividualEntity.
Содержит поля необходимые получить от пользователя.
 */

@Component
@Getter
public class IndividualDTO {

    private String name;

    private String surname;

    private String patronymic;

    private String phoneNumber;

    private String address;

    private Long passportSeriesAndNumber;

    private Long SNILS;

    private String residentialAddress;
}
