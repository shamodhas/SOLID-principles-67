package good;

/**
 * --------------------------------------------
 * Author: Shamodha Sahan
 * GitHub: https://github.com/shamodhas
 * Website: https://shamodha.live
 * --------------------------------------------
 * Created: 2/3/2025 11:14 AM
 * Project: SOLID
 * --------------------------------------------
 **/

public class Tv implements Device {
    private boolean isTvOn = false;

    @Override
    public void toggle() {
        isTvOn = !isTvOn;

        if (isTvOn) {
            System.out.println("Tv is on");
        } else {
            System.out.println("Tv is off");
        }
    }
}
