package bad;

/**
 * --------------------------------------------
 * Author: Shamodha Sahan
 * GitHub: https://github.com/shamodhas
 * Website: https://shamodha.live
 * --------------------------------------------
 * Created: 2/3/2025 10:08 AM
 * Project: SOLID
 * --------------------------------------------
 **/

public class Penguin extends Bird{
    @Override
    protected void eat() {
        System.out.println("Penguin can eat");
    }

    @Override
    void fly() {
        throw new UnsupportedOperationException("Penguin cannot fly");
    }
}
