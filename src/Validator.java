import exception.WrongLoginException;
import exception.WrongPasswordException;

import java.util.regex.Pattern;

public class Validator {
    //private static final String LEGAL_CHARACTERS = "qwertyuiopasdfghjklzxcvbnmQWERTYUIOPASDFGHJKLZXCVBNM_0123456789";

    private static final Pattern LOGIN_PASSWORD_PATTERN = Pattern.compile("[a-zA-Z_0-9]+");
    static final int validLength = 20;

    public static void validateString(
            String login,
            String password,
            String confirmPassword
    ) {
        validateLogin(login);
        validatePassword(password, confirmPassword);
    }

    public static void validateLogin(String login) {
        if (!LOGIN_PASSWORD_PATTERN.matcher(login).matches()) {
            throw new WrongLoginException("login содержит недопустимые символы");
        }
        /*
        for (int i = 0; i < login.length(); i++) {
            if (LEGAL_CHARACTERS.indexOf(login.charAt(i)) == -1) {
                throw new WrongLoginException("login содержит недопустимые символы");
            }
        }
         */
        if (login.length() > validLength) {
            throw new WrongLoginException("Длина login больше допустимого значения " + validLength);
        }
    }

    public static void validatePassword(String password, String confirmPassword) {
        if (!LOGIN_PASSWORD_PATTERN.matcher(password).matches()) {
            throw new WrongLoginException("password содержит недопустимые символы");
        }

        if (password.length() > validLength) {
            throw new WrongPasswordException("Длина password больше допустимого значения " + validLength);
        }

        if (!password.equals(confirmPassword)) {
            throw new WrongPasswordException("password не совпадает с confirmPassword");
        }
    }
}
