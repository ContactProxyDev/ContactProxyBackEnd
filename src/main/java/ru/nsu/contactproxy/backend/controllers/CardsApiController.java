package ru.nsu.contactproxy.backend.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.context.request.NativeWebRequest;
import ru.nsu.contactproxy.backend.dto.CardDTO;
import ru.nsu.contactproxy.backend.dto.UserDTO;

import java.util.List;
import java.util.Optional;

@Controller
public class CardsApiController implements CardsApi {

    private final NativeWebRequest request;

    @Autowired
    public CardsApiController(NativeWebRequest request) {
        this.request = request;
    }

    @Override
    public Optional<NativeWebRequest> getRequest() {
        return Optional.ofNullable(request);
    }

    @Override
    public ResponseEntity<CardDTO> createCard(CardDTO cardDTO) {
        return CardsApi.super.createCard(cardDTO);
    }

    @Override
    public ResponseEntity<Void> deleteById(Integer cardId) {
        return CardsApi.super.deleteById(cardId);
    }

    @Override
    public ResponseEntity<CardDTO> editById(Integer cardId) {
        return CardsApi.super.editById(cardId);
    }

    @Override
    public ResponseEntity<CardDTO> getCardById(Integer cardId) {
        return CardsApi.super.getCardById(cardId);
    }

    @Override
    public ResponseEntity<List<UserDTO>> getCardViewHistoryById(Integer cardId) {
        return CardsApi.super.getCardViewHistoryById(cardId);
    }

    @Override
    public ResponseEntity<List<CardDTO>> getUsersCards(Integer userId) {
        return CardsApi.super.getUsersCards(userId);
    }

    @Override
    public ResponseEntity<List<CardDTO>> getUsersHistoryOfViews(Integer userId) {
        return CardsApi.super.getUsersHistoryOfViews(userId);
    }

    @Override
    public ResponseEntity<List<CardDTO>> getUsersSavedCards(Integer userId) {
        return CardsApi.super.getUsersSavedCards(userId);
    }

    @Override
    public ResponseEntity<Void> saveById(Integer cardId) {
        return CardsApi.super.saveById(cardId);
    }
}
