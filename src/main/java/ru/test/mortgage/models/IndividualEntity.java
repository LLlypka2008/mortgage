package ru.test.mortgage.models;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.validator.constraints.Length;
import ru.test.mortgage.DTO.IndividualDTO;

import java.util.List;

/*
Модель данных для взаимодействия с БД
Бизнес сущность - физическое лицо.
 */

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "INDIVIDUAL_ENTITY")
public class IndividualEntity {

    //Поле Первичного ключа. Генерируется автоматически.
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    //Имя
    @NotBlank
    private String name;

    //Фамилия
    @NotBlank
    private String surname;

    //Отчество
    @NotBlank
    private String patronymic;

    //Номер телефона
    @Column(name = "phone_number", nullable = false)
    private String phoneNumber;

    //Адрес регистрации
    @Column(name = "registration_address", nullable = false)
    private String address;

    //Серия и номер паспорта
    @Column(name = "passport_series_and_number", unique = true, length = 10, nullable = false)
    @Length(min = 10, max = 10)
    private Long passportSeriesAndNumber;

    //Номер СНИЛС
    @Column(nullable = false, unique = true, length = 11)
    @Length(min = 11, max = 11)
    private Long SNILS;

    //Арес регистрации (прописка)
    @Column(name = "residential_address")
    private String residentialAddress;

    //Совершенные лицом сделки.
    @OneToMany
    @Column(name = "deal_list")
    private List<DealEntity> dealList;

    public IndividualEntity(IndividualDTO individualDTO) {
        this.name = individualDTO.getName();
        this.surname = individualDTO.getSurname();
        this.patronymic = individualDTO.getPatronymic();
        this.phoneNumber = individualDTO.getPhoneNumber();
        this.address = individualDTO.getAddress();
        this.passportSeriesAndNumber = individualDTO.getPassportSeriesAndNumber();
        this.SNILS = individualDTO.getSNILS();
        this.residentialAddress = individualDTO.getResidentialAddress();
    }

}