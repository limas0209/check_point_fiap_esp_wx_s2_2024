package br.com.fiap.twoespwx.libunclealegnment.core;

import java.util.List;

public class DistanceResult {
    
    private Double distance_score; // "distance_score": 1.00,
    private Double similarity_score; // "similarity_score": 0.9375,
    private List<String> observations; // "observations" : [],
    private Long length; // "length": 16,
    private String format; // "format": "plain_text",
    private Double processing_time; // "processing_time": "0.005s"
    //private String created_at; // "created_at": "2024-10-15T19:30:59.823381 (GMT-03:00)"
    //private String status; // "status": "PROCESSED"

    public DistanceResult(Double distance_score, Double similarity_score, List<String> observations, Long length,
            String format, Double processing_time) {
        this.distance_score = distance_score;
        this.similarity_score = similarity_score;
        this.observations = observations;
        this.length = length;
        this.format = format;
        this.processing_time = processing_time;
    }

    
}
