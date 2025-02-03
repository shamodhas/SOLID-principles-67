package good;

/**
 * --------------------------------------------
 * Author: Shamodha Sahan
 * GitHub: https://github.com/shamodhas
 * Website: https://shamodha.live
 * --------------------------------------------
 * Created: 2/3/2025 11:00 AM
 * Project: SOLID
 * --------------------------------------------
 **/

public class Fan implements Device {
    private boolean isOn = false;

    @Override
    public void toggle() {
        isOn = !isOn;

        if (isOn) {
            System.out.println("Fan is on");
        } else {
            System.out.println("Fan is off");
        }
    }
}
