package ru.test.mortgage.models;

import jakarta.persistence.*;
import jakarta.validation.constraints.Positive;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import ru.test.mortgage.DTO.DealDTO;

import java.math.BigDecimal;
import java.util.Date;

/*
Модель данных для взаимодействия с БД
Бизнес сущность - сделка.
 */

@Entity(name = "DEAL_ENTITY")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class DealEntity {

    //Поле Первичного ключа. Генерируется автоматически.
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    //Сумма кредита.
    @Column(name = "credit_amount")
    @Positive(message = "Сумма кредита должна быть больше ноля.")
    private BigDecimal creditAmount;

    //Первоначальный взнос.
    @Column(name = "initial_payment")
    @Positive(message = "Превоначальный взнос должен быть больше ноля.")
    private BigDecimal initialPayment;

    //Сумма сделки. Должна быть равна сумме первоначального взноса и суммы кредита.
    @Column(name = "deal_amount")
    @Positive(message = "Сумма сделки должна быть больше ноля.")
    private BigDecimal dealAmount;

    //Срока кредитования (колличество месяцев на который выдается кредит).
    @Column(name = "credit_month")
    @Positive
    private Integer creditMonth;

    //Дата подачи заявки.
    @Column(name = "date_of_submission", nullable = false)
    private Date dateOfSubmission;

    //Конструктор для создания DealEntity из DealDTO.
    public DealEntity(DealDTO dealDTO) {
        creditAmount = dealDTO.getCreditAmount();
        initialPayment = dealDTO.getInitialPayment();
        creditMonth = dealDTO.getCreditMonth();
        dealAmount = creditAmount.add(initialPayment);
        dateOfSubmission = new Date(System.currentTimeMillis());
    }
}