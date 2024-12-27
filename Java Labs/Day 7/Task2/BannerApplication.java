package Task2;

import javax.swing.*;
import java.awt.*;
import java.util.Date;

public class BannerApplication extends JFrame implements Runnable {
    Thread th;
    JLabel timeLabel = new JLabel();
    public BannerApplication() {
        this.setTitle("Date & Time Frame Application");
        timeLabel.setText("Hi there");
        this.add(timeLabel, BorderLayout.CENTER);
        th = new Thread(this);
        th.start();

    }
    public void run(){
        while(true){
            if (timeLabel.getLocation().x<getWidth()) {
                timeLabel.setLocation(timeLabel.getLocation().x + 1, timeLabel.getLocation().y);
            }else {
                timeLabel.setLocation(0, timeLabel.getLocation().y);
            }try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }}}
}
