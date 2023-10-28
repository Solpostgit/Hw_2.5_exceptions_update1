import exception.WrongLoginException;

public class Main {
    public static void main(String[] args) {
        String login = "Skypro_2023";
        String password = "zxCv_9876";
        String confirmPassword = "zxCv_9876";

        Validator.validateString(login, password, confirmPassword);

    }


}