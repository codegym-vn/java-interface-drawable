package com.codegym;

public class Main {

    public static void main(String[] args) {
	    Picture picture = new Picture();
        picture.add(new Rectangle(10, 5));
        picture.add(new House());
        picture.add(new Rectangle(20, 5));
	    picture.show();
    }
}
