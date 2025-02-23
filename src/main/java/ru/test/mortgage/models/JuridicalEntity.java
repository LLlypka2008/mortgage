package ru.test.mortgage.models;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.ru.INN;

import java.util.List;

/*
Модель данных для взаимодействия с БД
Бизнес сущность - юридическое лицо.
 */
@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class JuridicalEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "juridical_name")
    @NotBlank
    private String juridicalName;

    @Column(name = "phone_number", nullable = false)
    private String phoneNumber;

    @Column(nullable = false)
    @Length(min = 2, max = 3)
    private Short region;

    @Column(name = "registration_address", nullable = false)
    private String address;

    @Column(nullable = false)
    @INN(type = org.hibernate.validator.constraints.ru.INN.Type.JURIDICAL)
    private Long INN;

    @Column(nullable = false)
    private Long OGRN;

    @OneToMany
    @Column(name = "deal_list")
    private List<DealEntity> dealEntityList;

}