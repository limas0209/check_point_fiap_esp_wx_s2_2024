package br.com.fiap.twoespwx.libunclealegnment.factory;

import org.springframework.stereotype.Component;

import br.com.fiap.twoespwx.libunclealegnment.core.DistanceCalculator;
import br.com.fiap.twoespwx.libunclealegnment.core.HammingDistance;

@Component
public class DistanceCalculatorFactory {

    public DistanceCalculator getInstance(String method) {
        switch (method) {
            case "DEFAULT" -> {
                return new HammingDistance();
            }
            case "HAMMING_DISTANCE" -> {
                return new HammingDistance();
            }
            default -> throw new IllegalArgumentException("Undefined method for distance calculation!\nMethod: " + method);
        }
    }
    
}
