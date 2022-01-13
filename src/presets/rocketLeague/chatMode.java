package presets.rocketLeague;

import java.awt.*;

public class chatMode {

    Robot robot; {
        try {
            robot = new Robot();
        } catch (AWTException e) {
            e.printStackTrace();
        }
    }

    public chatMode(int delay, int bind1, int bind2) {

        switch (bind1) {
            case 1: bind1 = 49; break;
            case 2: bind1 = 50; break;
            case 3: bind1 = 51; break;
            case 4: bind1 = 52; break;
        }
        switch (bind2) {
            case 1: bind2 = 49; break;
            case 2: bind2 = 50; break;
            case 3: bind2 = 51; break;
            case 4: bind2 = 52; break;
        }

        repeatPart(delay,bind1, bind2);
    }

    public void repeatPart(int delay, int bind1, int bind2) {
        sayMsg(bind1, bind2);
        robot.delay(delay*1000);
        repeatPart(delay, bind1, bind2);
    }

    public void sayMsg(int bind1, int bind2) {
        robot.keyPress(bind1);
        robot.keyPress(bind2);
        robot.keyRelease(bind1);
        robot.keyRelease(bind2);
    }
}