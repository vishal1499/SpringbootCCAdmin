package com.springboot.creditcard.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="CREDIT_CARD")
public class CreditCardEntity {
    @Id
    Integer id;
    String name;
    Integer maxCredit;
    String interestRate;
    Boolean active;
    String recommendedScore;

}
