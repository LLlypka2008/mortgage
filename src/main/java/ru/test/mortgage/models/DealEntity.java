package ru.test.mortgage.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.util.Date;
import java.util.GregorianCalendar;

/*
Модель данных для взаимодействия с БД
Бизнес сущность - сделка.
 */
@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class DealEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private Long id;

    @Column(name = "credit_amount")
    private BigDecimal creditAmount;

    @Column(name = "initial_payment")
    private BigDecimal initialPayment;

    @Column(name = "deal_amount")
    private BigDecimal dealAmount;

    @Column(name = "credit_year")
    private Integer creditYear;

    @Column(name = "date_of_submission")
    private Date dateOfSubmission;

}
