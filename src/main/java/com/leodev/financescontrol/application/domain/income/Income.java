package com.leodev.financescontrol.application.domain.income;

import com.leodev.financescontrol.application.domain.income.enums.INCOME_PAYMENT_METHOD;
import com.leodev.financescontrol.application.domain.income.enums.INCOME_RECURRENCE_TYPE;
import com.leodev.financescontrol.application.domain.income.enums.INCOME_STATUS;
import com.leodev.financescontrol.application.domain.income.enums.INCOME_TYPE;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.time.LocalDate;

@Entity
@NoArgsConstructor
@Getter
public class Income {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column()
    private String debitor;
    @Column
    private String description;
    @Column
    @Enumerated(EnumType.STRING)
    private INCOME_TYPE incomeType;
    @Column
    private LocalDate date;
    @Column
    private BigDecimal incomeValue;
    @Column(name = "payment_method")
    @Enumerated(EnumType.STRING)
    private INCOME_PAYMENT_METHOD paymentMethod;
    @Column()
    private boolean recurrent;
    @Column
    @Enumerated(EnumType.STRING)
    private INCOME_RECURRENCE_TYPE recurrenceType;
    @Column(name = "recurrences_to_pay")
    private int recurrencesToPay;
    @Column(name = "recurrences_paid")
    private int recurrencesPaid;
    @Column()
    @Enumerated(EnumType.STRING)
    private INCOME_STATUS status;
    @Column
    private String comment;


    public Income(String debitor, String description, INCOME_TYPE incomeType, LocalDate date, BigDecimal incomeValue, INCOME_PAYMENT_METHOD paymentMethod, boolean recurrent, INCOME_RECURRENCE_TYPE recurrenceType, int recurrencesToPay, int recurrencesPaid, INCOME_STATUS status, String comment) {
        this.debitor = debitor;
        this.description = description;
        this.incomeType = incomeType;
        this.date = date;
        this.incomeValue = incomeValue;
        this.paymentMethod = paymentMethod;
        this.recurrent = recurrent;
        this.recurrenceType = recurrenceType;
        this.recurrencesToPay = recurrencesToPay;
        this.recurrencesPaid = recurrencesPaid;
        this.status = status;
        this.comment = comment;
    }
}
