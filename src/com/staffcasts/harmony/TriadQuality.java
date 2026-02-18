package com.staffcasts.harmony;

public enum TriadQuality {
    MAJOR,
    MINOR,
    AUGMENTED,
    DIMINISHED;

    @Override
    public String toString() {
        return switch (this) {
            case MAJOR -> "Major";
            case MINOR -> "Minor";
            case AUGMENTED -> "Augmented";
            case DIMINISHED -> "Diminished";
        };
    }
}


