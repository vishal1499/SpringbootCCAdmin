package com.springboot.creditcard.service;

import com.springboot.creditcard.DTO.CreditCard;
import com.springboot.creditcard.Entity.CreditCardEntity;
import com.springboot.creditcard.mapper.CreditCardMapper;
import com.springboot.creditcard.repository.CreditCardDAO;
import com.springboot.creditcard.requestresponse.ApplicationResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CreditCardService {
    @Autowired
    CreditCardDAO creditCardDAO;
    @Autowired
    CreditCardMapper CreditCardMapper;
    public ApplicationResponse<CreditCard> createCard(CreditCard creditCard){

        CreditCardEntity entity = CreditCardMapper.beanToEntity(creditCard);
        CreditCard card = CreditCardMapper.entityTobean( creditCardDAO.save(entity));
        ApplicationResponse<CreditCard> res = new ApplicationResponse<>();
        res.setError(Boolean.FALSE);
        res.setErrorMsg(null);
        res.setResponse(card);
        res.setStatus(HttpStatus.OK);
        return res;
    }

    public ApplicationResponse<List<CreditCard>> getAllCreditCards() {
        List<CreditCard> cards = CreditCardMapper.listEntityToListbean(creditCardDAO.findAll());
        ApplicationResponse<List<CreditCard>> res = new ApplicationResponse<>();
        res.setError(Boolean.FALSE);
        res.setErrorMsg(null);
        res.setStatus(HttpStatus.OK);
        res.setResponse(cards);
        return res;
    }
}
