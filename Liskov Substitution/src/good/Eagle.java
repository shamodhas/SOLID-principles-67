package good;

/**
 * --------------------------------------------
 * Author: Shamodha Sahan
 * GitHub: https://github.com/shamodhas
 * Website: https://shamodha.live
 * --------------------------------------------
 * Created: 2/3/2025 10:17 AM
 * Project: SOLID
 * --------------------------------------------
 **/

public class Eagle extends Bird implements FlyingBird{
    @Override
    public void eat() {
        System.out.println("Eagle can eat");
    }

    @Override
    public void fly() {
        System.out.println("Eagle can fly");
    }
}
