package bad;

/**
 * --------------------------------------------
 * Author: Shamodha Sahan
 * GitHub: https://github.com/shamodhas
 * Website: https://shamodha.live
 * --------------------------------------------
 * Created: 2/3/2025 10:32 AM
 * Project: SOLID
 * --------------------------------------------
 **/

public class AirPlane extends Vehicle{
    @Override
    public void startEngine() {
        System.out.println("AirPlane started");
    }

    @Override
    public void move() {
        System.out.println("AirPlane move");
    }

    @Override
    public void fly() {
        System.out.println("AirPlane fly");
    }
}
