import exception.WrongLoginException;
import exception.WrongPasswordException;

public class Validator {
    private static final String LEGAL_CHARACTERS =
            "qwertyuiopasdfghjklzxcvbnmQWERTYUIOPASDFGHJKLZXCVBNM_0123456789";
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
        for (int i = 0; i < login.length(); i++) {
            if (LEGAL_CHARACTERS.indexOf(login.charAt(i)) == -1) {
                throw new WrongLoginException("login содержит недопустимые символы");
            }
        }

        if (login.length() > validLength) {
            throw new WrongLoginException("Длина login больше допустимого значения " + validLength);
        }
    }

    public static void validatePassword(String password, String confirmPassword) {
        for (int i = 0; i < password.length(); i++) {
            if (LEGAL_CHARACTERS.indexOf(password.charAt(i)) == -1) {
                throw new WrongPasswordException("password содержит недопустимые символы");
            }
        }

        if (password.length() > validLength) {
            throw new WrongPasswordException("Длина password больше допустимого значения " + validLength);
        }

        if (!password.equals(confirmPassword)) {
            throw new WrongPasswordException("password не совпадает с confirmPassword");
        }
    }
    /*
    boolean matches;
        Pattern.matches("[a-zA-Z0-9_]{1,20}", login);
        if (matches )

     */
}
