package ru.test.mortgage.models;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.validator.constraints.ru.INN;
import ru.test.mortgage.DTO.JuridicalDTO;

import java.util.List;

/*
Модель данных для взаимодействия с БД
Бизнес сущность - юридическое лицо.
 */

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "JURIDICAL_ENTITY")
public class JuridicalEntity {

    //Поле Первичного ключа. Генерируется автоматически.
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    //Наименование юридического лица.
    @Column(name = "juridical_name")
    @NotBlank
    private String juridicalName;

    //Номер телефона для связи.
    @Column(name = "phone_number", nullable = false)
    private String phoneNumber;

    //Адрес регистрации юр. лица.
    @Column(name = "registration_address", nullable = false)
    private String address;

    //ИНН юр. лица
    @Column(nullable = false)
    @INN(type = org.hibernate.validator.constraints.ru.INN.Type.JURIDICAL)
    private Long INN;

    //ОГРН юр. лица.
    @Column(nullable = false)
    private Long OGRN;

    //Лист для хранения сделок.
    @OneToMany
    @Column(name = "deal_list")
    private List<DealEntity> dealEntityList;

    public JuridicalEntity(JuridicalDTO juridicalDTO) {
        this.juridicalName = juridicalDTO.getJuridicalName();
        this.phoneNumber = juridicalDTO.getPhoneNumber();
        this.address = juridicalDTO.getAddress();
        this.INN = juridicalDTO.getINN();
        this.OGRN = juridicalDTO.getOGRN();
    }

}