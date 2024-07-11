package com.springboot.creditcard.mapper;

import com.springboot.creditcard.DTO.CreditCard;
import com.springboot.creditcard.Entity.CreditCardEntity;
//import org.mapstruct.Mapper;
import org.springframework.stereotype.Service;

import java.util.List;
public interface CreditCardMapper {

    public CreditCardEntity beanToEntity(CreditCard creditCard);
    public CreditCard entityTobean(CreditCardEntity creditCardEntity);

    public List<CreditCard> listEntityToListbean(List<CreditCardEntity> creditCardEntity);
}
