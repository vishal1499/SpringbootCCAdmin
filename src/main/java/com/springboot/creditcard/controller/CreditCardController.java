package com.springboot.creditcard.controller;

import com.springboot.creditcard.CreditcardApplication;
import com.springboot.creditcard.DTO.CreditCard;
import com.springboot.creditcard.requestresponse.ApplicationResponse;
import com.springboot.creditcard.service.CreditCardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/ccAdmin")
public class CreditCardController {
    @Autowired
    CreditCardService service;
    @CrossOrigin(origins = "http://localhost:4200/")
    @PostMapping("/create")
    public ApplicationResponse<CreditCard> createCreditCard(@RequestBody CreditCard creditCard){
        return service.createCard(creditCard);
    }
    @CrossOrigin(origins = "http://localhost:4200/")
    @GetMapping("/getAllCards")
    public ApplicationResponse<List<CreditCard>> getCreditCards(){
        return service.getAllCreditCards();
    }
}
