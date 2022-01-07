import java.util.Scanner;

public class bot {

    Scanner scanner = new Scanner(System.in);

    public bot() {
        System.out.println("hi, this is the anti afk bot.");
        decide();
    }

    //more presets might come soon, these are the main games I play so these were the most convenient.

    public void decide() {
        System.out.println("pick preset: (valorant, rocket league, minecraft)");
        String preset = scanner.nextLine();

        switch(preset) {
            case "valorant": System.out.println("loading preset " + preset);
                new presets.valorant();
                break;
            case "rocket league": System.out.println("loading preset " + preset);
                new presets.rocketLeague();
                break;
            case "minecraft": System.out.println("loading preset " + preset);
                new presets.minecraft();
                break;
            default: decide();
        }
    }
}
