package good;

/**
 * --------------------------------------------
 * Author: Shamodha Sahan
 * GitHub: https://github.com/shamodhas
 * Website: https://shamodha.live
 * --------------------------------------------
 * Created: 2/3/2025 11:08 AM
 * Project: SOLID
 * --------------------------------------------
 **/

public class Switch {
    private Device device;

    public Switch(Device device) {
        this.device = device;
    }

    public void press(){
        device.toggle();
    }
}
