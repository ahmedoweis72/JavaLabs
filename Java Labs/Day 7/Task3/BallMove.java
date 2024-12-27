import javax.swing.*;

class BallMove extends JFrame implements Runnable {
    private Thread th;
    private ImageIcon imgIcon = new ImageIcon("ball.png");
    private JLabel imgLabel;

    public BallMove() {
        this.setTitle("Ball-Move");
        imgLabel = new JLabel(imgIcon); // Use the ImageIcon directly
        imgLabel.setSize(imgIcon.getIconWidth(), imgIcon.getIconHeight());
        this.setLayout(null);
        this.add(imgLabel);
        th = new Thread(this);
        th.start();
        this.setBounds(0, 0, 600, 400);
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new BallMove()); // Ensure GUI is created on EDT
    }

    @Override
    public void run() {
        int w = this.getWidth();
        int h = this.getHeight();
        int currentx = 0;
        int currenty = 0;
        boolean increaseX = true;
        boolean increaseY = true;

        imgLabel.setBounds(currentx, currenty, imgIcon.getIconWidth(), imgIcon.getIconHeight());

        while (true) {
            // Update position
            if (increaseX) {
                currentx += 10;
            } else {
                currentx -= 10;
            }

            if (increaseY) {
                currenty += 10;
            } else {
                currenty -= 10;
            }

            // Check boundaries
            if (currentx >= w - imgIcon.getIconWidth()) {
                currentx = w - imgIcon.getIconWidth();
                increaseX = false;
            } else if (currentx <= 0) {
                currentx = 0;
                increaseX = true;
            }

            if (currenty >= h - imgIcon.getIconHeight()) {
                currenty = h - imgIcon.getIconHeight();
                increaseY = false;
            } else if (currenty <= 0) {
                currenty = 0;
                increaseY = true;
            }

            // Update the label's position
            imgLabel.setBounds(currentx, currenty, imgIcon.getIconWidth(), imgIcon.getIconHeight());

            // Sleep for a short duration
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}