package com.springboot.creditcard.mapper;
import java.util.ArrayList;

import com.springboot.creditcard.DTO.CreditCard;
import com.springboot.creditcard.Entity.CreditCardEntity;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class CreditCardMapperImpl implements CreditCardMapper{


    @Override
    public CreditCardEntity beanToEntity(CreditCard creditCard) {
        CreditCardEntity creditCardEntity = new CreditCardEntity();
        creditCardEntity.setId(creditCard.getId());
        creditCardEntity.setName(creditCard.getName());
        creditCardEntity.setMaxCredit(creditCard.getMaxCredit());
        creditCardEntity.setInterestRate(creditCard.getInterestRate());
        creditCardEntity.setActive(creditCard.getActive());
        creditCardEntity.setRecommendedScore(creditCard.getRecommendedScore());
        return creditCardEntity;

    }

    @Override
    public CreditCard entityTobean(CreditCardEntity creditCardEntity) {
        CreditCard creditCard = new CreditCard();
        creditCard.setId(creditCardEntity.getId());
        creditCard.setName(creditCardEntity.getName());
        creditCard.setMaxCredit(creditCardEntity.getMaxCredit());
        creditCard.setInterestRate(creditCardEntity.getInterestRate());
        creditCard.setActive(creditCardEntity.getActive());
        creditCard.setRecommendedScore(creditCardEntity.getRecommendedScore());
        return creditCard;

    }

    @Override
    public List<CreditCard> listEntityToListbean(List<CreditCardEntity> creditCardEntity) {
        List<CreditCard> creditCardlist=new ArrayList<>();
        for (CreditCardEntity entity :creditCardEntity) {
        	creditCardlist.add(entityTobean(entity));
        }
        return creditCardlist;

    }
}
