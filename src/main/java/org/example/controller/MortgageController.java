package org.example.controller;


import org.example.model.MortgageClients;
import org.example.service.MortgageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;

import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@Controller
@RequestMapping(value = "/mortgage")
public class MortgageController {

    private final MortgageService mortgageService;

    @Autowired
    public MortgageController(MortgageService mortgageService) {
        this.mortgageService = mortgageService;
    }

    @GetMapping(value = "/get-all", produces = "text/plain;charset=UTF-8")
    public ResponseEntity<?> getAll() {
        List<MortgageClients> mortgageClientsList = mortgageService.getAll();
        if (mortgageClientsList.size() != 0) {
            return ResponseEntity.ok().contentType(MediaType.APPLICATION_JSON).body(mortgageClientsList);
        } else {
            return new ResponseEntity<>("Заявок нет", HttpStatus.OK);
        }
    }

    @PostMapping(value = "/create", consumes = MediaType.APPLICATION_JSON_VALUE, produces = "text/plain;charset=UTF-8")
    public ResponseEntity<?> createMortgageClients(@Valid @RequestBody MortgageClients mortgageClients, BindingResult result) {
        if (result.hasErrors()) {
            return new ResponseEntity<>("Неверно введены данные", HttpStatus.BAD_REQUEST);
        }
        mortgageService.create(mortgageClients);
        return new ResponseEntity<>("Заявка создана", HttpStatus.CREATED);
    }
}

