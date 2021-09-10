package org.example.controller;

import org.example.model.MortgageClients;
import org.example.service.MortgageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping(value = "/mortgage")
public class MortgageController {

    private final MortgageService mortgageService;

    @Autowired
    public MortgageController(MortgageService mortgageService) {
        this.mortgageService = mortgageService;
    }

    @GetMapping(value = "/hello")
    public ResponseEntity<String> hello (){
        return new ResponseEntity<String>("hello",HttpStatus.OK);
    }

    @GetMapping(value = "/get-all")
    public ResponseEntity<?> getAll() {
        List<MortgageClients> mortgageClientsList = mortgageService.getAll();
        if (mortgageClientsList.size() != 0) {
           return ResponseEntity.ok().body(mortgageClientsList);
       } else {
            return new ResponseEntity<String>("Заявок нет", HttpStatus.OK);
       }
    }

    @PostMapping(value = "/create")
    public ResponseEntity<?> createMortgageClients(@RequestBody MortgageClients mortgageClients) {
     mortgageService.create(mortgageClients);
        return new ResponseEntity<String>("Заявка создана", HttpStatus.CREATED);
    }
}

