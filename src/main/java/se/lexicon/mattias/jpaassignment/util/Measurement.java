package se.lexicon.mattias.jpaassignment.util;

public enum Measurement {

    DL(100),
    ML(1),
    CL(10),
    KG(1000),
    HG(100),
    G(1),
    TSP(5),
    TBSP(15);

    private int value;

    Measurement(int value) {
        this.value = value;
    }

    public int meas(){
        return value;
    }


}
