package com.codegym;

public class Picture {

    private Drawable[] elements;
    public static final int MAX_COUNT = 100;
    private int count = 0;

    public Picture() {
        this.elements = new Drawable[MAX_COUNT];
    }

    public void add(Drawable element) {
        if(count < MAX_COUNT) {
            this.elements[count] = element;
            this.count++;
        }
    }

    public void show() {
        for (int i = 0; i < this.count; i++) {
            this.elements[i].draw();
            System.out.println();
        }
    }
}
