package com.springboot.creditcard.repository;

import com.springboot.creditcard.Entity.CreditCardEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CreditCardDAO extends JpaRepository<CreditCardEntity, Integer> {
}
