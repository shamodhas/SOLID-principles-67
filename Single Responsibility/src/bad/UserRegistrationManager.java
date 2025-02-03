package bad;

/**
 * --------------------------------------------
 * Author: Shamodha Sahan
 * GitHub: https://github.com/shamodhas
 * Website: https://shamodha.live
 * --------------------------------------------
 * Created: 2/3/2025 9:24 AM
 * Project: SOLID
 * --------------------------------------------
 **/

public class UserRegistrationManager {
    public void registerUser(String username,String password){
        saveUserData(username,password);
        sendMail(username);
        logUser(username);
    }

    private void logUser(String username) {
        System.out.println("User logged");
    }

    private void sendMail(String username) {
//        gmail server
        System.out.println("Send mail to "+username);
    }

    private void saveUserData(String username, String password) {
        System.out.println("user saved");
    }
}








