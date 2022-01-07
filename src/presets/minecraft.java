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
            case "high": new high();
            break;
            case "medium": new medium();
            break;
            case "low": new low();
            break;
            default: System.out.println("that is not a level of security, try again");
            new minecraft();
        }
    }

    public class high {

        Random random = new Random();
        int randomNumber = random.nextInt(8);

        public high() {
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
            }
        }

        public void changeRandom() {
            randomNumber = random.nextInt(8);
        }


    }




}
