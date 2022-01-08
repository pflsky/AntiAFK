package presets;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.security.Key;
import java.util.Random;
import java.util.Scanner;

public class minecraft {

    Scanner scanner = new Scanner(System.in);

    public Robot r; {
        try {
            r = new Robot();
        } catch (AWTException e) {
            e.printStackTrace();
        }
    }

    public minecraft() {

        System.out.println("minecraft preset loaded 100%\n\n");
        System.out.println("what level of security is the anti-afk plugin? (high, medium, low)");
        String security = scanner.nextLine();

        switch(security) {
            case "high": r.delay(5000);
                System.out.println("bot starting in 5 seconds"); new high();
            break;
            case "medum": new medium();
            break;
            case "low": new low();
            break;
            default: System.out.println("that is not a level of security, try again");
            new minecraft();
        }
    }

    public class high {

        Random random = new Random();

        int randomNumber;
        int randomX;
        int randomY;

        public high() {

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
                case 5: r.keyPress(KeyEvent.VK_E);
                    r.keyRelease(KeyEvent.VK_E);
                    r.keyPress(KeyEvent.VK_ESCAPE);
                    r.keyRelease(KeyEvent.VK_ESCAPE);
                    break;
                case 6: r.keyPress(KeyEvent.VK_SPACE);
                    r.keyRelease(KeyEvent.VK_SPACE);
                    break;
                case 7: r.keyPress(KeyEvent.VK_SHIFT);
                    r.keyRelease(KeyEvent.VK_SHIFT);
                    break;
                case 8: r.mousePress(KeyEvent.BUTTON1_DOWN_MASK);
                    r.mouseRelease(KeyEvent.BUTTON1_DOWN_MASK);
                    break;
                case 9: r.mousePress(KeyEvent.BUTTON2_DOWN_MASK);
                    r.mouseRelease(KeyEvent.BUTTON2_DOWN_MASK);
                    break;
                case 10: r.mouseWheel(5);
                    break;
                case 11: r.mouseMove(randomX,randomY);
                    break;
            }
            r.delay(1000);
            new high();
        }

        public void changeRandom() {
            randomNumber = random.nextInt(12);
        }

        public void changeX() {
            randomX = random.nextInt(1000);
        }

        public void changeY() {
            randomY = random.nextInt(500);
        }
    }

    public class medium {

        Random random = new Random();
        int randomNumber;

        public medium() {

            changeRandom();

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
            }
            r.delay(1000);
            new medium();
        }

        public void changeRandom() {
            randomNumber = random.nextInt(8);
        }
    }

    public class low {

        Random random = new Random();
        int randomNumber;

        public low() {

            changeRandom();

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
            }
            r.delay(1000);
            new low();
        }

        public void changeRandom() {
            randomNumber = random.nextInt(5);
        }
    }
}