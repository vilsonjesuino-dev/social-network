package com.example.socialnetwork.enums;

public enum Question {

    QUESTION_01("What's your favourite food?"),
    QUESTION_02("What's the name your pet?"),
    QUESTION_03("What's your favourite sport?");

    private String label;

    Question(String label) {
        this.label = label;
    }

    public String getLabel() {
        return label;
    }
}
