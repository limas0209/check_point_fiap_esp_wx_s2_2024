package br.com.fiap.twoespwx.libunclealegnment.core;

import java.util.List;

public abstract class BaseDistance implements DistanceCalculator {
    
    private String method;
    private String about;
    private List<String> references;

    public BaseDistance(String method, String about, List<String> references) {
        this.method = method;
        this.about = about;
        this.references = references;
    }

    public String getMethod() {
        return method;
    }

    public String getAbout() {
        return about;
    }

    public List<String> getReferences() {
        return references;
    }

}

// "distance_score": 1.00,
// "similarity_score": 0.9375,
// "observations" : [],
// "length": 16,
// "format": "plain_text",
// "processing_time": "0.005s"
// "created_at": "2024-10-15T19:30:59.823381 (GMT-03:00)"
// "status": "PROCESSED"
