package org.example.service;

import org.example.model.MortgageClients;
import org.example.repository.MortgageRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MortgageService {

    private final MortgageRepository mortgageRepository;

//    @Autowired
    public MortgageService(MortgageRepository mortgageRepository) {
        this.mortgageRepository = mortgageRepository;
    }

    public List<MortgageClients> getAll() {
        return mortgageRepository.findAll();
    }

    public void create(MortgageClients mortgageClients) {
        mortgageRepository.save(mortgageClients);
    }


}
