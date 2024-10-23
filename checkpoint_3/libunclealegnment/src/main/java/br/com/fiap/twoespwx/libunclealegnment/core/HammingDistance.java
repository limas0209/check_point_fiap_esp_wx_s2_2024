package br.com.fiap.twoespwx.libunclealegnment.core;

import java.util.List;

import br.com.fiap.twoespwx.libunclealegnment.api.input.DistanceInput;
import br.com.fiap.twoespwx.libunclealegnment.api.input.SequenceInput;
public class HammingDistance implements DistanceCalculator {

    @Override
    public DistanceResult run(DistanceInput input) {
        List<SequenceInput> sequences = input.getSequences();
        // calcular a similaridade usando o meu DistanceInput
        // preparar os dados de saída dentro do DistanceResult
        return null;
    }
    
}
