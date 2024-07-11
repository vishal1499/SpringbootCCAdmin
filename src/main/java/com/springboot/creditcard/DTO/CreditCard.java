package com.springboot.creditcard.DTO;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CreditCard {

    int id;
    String name;
    int maxCredit;
    String interestRate;
    Boolean active;
    String recommendedScore;
}
