package presets;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.security.Key;
import java.util.Random;
import java.util.Scanner;

public class rocketLeague {

    Scanner scanner = new Scanner(System.in);

    Robot r;

    {
        try {
            r = new Robot();
        } catch (AWTException e) {
            e.printStackTrace();
        }
    }

    public rocketLeague() {

        System.out.println("do you want to look like a bot? (y/n)");
        String decision = scanner.nextLine();

        if (decision.equals("y")) {
            new bot();
        } else if (decision.equals("n")) {
            new notBot();
        } else {
            new rocketLeague();
        }
    }

    public class notBot {

        Random random = new Random();
        int randomNumber;

        public notBot() {

            changeRandom();

            switch(randomNumber) {
                case 1:
                    r.keyPress(KeyEvent.VK_W);
                    break;
                case 2:
                    r.keyRelease(KeyEvent.VK_W);
                    break;
                case 3:
                    r.keyPress(KeyEvent.VK_A);
                    break;
                case 4:
                    r.keyRelease(KeyEvent.VK_A);
                    break;
                case 5:
                    r.keyPress(KeyEvent.VK_S);
                    break;
                case 6:
                    r.keyRelease(KeyEvent.VK_S);
                    break;
                case 7:
                    r.keyPress(KeyEvent.VK_D);
                    break;
                case 8:
                    r.keyRelease(KeyEvent.VK_D);
                    break;
                case 9:
                    r.keyPress(KeyEvent.VK_SPACE);
                    break;
                case 10:
                    r.keyRelease(KeyEvent.VK_SPACE);
                    break;
                case 11:
                    r.keyPress(KeyEvent.VK_SHIFT);
                    break;
                case 12:
                    r.keyRelease(KeyEvent.VK_SHIFT);
                    break;
                case 13:
                    r.mousePress(KeyEvent.BUTTON1_DOWN_MASK);
                    break;
                case 14:
                    r.mouseRelease(KeyEvent.BUTTON1_DOWN_MASK);
                    break;
                case 15:
                    r.mousePress(KeyEvent.BUTTON2_DOWN_MASK);
                    break;
                case 16:
                    r.mouseRelease(KeyEvent.BUTTON2_DOWN_MASK);
                    break;
            }
            r.delay(1000);
            new rocketLeague();
        }

        public void changeRandom() {
            randomNumber = random.nextInt(17);
        }
    }

    public class bot {

        Random random = new Random();
        int time = random.nextInt(6000);
        int randomNumber;

        public bot() {
            changeRandom();
            switch(randomNumber) {
                case 1: driveForward(time); break;
                case 2: reverse(time); break;
                case 3: driveLeft(time); break;
                case 4: driveRight(time); break;
                case 5: reverseLeft(time); break;
                case 6: reverseRight(time); break;
                case 7: doubleJump(); break;
                case 8: jump(); break;
                case 9: frontflip(); break;
                case 10: backflip(); break;
                case 11: leftFlip(); break;
                case 12: rightFlip(); break;
                case 13: diagLeft(); break;
                case 14: diagRight(); break;
                case 15: aerial(time); break;
            }
        }

        public void changeRandom() {
            randomNumber = random.nextInt(16);
        }

        public void driveForward(int time) {
            r.keyPress(KeyEvent.VK_W);
            r.delay(time);
            r.keyRelease(KeyEvent.VK_W);
            new bot();
        }

        public void driveLeft(int time) {
            r.keyPress(KeyEvent.VK_W);
            r.keyPress(KeyEvent.VK_A);
            r.delay(time);
            r.keyRelease(KeyEvent.VK_W);
            r.keyRelease(KeyEvent.VK_A);
            new bot();
        }

        public void driveRight(int time) {
            r.keyPress(KeyEvent.VK_W);
            r.keyPress(KeyEvent.VK_D);
            r.delay(time);
            r.keyRelease(KeyEvent.VK_W);
            r.keyRelease(KeyEvent.VK_D);
            new bot();
        }

        public void reverse(int time) {
            r.keyPress(KeyEvent.VK_S);
            r.delay(time);
            r.keyRelease(KeyEvent.VK_S);
            new bot();
        }

        public void reverseLeft(int time) {
            r.keyPress(KeyEvent.VK_S);
            r.keyPress(KeyEvent.VK_A);
            r.delay(time);
            r.keyRelease(KeyEvent.VK_S);
            r.keyRelease(KeyEvent.VK_A);
            new bot();
        }

        public void reverseRight(int time) {
            r.keyPress(KeyEvent.VK_S);
            r.keyPress(KeyEvent.VK_D);
            r.delay(time);
            r.keyRelease(KeyEvent.VK_S);
            r.keyRelease(KeyEvent.VK_D);
            new bot();
        }

