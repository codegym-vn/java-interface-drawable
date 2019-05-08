package com.codegym;

public class Picture {

    private Drawable[] elemenets;

    public Picture() {
        this.elemenets = new Drawable[3];
        this.elemenets[0] = new Rectangle(10, 5);
        this.elemenets[1] = new House();
        this.elemenets[2] = new Rectangle(20, 5);
    }

    public void show() {
        for (int i = 0; i < this.elemenets.length; i++) {
            this.elemenets[i].draw();
            System.out.println();
        }
    }
}
