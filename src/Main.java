import exception.WrongLoginException;
import exception.WrongPasswordException;

public class Main {
    public static void main(String[] args) {
        String login = "Skypro_2023";
        String password = "zxCv_9876";
        String confirmPassword = "zxCv_9876";

        try {
            Validator.validateString(login, password, confirmPassword);
            System.out.println("Валидация прошла успешно");
        }
        /* убрал блок в комментарий, чтобы было видно, что при вызове исключения в login,
        // выполнение программы прерывается

        catch (WrongLoginException wrongLoginException) {
            System.out.println(wrongLoginException);
        }
         */
        //исключение
        catch (WrongPasswordException wrongPasswordException) {
            wrongPasswordException.printStackTrace();
            //System.out.println(wrongPasswordException);
        }

        System.out.println("Валидация завершилась");

    }
}