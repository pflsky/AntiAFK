import presets.rocketLeague.chatMode;

import javax.swing.*;
import java.awt.*;
import java.awt.event.WindowEvent;
import java.io.IOException;
import java.util.Scanner;

public class bot {

    Scanner scanner = new Scanner(System.in);

    Font titleFont = new Font("Consolas",Font.PLAIN,32);
    Font buttonFont = new Font("Consolas",Font.PLAIN,22);

    Container mainMenu = new Container();

    Container rocketLeagueModesMenu = new Container();
    Container rocketLeagueChatModeMenu = new Container();
    Container rocketLeagueBotModeMenu = new Container();

    Container minecraftModesMenu = new Container();

    Container valorantModesMenu = new Container();

    JFrame f = new JFrame("AntiAFK bot 1.2");

    JLabel lWelcome = new JLabel("Welcome! Select game and keep console window open!");
    JLabel lModeGuide = new JLabel("Select mode...");
    JLabel lValuesAreChangedInTheConsoleWindow = new JLabel("Values are changed in the console window.");

    JLabel lRocketLeagueChatModeChangeDelay = new JLabel("Change delay between messages:");
    JLabel lRocketLeagueChatModeChangeBinds = new JLabel("Change quick chat binds: (For example: 1,1 = \"I got it\")");

    JButton bRocketLeague = new JButton("Rocket League");
    JButton bMinecraft = new JButton("Minecraft");
    JButton bValorant = new JButton("Valorant");

    JButton bBack1 = new JButton("Back");
    JButton bBack2 = new JButton("Back");
    JButton bBack3 = new JButton("Back");
    JButton bBack4 = new JButton("Back");

    JButton bChatMode = new JButton("Chat mode");
    JButton bBotMode = new JButton("Bot mode");

    JButton bRocketLeagueChatModeChangeDelay = new JButton("Change delay");
    JButton bRocketLeagueChatModeChangeBind1 = new JButton("Change bind 1");
    JButton bRocketLeagueChatModeChangeBind2 = new JButton("Change bind 2");

    JButton bRocketLeagueChatModeGo = new JButton("Start bot!");
    JButton bRocketLeagueChatModeStop = new JButton("Stop bot!");

    public bot() {

        f.setLayout(null);
        f.setSize(1020, 640);
        f.setVisible(true);
        f.setResizable(false);

        new mainMenu();

    }

    public class mainMenu {

        public mainMenu() {

            f.setContentPane(mainMenu);
            f.repaint();

            f.add(bRocketLeague); f.add(bMinecraft); f.add(bValorant);
            f.add(lWelcome);

            bRocketLeague.setBounds(20,100,300,50);
            bRocketLeague.setFont(buttonFont);
            bRocketLeague.setBackground(Color.lightGray);
            bRocketLeague.setFocusable(false);
            bRocketLeague.addActionListener(e -> {
                if (e.getSource()==bRocketLeague) {
                    new rocketLeagueModes();
                }
            });

            bMinecraft.setBounds(340,100,300,50);
            bMinecraft.setFont(buttonFont);
            bMinecraft.setBackground(Color.lightGray);
            bMinecraft.setFocusable(false);
            bMinecraft.addActionListener(e -> {
                if (e.getSource()==bMinecraft) {
                    new minecraftModes();
                }
            });

            bValorant.setBounds(660,100,300,50);
            bValorant.setFont(buttonFont);
            bValorant.setBackground(Color.lightGray);
            bValorant.setFocusable(false);
            bValorant.addActionListener(e -> {
                if (e.getSource()==bValorant) {
                    new valorantModes();
                }
            });

            lWelcome.setBounds(20,20,1020,50);
            lWelcome.setFont(titleFont);
            lWelcome.setForeground(Color.gray);

        }
    }

    public class rocketLeagueModes {

        public rocketLeagueModes() {

            f.setContentPane(rocketLeagueModesMenu);
            f.repaint();

            f.add(bBack1); f.add(bChatMode); f.add(bBotMode);
            f.add(lModeGuide);

            bBack1.setBounds(20,20,200,50);
            bBack1.setFont(buttonFont);
            bBack1.setBackground(Color.lightGray);
            bBack1.setFocusable(false);
            bBack1.addActionListener(e -> {
                if (e.getSource()==bBack1) {
                    new mainMenu();
                }
            });

            bChatMode.setBounds(20,100,450,50);
            bChatMode.setFont(buttonFont);
            bChatMode.setBackground(Color.lightGray);;
            bChatMode.setFocusable(false);
            bChatMode.addActionListener(e -> {
                if (e.getSource()==bChatMode) {
                    new rocketLeagueChatMode();
                }
            });

            bBotMode.setBounds(490,100,450,50);
            bBotMode.setFont(buttonFont);
            bBotMode.setBackground(Color.lightGray);
            bBotMode.setFocusable(false);
            bBotMode.addActionListener(e -> {
                if (e.getSource()==bBotMode) {
                    new rocketLeagueBotMode();
                }
            });

            lModeGuide.setBounds(260,20,1020,50);
            lModeGuide.setFont(titleFont);
            lModeGuide.setForeground(Color.gray);

        }
    }

    public class rocketLeagueChatMode {

        int delay = 10;
        int bind1 = 1;
        int bind2 = 1;

