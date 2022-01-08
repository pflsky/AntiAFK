package presets;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.util.Random;

public class rocketLeague {

    Random random = new Random();
    int randomNumber;

    Robot r; {
        try {
            r = new Robot();
        } catch (AWTException e) {
            e.printStackTrace();
        }
    }

    public rocketLeague() {
        randomNumber = random.nextInt(17);
        switch(randomNumber) {
            case 1: r.keyPress(KeyEvent.VK_W); break;
            case 2: r.keyRelease(KeyEvent.VK_W); break;
            case 3: r.keyPress(KeyEvent.VK_A); break;
            case 4: r.keyRelease(KeyEvent.VK_A); break;
            case 5: r.keyPress(KeyEvent.VK_S); break;
            case 6: r.keyRelease(KeyEvent.VK_S); break;
            case 7: r.keyPress(KeyEvent.VK_D); break;
            case 8: r.keyRelease(KeyEvent.VK_D); break;
            case 9: r.keyPress(KeyEvent.VK_SPACE); break;
            case 10: r.keyRelease(KeyEvent.VK_SPACE); break;
            case 11: r.keyPress(KeyEvent.VK_SHIFT); break;
            case 12: r.keyRelease(KeyEvent.VK_SHIFT); break;
            case 13: r.mousePress(KeyEvent.BUTTON1_DOWN_MASK); break;
            case 14: r.mouseRelease(KeyEvent.BUTTON1_DOWN_MASK); break;
            case 15: r.mousePress(KeyEvent.BUTTON2_DOWN_MASK); break;
            case 16: r.mouseRelease(KeyEvent.BUTTON2_DOWN_MASK); break;
        }
        r.delay(1000);
        new rocketLeague();
    }
}