        public void doubleJump() {
            r.mousePress(KeyEvent.BUTTON2_DOWN_MASK);
            r.delay(500);
            r.mouseRelease(KeyEvent.BUTTON2_DOWN_MASK);
            r.mousePress(KeyEvent.BUTTON2_DOWN_MASK);
            r.delay(500);
            r.mouseRelease(KeyEvent.BUTTON2_DOWN_MASK);
            new bot();
        }

        public void jump() {
            r.mousePress(KeyEvent.BUTTON2_DOWN_MASK);
            r.delay(500);
            r.mouseRelease(KeyEvent.BUTTON2_DOWN_MASK);
            new bot();
        }

        public void frontflip() {
            r.keyPress(KeyEvent.VK_W);
            r.mousePress(KeyEvent.BUTTON2_DOWN_MASK);
            r.delay(500);
            r.mouseRelease(KeyEvent.BUTTON2_DOWN_MASK);
            r.mousePress(KeyEvent.BUTTON2_DOWN_MASK);
            r.delay(500);
            r.keyRelease(KeyEvent.VK_W);
            r.mouseRelease(KeyEvent.BUTTON2_DOWN_MASK);
            new bot();
        }

        public void backflip() {
            r.keyPress(KeyEvent.VK_S);
            r.mousePress(KeyEvent.BUTTON2_DOWN_MASK);
            r.delay(500);
            r.mouseRelease(KeyEvent.BUTTON2_DOWN_MASK);
            r.mousePress(KeyEvent.BUTTON2_DOWN_MASK);
            r.delay(500);
            r.keyRelease(KeyEvent.VK_S);
            r.mouseRelease(KeyEvent.BUTTON2_DOWN_MASK);
            new bot();
        }

        public void leftFlip() {
            r.keyPress(KeyEvent.VK_D);
            r.mousePress(KeyEvent.BUTTON2_DOWN_MASK);
            r.delay(500);
            r.mouseRelease(KeyEvent.BUTTON2_DOWN_MASK);
            r.mousePress(KeyEvent.BUTTON2_DOWN_MASK);
            r.delay(500);
            r.keyRelease(KeyEvent.VK_D);
            r.mouseRelease(KeyEvent.BUTTON2_DOWN_MASK);
            new bot();
        }

        public void rightFlip() {
            r.keyPress(KeyEvent.VK_A);
            r.mousePress(KeyEvent.BUTTON2_DOWN_MASK);
            r.delay(500);
            r.mouseRelease(KeyEvent.BUTTON2_DOWN_MASK);
            r.mousePress(KeyEvent.BUTTON2_DOWN_MASK);
            r.delay(500);
            r.keyRelease(KeyEvent.VK_A);
            r.mouseRelease(KeyEvent.BUTTON2_DOWN_MASK);
            new bot();
        }

        public void diagLeft() {
            r.keyPress(KeyEvent.VK_W);
            r.keyPress(KeyEvent.VK_A);
            r.mousePress(KeyEvent.BUTTON2_DOWN_MASK);
            r.delay(500);
            r.mouseRelease(KeyEvent.BUTTON2_DOWN_MASK);
            r.mousePress(KeyEvent.BUTTON2_DOWN_MASK);
            r.delay(500);
            r.keyRelease(KeyEvent.VK_W);
            r.keyRelease(KeyEvent.VK_A);
            r.mouseRelease(KeyEvent.BUTTON2_DOWN_MASK);
            new bot();
        }

        public void diagRight() {
            r.keyPress(KeyEvent.VK_W);
            r.keyPress(KeyEvent.VK_D);
            r.mousePress(KeyEvent.BUTTON2_DOWN_MASK);
            r.delay(500);
            r.mouseRelease(KeyEvent.BUTTON2_DOWN_MASK);
            r.mousePress(KeyEvent.BUTTON2_DOWN_MASK);
            r.delay(500);
            r.keyRelease(KeyEvent.VK_W);
            r.keyRelease(KeyEvent.VK_D);
            r.mouseRelease(KeyEvent.BUTTON2_DOWN_MASK);
            new bot();
        }

        public void aerial(int time) {
            r.keyPress(KeyEvent.VK_S);
            r.keyPress(KeyEvent.BUTTON2_DOWN_MASK);
            r.delay(500);
            r.mousePress(KeyEvent.BUTTON1_DOWN_MASK);
            r.delay(time);
            r.keyRelease(KeyEvent.VK_S);
            r.keyRelease(KeyEvent.BUTTON2_DOWN_MASK);
            r.mouseRelease(KeyEvent.BUTTON1_DOWN_MASK);
        }
    }
}