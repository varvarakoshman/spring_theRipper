package screensaver;

import javax.swing.*;
import org.springframework.stereotype.Component;

import java.awt.*;
import java.util.Random;

@Component
public abstract class ColorFrame extends JFrame {
    public ColorFrame(){
        setSize(200,200);
        setVisible(true);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }

    public void showOnRandomPlace(){
        Random random = new Random();
        setLocation(random.nextInt(1200), random.nextInt(700));
        getContentPane().setBackground(getColor()); //new bean every time - bad
        repaint();
    }

    protected abstract Color getColor();
}
