package bad;

/**
 * --------------------------------------------
 * Author: Shamodha Sahan
 * GitHub: https://github.com/shamodhas
 * Website: https://shamodha.live
 * --------------------------------------------
 * Created: 2/3/2025 10:11 AM
 * Project: SOLID
 * --------------------------------------------
 **/

public class Main {
    public static void main(String[] args) {
        Bird eagle = new Eagle();
        eagle.eat();
        eagle.fly();

        Bird penguin = new Penguin();
        penguin.eat();
        penguin.fly();
    }
}
