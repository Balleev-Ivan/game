import service.Game;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        System.out.println("Привет народ!");
        Game game = new Game();
        game.playstart();
    }
}
