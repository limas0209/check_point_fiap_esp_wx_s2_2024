package br.com.fiap.twoespwx.libunclealegnment.service;

import org.springframework.stereotype.Service;

import br.com.fiap.twoespwx.libunclealegnment.api.input.DistanceInput;
import br.com.fiap.twoespwx.libunclealegnment.core.DistanceCalculator;
import br.com.fiap.twoespwx.libunclealegnment.core.DistanceResult;
import br.com.fiap.twoespwx.libunclealegnment.factory.DistanceCalculatorFactory;
import br.com.fiap.twoespwx.libunclealegnment.util.ExperimentTimer;

@Service
public class DistanceService {

    private final DistanceCalculatorFactory distanceFactory;
    private ExperimentTimer timer;
    
        public DistanceService(DistanceCalculatorFactory distanceFactory) {
            this.distanceFactory = distanceFactory;
            this.timer = new ExperimentTimer();
    }
    
    public DistanceResult calculate(DistanceInput input) {
        timer.start(); //t0;
        String method = input.getMethod();

        DistanceCalculator calculator = distanceFactory.getInstance(method);
        DistanceResult result = calculator.run(input);
        //System.out.println(input);
        //System.out.println(result);

        timer.stop(); // t1
        result.setProcessingTimeMs(timer.getTime()); // delta(t) = t1 - t0
        return result;
    }
}
