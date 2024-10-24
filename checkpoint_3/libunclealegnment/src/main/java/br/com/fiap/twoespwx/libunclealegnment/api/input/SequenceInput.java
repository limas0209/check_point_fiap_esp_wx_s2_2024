package br.com.fiap.twoespwx.libunclealegnment.api.input;

import java.util.UUID;

public class SequenceInput {
    private UUID sequence_uuid;
    private String sequence;

    public SequenceInput(UUID sequence_uuid, String sequence) {
        this.sequence_uuid = sequence_uuid;
        this.sequence = sequence;
    }

    @Override
    public String toString() {
        return "SequenceInput [sequence_uuid=" + sequence_uuid + ", sequence=" + sequence + "]";
    }

    public String getSequence() {
        return sequence;
    }

    
}
