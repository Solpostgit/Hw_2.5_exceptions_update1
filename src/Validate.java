import exception.WrongLoginException;

import java.util.regex.Pattern;

public class Validate {
    String login = "Skypro_2023";
    String password = "zxCv_9876";
    String confirmPassword = "zxCv_9876";
    static final int validLength = 20;

    public Validate(String login, String password, String confirmPassword) {
        this.login = login;
        this.password = password;
        this.confirmPassword = confirmPassword;
    }

    public static void checkString (String login, String password, String confirmPassword) {
        boolean matches;
        Pattern.matches("[a-zA-Z0-9_]{1,20}", login);
    }
    public static void validLogin(String login, String password, String confirmPassword) {

        if (login.length() > validLength) {
            throw new WrongLoginException();
        }
    }
}
