package bad;

/**
 * --------------------------------------------
 * Author: Shamodha Sahan
 * GitHub: https://github.com/shamodhas
 * Website: https://shamodha.live
 * --------------------------------------------
 * Created: 2/3/2025 10:33 AM
 * Project: SOLID
 * --------------------------------------------
 **/

public class Car extends Vehicle{
    @Override
    public void startEngine() {
        System.out.println("Car started");
    }

    @Override
    public void move() {
        System.out.println("Car move");
    }

    @Override
    public void fly() {
        throw new UnsupportedOperationException("Car cannot fly");
    }
}
