package bad;

/**
 * --------------------------------------------
 * Author: Shamodha Sahan
 * GitHub: https://github.com/shamodhas
 * Website: https://shamodha.live
 * --------------------------------------------
 * Created: 2/3/2025 10:56 AM
 * Project: SOLID
 * --------------------------------------------
 **/

public class Main {
    public static void main(String[] args) {
        Bulb bulb = new Bulb();
        Switch bulbSwitch = new Switch(bulb);
        bulbSwitch.press();
        bulbSwitch.press();

        Fan fan = new Fan();
        Switch fanSwitch = new Switch(fan);
        fanSwitch.press();
        fanSwitch.press();
    }
}
