package ru.test.mortgage.models;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.validator.constraints.Length;

import java.util.List;

/*
Модель данных для взаимодействия с БД
Бизнес сущность - физическое лицо.
 */
@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class IndividualEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @NotBlank
    private String name;

    @NotBlank
    private String surname;

    @NotBlank
    private String patronymic;

    @Column(name = "phone_number", nullable = false)
    private String phoneNumber;

    @Column(nullable = false)
    @Length(min = 2, max = 3)
    private Short region;

    @Column(name = "registration_address", nullable = false)
    private String address;

    @Column(name = "passport_series_and_number", nullable = false)
    @Length(min = 10, max = 10)
    private Long passportSeriesAndNumber;

    @Column(nullable = false)
    @Length(min = 11, max = 11)
    private Long SNILS;

    @Column(name = "residential_address")
    private String residentialAddress;

    @OneToMany
    @Column(name = "deal_list")
    private List<DealEntity> dealList;

}