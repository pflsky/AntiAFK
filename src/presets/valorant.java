package presets;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.util.Random;

public class valorant {

    Random random = new Random();

    int randomNumber;
    int randomX;
    int randomY;

    Robot r; {
        try {
            r = new Robot();
        } catch (AWTException e) {
            e.printStackTrace();
        }
    }

    public valorant() {

        changeRandom();
        changeX();
        changeY();

        switch(randomNumber) {
            case 1: r.keyPress(KeyEvent.VK_W);
                r.keyRelease(KeyEvent.VK_W);
                break;
            case 2: r.keyPress(KeyEvent.VK_A);
                r.keyRelease(KeyEvent.VK_A);
                break;
            case 3: r.keyPress(KeyEvent.VK_S);
                r.keyRelease(KeyEvent.VK_S);
                break;
            case 4: r.keyPress(KeyEvent.VK_D);
                r.keyRelease(KeyEvent.VK_D);
                break;
            case 5: r.keyPress(KeyEvent.VK_SPACE);
                r.keyRelease(KeyEvent.VK_SPACE);
                break;
            case 6: r.keyPress(KeyEvent.VK_SHIFT);
                r.keyRelease(KeyEvent.VK_SHIFT);
                break;
            case 7: r.mousePress(KeyEvent.BUTTON1_DOWN_MASK);
                r.mouseRelease(KeyEvent.BUTTON1_DOWN_MASK);
                break;
            case 8: r.mousePress(KeyEvent.BUTTON2_DOWN_MASK);
                r.mouseRelease(KeyEvent.BUTTON2_DOWN_MASK);
                break;
            case 9: r.mouseWheel(randomNumber);
                break;
            case 10: r.mouseMove(randomX,randomY);
                break;
        }
    }

    public void changeRandom() {
        randomNumber = random.nextInt(11);
    }

    public void changeX() {
        randomX = random.nextInt(1000);
    }

    public void changeY() {
        randomY = random.nextInt(500);
    }
}
