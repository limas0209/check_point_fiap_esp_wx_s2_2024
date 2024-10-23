package br.com.fiap.twoespwx.libunclealegnment.api.input;

import java.util.List;
import java.util.UUID;

public class DistanceInput {
    
    private UUID tracing_uuid;
    private String format;
    private String method;
    private List<SequenceInput> sequences;

    public DistanceInput(UUID tracing_uuid, String format, 
        String method, List<SequenceInput> sequences) {
        this.tracing_uuid = tracing_uuid;
        this.format = format;
        this.method = method;
        this.sequences = sequences;
    }

    @Override
    public String toString() {
        return "DistanceInput [tracing_uuid=" + tracing_uuid + ", format=" + format + ", method=" + method
                + ", sequences=" + sequences + "]";
    }

    public List<SequenceInput> getSequences() {
        return this.sequences;
    }

    

    
}
