package bad;

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

public class Fan {
    private boolean isOn = false;

    public void toggle(){
        isOn = !isOn;

        if (isOn){
            System.out.println("Fan is on");
        } else {
            System.out.println("Fan is off");
        }
    }
}
