package br.com.fiap.twoespwx.libunclealegnment.service;

import org.springframework.stereotype.Service;

import br.com.fiap.twoespwx.libunclealegnment.api.input.DistanceInput;
import br.com.fiap.twoespwx.libunclealegnment.core.DistanceCalculator;
import br.com.fiap.twoespwx.libunclealegnment.core.DistanceResult;
import br.com.fiap.twoespwx.libunclealegnment.factory.DistanceCalculatorFactory;

@Service
public class DistanceService {

    private final DistanceCalculatorFactory distanceFactory;

    public DistanceService(DistanceCalculatorFactory distanceFactory) {
        this.distanceFactory = distanceFactory;
    }
    
    public DistanceResult calculate(DistanceInput input) {
        String method = input.getMethod();

        DistanceCalculator calculator = distanceFactory.getInstance(method);
        DistanceResult result = calculator.run(input);
        System.out.println(input);
        System.out.println(result);
        return result;
    }
}
