package Task2;

import java.util.List;

public class Test {
    public void drawPics(List<? extends Shape> lists) {
        for (Shape s : lists) {
            s.draw();
        }
    }

}
