package presets;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.util.Random;
import java.util.Scanner;

public class rocketLeague {

    Scanner scanner = new Scanner(System.in);

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
        System.out.println("Chat mode or mad mode? (c/m)");
        String decision = scanner.nextLine();
        if (decision.equals("c")) {
            new chatMode();
        } else if (decision.equals("m")) {
            new madMode();
        } else {
            System.out.println("that is not a mode, try again");
        }
    }

    public class chatMode {

        public chatMode() {
            sayMsg();
            r.delay(10000);
            new chatMode();
        }

        public void sayMsg() {
            r.keyPress(KeyEvent.VK_1);
            r.keyRelease(KeyEvent.VK_1);
            r.keyPress(KeyEvent.VK_1);
            r.keyRelease(KeyEvent.VK_1);
        }
    }

    public class madMode {

        public madMode() {
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

    public class bot {

        public bot() {

        }
    }
}
