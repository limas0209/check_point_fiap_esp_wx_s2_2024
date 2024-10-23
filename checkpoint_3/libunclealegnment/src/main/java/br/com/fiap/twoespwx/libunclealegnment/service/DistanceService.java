package br.com.fiap.twoespwx.libunclealegnment.service;

import org.springframework.stereotype.Service;

import br.com.fiap.twoespwx.libunclealegnment.api.input.DistanceInput;

@Service
public class DistanceService {
    
    public Double calculate(DistanceInput input) {
        System.out.println(input);
        return 123.456;
    }
}
