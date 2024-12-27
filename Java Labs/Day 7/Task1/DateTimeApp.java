package Task1;

import javax.swing.*;
import java.awt.*;
import java.util.Date;

public class DateTimeApp extends JFrame implements Runnable{
    Thread th;
    Date d = new Date();
    JLabel timeLabel = new JLabel();
    public DateTimeApp() {
        this.setTitle("Date & Time Frame Application");
        timeLabel.setHorizontalAlignment(JLabel.CENTER);
        timeLabel.setText(d.toString());
        this.add(timeLabel, BorderLayout.CENTER);
        th = new Thread(this);
        th.start();

    }
    public void run(){
        while(true){
            d= new Date();
            timeLabel.setText(d.toString());
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}