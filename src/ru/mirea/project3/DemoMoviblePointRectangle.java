package ru.mirea.project3;

public class DemoMoviblePointRectangle {
    public static void main(String[] args) {
        MoviblePointRectangle c1 = new MoviblePointRectangle(-6,4,6,-4,6,6);
        System.out.println(c1);
        c1.moveUp();
        System.out.println(c1);
    }

}
