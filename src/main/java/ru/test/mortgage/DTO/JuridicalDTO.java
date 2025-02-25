package ru.test.mortgage.DTO;

import lombok.Getter;
import org.springframework.stereotype.Component;

/*
DTO юр. лица. Создается в контроллере и используется для создания JuridicalEntity.
Содержит поля необходимые получить от пользователя.
 */

@Component
@Getter
public class JuridicalDTO {

    private String juridicalName;

    private String phoneNumber;

    private String address;

    private Long INN;

    private Long OGRN;
}
