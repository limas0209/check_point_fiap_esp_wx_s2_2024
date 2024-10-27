package main.java.br.com.fiap.twoespx.libunclegerardo;

public class SimpleNucleotideRandomGenerator implements NucleotideoRandomGenerator {

    private final String NUCLEOTIDES = "ACGT";

    @Override
    public String generate(int squenceSize){
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < squenceSize; i++){
            sb.append(NUCLEOTIDES.charAt((int) (Math.random() * NUCLEOTIDES.length())));
        }

        return sb.toString();
    }
    
}
