package com.example;

public enum CarOptions {
    GPS, TunerFMDAB, ToitOuvrant;

    public String getLabel() {
        switch (this) {
            case GPS:
                return "GPS";
            case TunerFMDAB:
                return "Tuner FM/DAB";
            case ToitOuvrant:
                return "Toit ouvrant";
            default:
                return "" + this;
        }
    }
}