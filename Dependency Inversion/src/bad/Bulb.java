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

public class Bulb {
    private boolean isOn = false;

    public void toggle(){
        isOn = !isOn;

        if (isOn){
            System.out.println("Light is on");
        } else {
            System.out.println("Light is off");
        }
    }
}
