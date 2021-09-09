package org.example.controller;

import org.example.model.MortgageClients;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping(value = "/mortgage")
public class MortgageController {

    @GetMapping(value = "/hello")
    public ResponseEntity<String> hello (){
        return new ResponseEntity<String>("hello",HttpStatus.OK);
    }


//    @GetMapping(value = "/get-all")
//    public ResponseEntity<?> getAll() {
    //    List<MortgageClients> mortgageClientsList = mortgageClientsService.getAll();
    //    if (mortgageClientsList.size() != 0) {
    //       return ResponseEntity.ok().body(mortgageClientsList);
    //   } else {
//            return new ResponseEntity<String>("Заявок нет", HttpStatus.OK);
    //   }

//    }

//    @PostMapping(value = "/create")
//    public ResponseEntity<?> createMortgageClients(@RequestBody MortgageClients mortgageClients) {
    // mortgageClientsService.create(mortgageClients);
//        return new ResponseEntity<String>("Заявка создана", HttpStatus.CREATED);
//    }
}

