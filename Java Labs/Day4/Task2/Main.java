package Task2;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Rectangle> rectangles=new ArrayList<>();
        Rectangle r=new Rectangle();
        rectangles.add(r);

        ArrayList<Circle> circles=new ArrayList<>();
        Circle c=new Circle();
        circles.add(c);
        Test t=new Test();
        t.drawPics(circles);
        t.drawPics(rectangles);
    }
    }

