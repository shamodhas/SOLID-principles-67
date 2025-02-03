package bad;

/**
 * --------------------------------------------
 * Author: Shamodha Sahan
 * GitHub: https://github.com/shamodhas
 * Website: https://shamodha.live
 * --------------------------------------------
 * Created: 2/3/2025 10:06 AM
 * Project: SOLID
 * --------------------------------------------
 **/

public class Eagle extends Bird{
    @Override
    protected void eat() {
        System.out.println("Eagle can eating");
    }

    @Override
    void fly() {
        System.out.println("Eagle can fly");
    }
}
