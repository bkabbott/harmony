package com.brianabbott.music.harmony;

public class Triad {
    private String root;
    private String third;
    private String fifth;
    private TriadQuality quality;

    public Triad() {
        this("C", TriadQuality.MAJOR);
    }

    public Triad(String root, TriadQuality quality) {
        setRoot(root);
        setTriadQuality(quality);
    }

    public void setRoot(String root) {
        this.root = root;
    }

    public void setTriadQuality(TriadQuality quality) {
        this.quality = quality;
    }

    public

}