package bad;

/**
 * --------------------------------------------
 * Author: Shamodha Sahan
 * GitHub: https://github.com/shamodhas
 * Website: https://shamodha.live
 * --------------------------------------------
 * Created: 2/3/2025 10:53 AM
 * Project: SOLID
 * --------------------------------------------
 **/

// high-level module
public class Switch {
    private Bulb bulb;
    private Fan fan;

    public Switch(Bulb bulb) {
        this.bulb = bulb;
    }

    public Switch(Fan fan) {
        this.fan = fan;
    }

    public void press() {
        if (bulb != null) {
            bulb.toggle();
        } else if (fan != null) {
            fan.toggle();
        }
    }
}




