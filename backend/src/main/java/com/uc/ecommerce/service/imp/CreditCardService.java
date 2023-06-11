package com.uc.ecommerce.service.imp;

import com.uc.ecommerce.model.dto.card.CreditCardResponse;
import com.uc.ecommerce.model.dto.card.SaveCreditCardRequest;
import com.uc.ecommerce.model.dto.card.UpdateCreditCardRequest;
import com.uc.ecommerce.model.entity.card.CreditCard;
import jakarta.transaction.Transactional;

import java.util.List;

public interface CreditCardService {
    CreditCard create(SaveCreditCardRequest saveCreditCardRequest);

    CreditCardResponse save(SaveCreditCardRequest saveCreditCardRequest) ;

    @Transactional
    CreditCard save(CreditCard card);

    CreditCardResponse update(Long id, UpdateCreditCardRequest updateCreditCardRequest);

    CreditCard findById(Long id);

    void delete(Long id);

    CreditCardResponse getById(Long id);

    List<CreditCardResponse> geyMy();
}