        public rocketLeagueChatMode() {

            f.setContentPane(rocketLeagueChatModeMenu);
            f.repaint();

            f.add(bBack2);

            f.add(bRocketLeagueChatModeChangeDelay);
            f.add(bRocketLeagueChatModeChangeBind1); f.add(bRocketLeagueChatModeChangeBind2);

            f.add(bRocketLeagueChatModeGo); f.add(bRocketLeagueChatModeStop);

            f.add(lValuesAreChangedInTheConsoleWindow);

            f.add(lRocketLeagueChatModeChangeDelay);
            f.add(lRocketLeagueChatModeChangeBinds);

            bBack2.setBounds(20,20,200,50);
            bBack2.setFont(buttonFont);
            bBack2.setBackground(Color.lightGray);
            bBack2.setFocusable(false);
            bBack2.addActionListener(e -> {
                if (e.getSource()==bBack2) {
                    new rocketLeagueModes();
                }
            });

            lRocketLeagueChatModeChangeDelay.setBounds(20,90,1020,50);
            lRocketLeagueChatModeChangeDelay.setFont(buttonFont);
            lRocketLeagueChatModeChangeDelay.setForeground(Color.gray);

            bRocketLeagueChatModeChangeDelay.setBounds(20,150,200,50);
            bRocketLeagueChatModeChangeDelay.setFont(buttonFont);
            bRocketLeagueChatModeChangeDelay.setBackground(Color.lightGray);
            bRocketLeagueChatModeChangeDelay.setFocusable(false);
            bRocketLeagueChatModeChangeDelay.addActionListener(e -> {
                if (e.getSource()==bRocketLeagueChatModeChangeDelay) {
                    System.out.println("What would you like the delay between messages to be? (Seconds)");
                    try {
                        delay = scanner.nextInt();
                        System.out.println("Delay has been set to " + delay);
                    } catch (Exception exception) {
                        System.out.println("That is not an integer, try again.");
                    } finally {
                        scanner.nextLine();
                    }
                }
            });

            lRocketLeagueChatModeChangeBinds.setBounds(20,220,1020,50);
            lRocketLeagueChatModeChangeBinds.setFont(buttonFont);
            lRocketLeagueChatModeChangeBinds.setForeground(Color.gray);

            bRocketLeagueChatModeChangeBind1.setBounds(20,270,200,50);
            bRocketLeagueChatModeChangeBind1.setFont(buttonFont);
            bRocketLeagueChatModeChangeBind1.setBackground(Color.lightGray);
            bRocketLeagueChatModeChangeBind1.setFocusable(false);
            bRocketLeagueChatModeChangeBind1.addActionListener(e -> {
                if (e.getSource()==bRocketLeagueChatModeChangeBind1) {
                    System.out.println("What would you like the first bind to be? (1-4)");
                    try {
                        bind1 = scanner.nextInt();
                        if (bind1 > 4) {
                            throw new ArithmeticException();
                        }
                        System.out.println("Bind 1 has been set to " + bind1);
                    } catch (Exception exception) {
                        System.out.println("Input is either not an integer or above 4.");
                    } finally {
                        scanner.nextLine();
                    }
                }
            });

            bRocketLeagueChatModeChangeBind2.setBounds(240,270,200,50);
            bRocketLeagueChatModeChangeBind2.setFont(buttonFont);
            bRocketLeagueChatModeChangeBind2.setBackground(Color.lightGray);
            bRocketLeagueChatModeChangeBind2.setFocusable(false);
            bRocketLeagueChatModeChangeBind2.addActionListener(e -> {
                if (e.getSource()==bRocketLeagueChatModeChangeBind2) {
                    System.out.println("What would you like the second bind to be? (1-4)");
                    try {
                        bind2 = scanner.nextInt();
                        if (bind2 > 4) {
                            throw new ArithmeticException();
                        }
                        System.out.println("Bind 2 has been set to " + bind2);
                    } catch (Exception exception) {
                        System.out.println("Input is either not an integer or above 4.");
                    } finally {
                        scanner.nextLine();
                    }
                }
            });

            bRocketLeagueChatModeGo.setBounds(20,530,200,50);
            bRocketLeagueChatModeGo.setFont(buttonFont);
            bRocketLeagueChatModeGo.setBackground(Color.lightGray);
            bRocketLeagueChatModeGo.setFocusable(false);
            bRocketLeagueChatModeGo.addActionListener(e -> {
                if (e.getSource()==bRocketLeagueChatModeGo) {
                    new Thread(() -> new chatMode(delay, bind1, bind2)).start();
                }
            });

            bRocketLeagueChatModeStop.setBounds(780,530,200,50);
            bRocketLeagueChatModeStop.setFont(buttonFont);
            bRocketLeagueChatModeStop.setBackground(Color.lightGray);
            bRocketLeagueChatModeStop.setFocusable(false);
            bRocketLeagueChatModeStop.addActionListener(e -> {
                if (e.getSource()==bRocketLeagueChatModeStop) {
                    System.out.println("If you want to start up the program again, run command: java -jar AntiAFK.jar");
                    System.exit(0);
                }
            });
        }
    }

    public class rocketLeagueBotMode {

        public rocketLeagueBotMode() {

            f.setContentPane(rocketLeagueBotModeMenu);
            f.repaint();

            f.add(bBack3);

            bBack3.setBounds(20,20,200,50);
            bBack3.setFont(buttonFont);
            bBack3.setBackground(Color.lightGray);
            bBack3.setFocusable(false);
            bBack3.addActionListener(e -> {
                if (e.getSource()==bBack3) {
                    new rocketLeagueModes();
                }
            });
        }
    }

    public class minecraftModes {

        public minecraftModes() {

        }
    }

    public class valorantModes {

        public valorantModes() {

        }
    }
}
