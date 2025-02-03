package good;

/**
 * --------------------------------------------
 * Author: Shamodha Sahan
 * GitHub: https://github.com/shamodhas
 * Website: https://shamodha.live
 * --------------------------------------------
 * Created: 2/3/2025 11:12 AM
 * Project: SOLID
 * --------------------------------------------
 **/

public class Main {
    public static void main(String[] args) {
        Fan fan = new Fan();
        Switch fanSwitch = new Switch(fan);

        fanSwitch.press();
        fanSwitch.press();

        Tv tv = new Tv();
        Switch tvSwitch = new Switch(tv);

        tvSwitch.press();
        tvSwitch.press();
    }
}
