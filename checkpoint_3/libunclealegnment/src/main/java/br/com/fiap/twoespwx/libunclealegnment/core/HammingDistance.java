package br.com.fiap.twoespwx.libunclealegnment.core;

import java.util.List;

import org.springframework.stereotype.Component;

import br.com.fiap.twoespwx.libunclealegnment.api.input.DistanceInput;
import br.com.fiap.twoespwx.libunclealegnment.api.input.SequenceInput;

@Component
public class HammingDistance extends BaseDistance {

    private static final String METHOD = "HAMMING_DISTANCE";
    private static final String ABOUT = """
        The Hamming Distance measures the difference between two strings of equal length by counting the number of positions where the corresponding characters differ. It is commonly used in error detection, bioinformatics, cryptography, and machine learning to assess similarity or detect changes. For example, the Hamming Distance between "ACGT" and "ACGG" is 1, as only the last character differs."
    """;

    private static final List<String> REFERENCES = List.of(
        "https://www.sciencedirect.com/topics/computer-science/hamming-distance",
        "https://en.wikipedia.org/wiki/Hamming_distance"
    );

    public HammingDistance() {
        super(HammingDistance.METHOD, HammingDistance.ABOUT, HammingDistance.REFERENCES);
    }

    @Override
    public DistanceResult run(DistanceInput input) {
        List<SequenceInput> sequences = input.getSequences();
        // calcular a similaridade usando o meu DistanceInput
        // preparar os dados de saída dentro do DistanceResult
        // criar um builder para essa classe
        return null;
    }
    
}
