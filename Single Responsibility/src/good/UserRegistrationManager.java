package good;

/**
 * --------------------------------------------
 * Author: Shamodha Sahan
 * GitHub: https://github.com/shamodhas
 * Website: https://shamodha.live
 * --------------------------------------------
 * Created: 2/3/2025 9:30 AM
 * Project: SOLID
 * --------------------------------------------
 **/

public class UserRegistrationManager {
    private LogService logService;
    private MailService mailService;
    private  UserDataService userDataService;

    public UserRegistrationManager(LogService logService, MailService mailService, UserDataService userDataService) {
        this.logService = logService;
        this.mailService = mailService;
        this.userDataService = userDataService;
    }

    public void registerUser(String username, String password){
        userDataService.saveUserData(username,password);
        mailService.sendMail(username);
        logService.logUser(username);
    }
}
